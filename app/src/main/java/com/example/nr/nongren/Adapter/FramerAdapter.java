package com.example.nr.nongren.Adapter;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.nr.nongren.Activity.ShopActivity;
import com.example.nr.nongren.Bean.FarmerRelation;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;
/**
 * Created by hjw on 2016/7/22.
 */
public class FramerAdapter extends SwipeRecyclerViewAdapter {
    private Context context;
    private List<FarmerRelation>list;
    public FramerAdapter(Context context,List<FarmerRelation>list){
        this.list = list;
        this.context = context;
    }
    @Override
    public int GetItemCount() {
        return list.size();
    }
    @Override
    public RecyclerView.ViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM) {
            View view = LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.farm_circle_item, null);
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));
            return new MyViewHolder(view);
        }
        return null;
    }
    @Override
    public void onBindItemViewHolder(RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof MyViewHolder) {
            HttpUtils.downloadPic(list.get(position).getUserMicroAvatar()
                    , ((MyViewHolder) holder).mCircleView, context);
            ((MyViewHolder) holder).textView1.setText(list.get(position).getUserName());
            ((MyViewHolder) holder).textView2.setText(list.get(position).getContent());
            ((MyViewHolder) holder).textView3.setText(list.get(position).getProductTitle());
            // if ()
            if(list.get(position).getPictureNum()>=1&&list.get(position).getPictureNum()<=3){
                ((MyViewHolder) holder).imageView4.setVisibility(View.GONE);
                ((MyViewHolder) holder).imageView5.setVisibility(View.GONE);
                ((MyViewHolder) holder).imageView6.setVisibility(View.GONE);
                ((MyViewHolder) holder).imageView7.setVisibility(View.GONE);
                ((MyViewHolder) holder).imageView8.setVisibility(View.GONE);
                ((MyViewHolder) holder).imageView9.setVisibility(View.GONE);
                switch (list.get(position).getPictureNum()){
                    case 1:
                        ((MyViewHolder) holder).imageView2.setVisibility(View.GONE);
                        ((MyViewHolder) holder).imageView3.setVisibility(View.GONE);
                        HttpUtils.downloadPic(list.get(position).getList().get(0).getUrl()
                                , ((MyViewHolder) holder).imageView1,context);
                        break;
                    case 2:
                        ((MyViewHolder) holder).imageView3.setVisibility(View.GONE);
                        HttpUtils.downloadPic(list.get(position).getList().get(0).getUrl()
                                , ((MyViewHolder) holder).imageView1,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(1).getUrl()
                                , ((MyViewHolder) holder).imageView2,context);
                        break;
                    case 3:
                        HttpUtils.downloadPic(list.get(position).getList().get(0).getUrl()
                                , ((MyViewHolder) holder).imageView1,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(1).getUrl()
                                , ((MyViewHolder) holder).imageView2,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(2).getUrl()
                                , ((MyViewHolder) holder).imageView3,context);
                        break;
                }
            }else  if (list.get(position).getPictureNum()>=4&&list.get(position).getPictureNum()<=6){
                ((MyViewHolder) holder).imageView7.setVisibility(View.GONE);
                ((MyViewHolder) holder).imageView8.setVisibility(View.GONE);
                ((MyViewHolder) holder).imageView9.setVisibility(View.GONE);
                switch (list.get(position).getPictureNum()){
                    case 4:
                        HttpUtils.downloadPic(list.get(position).getList().get(0).getUrl()
                                , ((MyViewHolder) holder).imageView1,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(1).getUrl()
                                , ((MyViewHolder) holder).imageView2,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(2).getUrl()
                                , ((MyViewHolder) holder).imageView3,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(3).getUrl()
                                , ((MyViewHolder) holder).imageView4,context);
                        ((MyViewHolder) holder).imageView5.setVisibility(View.INVISIBLE);
                        ((MyViewHolder) holder).imageView6.setVisibility(View.INVISIBLE);
                        break;
                    case 5:
                        HttpUtils.downloadPic(list.get(position).getList().get(0).getUrl()
                                , ((MyViewHolder) holder).imageView1,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(1).getUrl()
                                , ((MyViewHolder) holder).imageView2,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(2).getUrl()
                                , ((MyViewHolder) holder).imageView3,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(3).getUrl()
                                , ((MyViewHolder) holder).imageView4,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(4).getUrl()
                                , ((MyViewHolder) holder).imageView5, context);
                        ((MyViewHolder) holder).imageView6.setVisibility(View.INVISIBLE);
                        break;
                    case 6:
                        HttpUtils.downloadPic(list.get(position).getList().get(0).getUrl()
                                , ((MyViewHolder) holder).imageView1,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(1).getUrl()
                                , ((MyViewHolder) holder).imageView2,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(2).getUrl()
                                , ((MyViewHolder) holder).imageView3,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(3).getUrl()
                                , ((MyViewHolder) holder).imageView4,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(4).getUrl()
                                , ((MyViewHolder) holder).imageView5,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(5).getUrl()
                                , ((MyViewHolder) holder).imageView6,context);
                        break;
                }
            }else {
                switch (list.get(position).getPictureNum()){
                    case 7:
                        HttpUtils.downloadPic(list.get(position).getList().get(0).getUrl()
                                , ((MyViewHolder) holder).imageView1,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(1).getUrl()
                                , ((MyViewHolder) holder).imageView2,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(2).getUrl()
                                , ((MyViewHolder) holder).imageView3,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(3).getUrl()
                                , ((MyViewHolder) holder).imageView4,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(4).getUrl()
                                , ((MyViewHolder) holder).imageView5,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(5).getUrl()
                                , ((MyViewHolder) holder).imageView6,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(6).getUrl()
                                , ((MyViewHolder) holder).imageView7,context);
                        ((MyViewHolder) holder).imageView8.setVisibility(View.INVISIBLE);
                        ((MyViewHolder) holder).imageView9.setVisibility(View.INVISIBLE);
                        break;
                    case 8:
                        HttpUtils.downloadPic(list.get(position).getList().get(0).getUrl()
                                , ((MyViewHolder) holder).imageView1,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(1).getUrl()
                                , ((MyViewHolder) holder).imageView2,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(2).getUrl()
                                , ((MyViewHolder) holder).imageView3,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(3).getUrl()
                                , ((MyViewHolder) holder).imageView4,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(4).getUrl()
                                , ((MyViewHolder) holder).imageView5,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(5).getUrl()
                                , ((MyViewHolder) holder).imageView6,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(6).getUrl()
                                , ((MyViewHolder) holder).imageView7,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(7).getUrl()
                                , ((MyViewHolder) holder).imageView8,context);
                        ((MyViewHolder) holder).imageView9.setVisibility(View.INVISIBLE);
                        break;
                    case 9:
                        HttpUtils.downloadPic(list.get(position).getList().get(0).getUrl()
                                , ((MyViewHolder) holder).imageView1,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(1).getUrl()
                                , ((MyViewHolder) holder).imageView2,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(2).getUrl()
                                , ((MyViewHolder) holder).imageView3,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(3).getUrl()
                                , ((MyViewHolder) holder).imageView4,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(4).getUrl()
                                , ((MyViewHolder) holder).imageView5,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(5).getUrl()
                                , ((MyViewHolder) holder).imageView6,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(6).getUrl()
                                , ((MyViewHolder) holder).imageView7,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(7).getUrl()
                                , ((MyViewHolder) holder).imageView8,context);
                        HttpUtils.downloadPic(list.get(position).getList().get(8).getUrl()
                                , ((MyViewHolder) holder).imageView9,context);
                        break;
                }
            }
            if (list.get(position).getShopId()<0){
                 ((MyViewHolder) holder).mALayout.setVisibility(View.GONE);
            }else{
                HttpUtils.downloadPic(list.get(position).getShopfirstPicture(),
                        ((MyViewHolder) holder).imageView11,context);
                ((MyViewHolder) holder).textView5.setText(list.get(position).getShopTitle());
            }
            ((MyViewHolder) holder).textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, ShopActivity.class);
                    int id=list.get(position).getId();
                    intent.putExtra("id",id);
                    context.startActivity(intent);
                }
            });
            ((MyViewHolder) holder).textView5.setText(list.get(position).getTimeDifference()+"前");
            ((MyViewHolder) holder).textView6.setText(list.get(position).getPraiseTimes());
        }

    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        Button button;
        LinearLayout mALayout;
        CircleImageView mCircleView;
        ImageView imageView1,imageView2,imageView3,imageView4,imageView5,
                imageView6,imageView7,imageView8,imageView9,imageView10,imageView11;
        TextView textView1,textView2,textView3,textView4,textView5,textView6, button1;
        public MyViewHolder(View itemView) {
            super(itemView);
            mALayout = (LinearLayout)itemView.findViewById(R.id.buy_layout);
            imageView1 = (ImageView) itemView.findViewById(R.id.avator_image_iv1);
            imageView2 = (ImageView)itemView.findViewById(R.id.avator_image_iv2);
            imageView3 = (ImageView)itemView.findViewById(R.id.avator_image_iv3);
            imageView4 = (ImageView)itemView.findViewById(R.id.avator_image_iv4);
            imageView5 = (ImageView)itemView.findViewById(R.id.avator_image_iv5);
            imageView6 = (ImageView)itemView.findViewById(R.id.avator_image_iv6);
            imageView7 = (ImageView)itemView.findViewById(R.id.avator_image_iv7);
            imageView8 = (ImageView)itemView.findViewById(R.id.avator_image_iv8);
            imageView9 = (ImageView)itemView.findViewById(R.id.avator_image_iv9);
            imageView10 = (ImageView)itemView.findViewById(R.id.point_farmer);
            imageView11 = (ImageView)itemView.findViewById(R.id.thumilb_iv);
            mCircleView = ((CircleImageView) itemView.findViewById(R.id.icon_avator_cv));
            textView1 = ((TextView) itemView.findViewById(R.id.name_avator_tv));
            textView2 = ((TextView) itemView.findViewById(R.id.avator_content_tv));
            textView3 = (TextView)itemView.findViewById(R.id.title_tv);
            textView4 = (TextView)itemView.findViewById(R.id.buy_farm_circle_tv);//点击事件
            textView5 = (TextView)itemView.findViewById(R.id.time_farmer_tv);
            textView6 = (TextView)itemView.findViewById(R.id.point_count);
            //button1 = (TextView)itemView.findViewById(R.id.shop_btn);
            button= (Button)itemView.findViewById(R.id.shop_btn);
        }
    }
}
