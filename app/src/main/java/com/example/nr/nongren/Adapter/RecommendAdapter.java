package com.example.nr.nongren.Adapter;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.example.nr.nongren.Bean.Recommend;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import java.util.List;
/**
 * Created by hjw on 2016/7/19.
 */
public class RecommendAdapter extends RecyclerView.Adapter<RecommendAdapter.MyViewHolder> {
    private Context context;
    private List<Recommend.ProductsBean>list;
    public RecommendAdapter(Context context,List<Recommend.ProductsBean>list){
        this.context = context;
        this.list = list;
    }
    @Override
    public RecommendAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(context
                ).inflate(R.layout.shop_item, parent,
                false));
        return holder;
    }

    @Override
    public void onBindViewHolder(final RecommendAdapter.MyViewHolder holder, final int position) {
        holder.nameTextView.setText(list.get(position).getSeller_name());
        holder.titleTextView.setText(list.get(position).getTitle());
        holder.numberTextView.setText("￥"+list.get(position).getPrice());
        holder.whereTextView.setText(list.get(position).getOrigin());
        holder.saleCountTextView.setText("销量："+String.valueOf(list.get(position).getSales()));
        holder.scoreTextView.setText(list.get(position).getReview().getRating());
        HttpUtils.downloadPic(list.get(position).getThumbnail(), holder.shopImageView, context);
        HttpUtils.downloadPic(list.get(position).getSeller_avatar(), holder.iconImageView, context);
        double count = Double.parseDouble(list.get(position).getReview().getRating());
        int num = (int)count;
        holder.ratingBar.setProgress(num);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class  MyViewHolder extends RecyclerView.ViewHolder{
        TextView nameTextView,saleCountTextView,titleTextView,numberTextView,scoreTextView,whereTextView;
        ImageView shopImageView,iconImageView;
        RatingBar ratingBar;
        public MyViewHolder(View itemView) {
            super(itemView);
            nameTextView =((TextView) itemView.findViewById(R.id.item_name_tv));
            saleCountTextView = ((TextView) itemView.findViewById(R.id.item_count_tv));
            titleTextView = ((TextView) itemView.findViewById(R.id.item_title_tv));
            numberTextView=((TextView) itemView.findViewById(R.id.number_item_tv));
            scoreTextView=((TextView) itemView.findViewById(R.id.score_item_tv));
            whereTextView=((TextView) itemView.findViewById(R.id.where_item_tv));
            shopImageView = (ImageView) itemView.findViewById(R.id.item_shop_thing);
            iconImageView = (ImageView) itemView.findViewById(R.id.item_icon_iv);
            ratingBar = (RatingBar) itemView.findViewById(+R.id.room_ratingbar);

        }
    }
}
