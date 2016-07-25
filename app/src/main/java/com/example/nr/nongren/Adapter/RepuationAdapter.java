package com.example.nr.nongren.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nr.nongren.Bean.RepuationDetails;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by hjw on 2016/7/20.
 */
public class RepuationAdapter extends RecyclerView.Adapter<RepuationAdapter.MyViewHolder> {
    private Context context;
    private List<RepuationDetails.ProductsBean>list;
    public RepuationAdapter(Context context,List<RepuationDetails.ProductsBean>list){
        this.context =context;
        this.list = list;
    }
    @Override
    public RepuationAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(context
        ).inflate(R.layout.repuation_item, parent,
                false));
        return holder;
    }

    @Override
    public void onBindViewHolder(RepuationAdapter.MyViewHolder holder, int position) {
        holder.whereTextView.setText(list.get(position).getSeller_name()+" ");
        holder.whereTextView.append(list.get(position).getOrigin());
        holder.numberTextView.append(list.get(position).getPrice());
        holder.weightTextView.setText(list.get(position).getUnit());
        holder.nameTextView.setText(list.get(position).getTitle());
        HttpUtils.downloadPic(list.get(position).getSeller_avatar(),holder.iconImage,context);
        HttpUtils.downloadPic(list.get(position).getThumbnail(),holder.shopImage,context);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class  MyViewHolder extends RecyclerView.ViewHolder{
         TextView nameTextView;
         TextView numberTextView;
         TextView whereTextView;
         TextView weightTextView;
         CircleImageView iconImage;
         ImageView shopImage;


        public MyViewHolder(View itemView) {
            super(itemView);
            shopImage=((ImageView) itemView.findViewById(R.id.repu_shop_thing));
            iconImage = ((CircleImageView) itemView.findViewById(R.id.repu_icon_iv));
            nameTextView = ((TextView) itemView.findViewById(R.id.repu_name_tv));
            numberTextView = ((TextView) itemView.findViewById(R.id.repu_number_tv));
            whereTextView = ((TextView) itemView.findViewById(R.id.repu_where_tv));
            weightTextView = ((TextView) itemView.findViewById(R.id.repu_weight_tv));
        }
    }
}
