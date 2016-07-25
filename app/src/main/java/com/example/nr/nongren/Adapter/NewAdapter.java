package com.example.nr.nongren.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.nr.nongren.Bean.NewDetails;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by hjw on 2016/7/20.
 */
public class NewAdapter extends RecyclerView.Adapter<NewAdapter.MyViewHolder>  {
    private Context context;
    private List<NewDetails.ProductsBean> list;
    public NewAdapter(Context context,List<NewDetails.ProductsBean>list){
        this.context =context;
        this.list = list;
    }
    @Override
    public NewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(context
        ).inflate(R.layout.new_item, parent,
                false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.whereTextView.setText(list.get(position).getSeller_name()+" ");
        holder.whereTextView.append(list.get(position).getOrigin());
        holder.numberTextView.append(list.get(position).getPrice());
        holder.weightTextView.setText(list.get(position).getUnit());
        holder.titleTextView.setText(list.get(position).getTitle());
        HttpUtils.downloadPic(list.get(position).getSeller_avatar(), holder.iconImage, context);
        HttpUtils.downloadPic(list.get(position).getThumbnail(),holder.shopImage,context);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

     class MyViewHolder extends RecyclerView.ViewHolder{
         TextView titleTextView;
         TextView numberTextView;
         TextView whereTextView;
         TextView weightTextView;
         CircleImageView iconImage;
         ImageView shopImage;
         public MyViewHolder(View itemView) {
             super(itemView);
             shopImage=((ImageView) itemView.findViewById(R.id.new_shop_thing));
             iconImage = ((CircleImageView) itemView.findViewById(R.id.new_icon_iv));
             titleTextView = ((TextView) itemView.findViewById(R.id.new_title_tv));
             numberTextView = ((TextView) itemView.findViewById(R.id.new_number_tv));
             whereTextView = ((TextView) itemView.findViewById(R.id.new_where_name_tv));
             weightTextView = ((TextView) itemView.findViewById(R.id.new_weight_tv));
         }
     }
}
