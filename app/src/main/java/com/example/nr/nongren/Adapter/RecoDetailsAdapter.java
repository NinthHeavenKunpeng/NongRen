package com.example.nr.nongren.Adapter;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.example.nr.nongren.Bean.ShopRecommend;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import java.util.List;
/**
 * Created by hjw on 2016/7/22.
 */
public class RecoDetailsAdapter extends SwipeRecyclerViewAdapter {
    private List<ShopRecommend.ProductsBean>list;
    private Context context;
    public RecoDetailsAdapter(Context context,List<ShopRecommend.ProductsBean>list){
        this.context = context;
        this.list = list;
    }
    @Override
    public int GetItemCount() {
        return list.size();
    }
    @Override
    public RecyclerView.ViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM) {
            View view = LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.shop_recomm_item, null);
            view.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
                    LayoutParams.WRAP_CONTENT));
            return new MyViewHolder(view);
        }
        return null;
    }
    @Override
    public void onBindItemViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MyViewHolder) {
            ((MyViewHolder) holder).textView1.setText(list
                    .get(position).getTitle());
            ((MyViewHolder) holder).textView2.setText(list
                    .get(position).getOrigin());
            ((MyViewHolder) holder).textView3.setText(list
                    .get(position).getReview().getRating());
            ((MyViewHolder) holder).textView4.setText("("+list
                    .get(position).getMonth_purchase_times()+"人付款)");
            ((MyViewHolder) holder).textView5.setText("￥"+list
                    .get(position).getPrice());
            ((MyViewHolder) holder).textView6.setText("/"+list
                    .get(position).getUnit());
            ((MyViewHolder) holder).textView7.setText(list
                    .get(position).getSeller_name());
            HttpUtils.downloadPic(list.get(position).getThumbnail(), ((MyViewHolder) holder).imageView1, context);
            HttpUtils.downloadPic(list.get(position).getSeller_avatar(),((MyViewHolder) holder).imageView2,context);
        }
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        RatingBar ratingBar;
        ImageView imageView1,imageView2;
        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageView1 = ((ImageView) itemView.findViewById(R.id.image_item));
            imageView2 = (ImageView)itemView.findViewById(R.id.avator_icon_iv);
            textView1 = ((TextView) itemView.findViewById(R.id.reco_title_act));
            textView2 = ((TextView) itemView.findViewById(R.id.reco_where_tv));
            textView3 = (TextView)itemView.findViewById(R.id.reco_count_item_tv);
            textView4 = (TextView)itemView.findViewById(R.id.buy_number_tv);
            textView5 = (TextView)itemView.findViewById(R.id.money_number_tv);
            textView6 = (TextView)itemView.findViewById(R.id.weight_number_tv);
            textView7 = (TextView)itemView.findViewById(R.id.reco_name_tv);
            ratingBar = ((RatingBar)itemView.findViewById(R.id.reco_ratingbar));
        }
    }
}
