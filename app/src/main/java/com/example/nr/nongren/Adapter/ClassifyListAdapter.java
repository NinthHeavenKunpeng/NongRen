package com.example.nr.nongren.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.nr.nongren.Bean.ClassListBean;
import com.example.nr.nongren.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by aa on 2016/7/19.
 */
public class ClassifyListAdapter extends BaseAdapter {
    private Context context;
    private List<ClassListBean.ProductsBean> list;
    private Picasso picasso;

    public ClassifyListAdapter(Context context, List<ClassListBean.ProductsBean> list) {
        this.context = context;
        this.list = list;
       // Log.e("AAAAAAAAA", "onSuccess: "+list.get(0).getPicture() );
    }
    public void addDatas(List<ClassListBean.ProductsBean> data){
        list.addAll(data);
        notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return list != null ? list.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.itemlayout, parent, false);
           // Log.e("AAAAAAAAA", "onSuccess: "+list.get(0).getPicture() );
            viewHolder = new ViewHolder();
            // viewHolder.icon = (ImageView) convertView.findViewById(R.id.id_iv);
            viewHolder.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.tv_peoplename = (TextView) convertView.findViewById(R.id.tv_peoplename);
            viewHolder.tv_price = (TextView) convertView.findViewById(R.id.tv_price);
            viewHolder.ivfirst = (ImageView) convertView.findViewById(R.id.ivfirst);
            viewHolder.iv_peopleiv = (ImageView) convertView.findViewById(R.id.iv_peopleiv);
            viewHolder.ratingBar = (RatingBar) convertView.findViewById(R.id.ratingBar);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //Log.e("AAAAAAAAA", "onSuccess: "+list.get(0).getPicture() );
        viewHolder.tv_name.setText(list.get(position).getTitle());
        viewHolder.tv_peoplename.setText(list.get(position).getSeller_name());

        viewHolder.tv_price.setText(list.get(position).getPrice());
        String url01=list.get(position).getPicture();
        String url02=list.get(position).getSeller_avatar();
        picasso.with(context)
                .load(url01)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .centerCrop()
                .resize(100, 100)
                .config(Bitmap.Config.ALPHA_8)
                .into(viewHolder.ivfirst);
       picasso.with(context)
                .load(url02)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .centerCrop()
               .resize(50, 50)
                .config(Bitmap.Config.ALPHA_8)
                .into(viewHolder.iv_peopleiv);

        return convertView;
    }

    class ViewHolder {
        ImageView ivfirst, iv_peopleiv;
        TextView tv_name, tv_address, tv_paynumbe, tv_price, tv_peoplename;
        RatingBar ratingBar;
    }
}
