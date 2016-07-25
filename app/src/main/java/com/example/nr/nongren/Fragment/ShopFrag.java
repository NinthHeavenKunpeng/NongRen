package com.example.nr.nongren.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.example.nr.nongren.Activity.WhereActivity;
import com.example.nr.nongren.Adapter.MyFragmentAdapter;
import com.example.nr.nongren.Api.ContentApi;
import com.example.nr.nongren.Bean.ShopThing;
import com.example.nr.nongren.MyView.LineView;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;
/**
 * Created by hjw on 2016/7/22.
 */
public class ShopFrag extends Fragment {
    private ImageView[] icons;
    private ImageView [] imageViews = new ImageView[5];
    private ViewPager mShopViewPager,mViewPager;
    private String url,json;
    private List<Fragment> list;
    private List<String>listImage;
    private List<ImageView> dataImage;
    private LineView orignLineView;
    private TabLayout mTabLayout;
    private Button mCommentButton,mEnterButton;
    private RatingBar mRatingBar1,mRatingBar2,mRatingBar3;
    private ImageView mShowImage1,mShowImage2,mShowImage3,mShowImage4;
    private CircleImageView mCirImageView1,mCirImageView2,mCirImageView3;
    private MyFragmentAdapter adapter;
    private TextView mTitleTextView,whereTextView,moneyTextView,weightTextView,
            mRbTextView,mRecommTextView,mSaleTextView,mDescTextView,mSizeTextView
            ,mDestionTextView, mCostWhereTextView,mAlongTextView, mCommentTextView
            ,mCustomeNameTextView,mDateTextView,mNongRenAnsTextView1,mNongRenAnsTextView2
            ,mDateTextView1, mCustomeNameTextView1,mContentTextView,mContentTextView1,
            mShopSizeTextView,mShopSizeTextView1,mSallerNameTextView,mTimeTextView,
            mContentShopTextView,mtext;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.shop_infor_item,container,false);
        mShopViewPager = (ViewPager)view. findViewById(R.id.shop_act_vp);
        mTitleTextView= (TextView)view. findViewById(R.id.title_act_tv);
        orignLineView=(LineView)view.findViewById(R.id.original_act_tv);
        whereTextView=(TextView)view.findViewById(R.id.where_act_tv);
        moneyTextView=(TextView)view.findViewById(R.id.money_act_tv);
        weightTextView=(TextView)view.findViewById(R.id.weight_act_tv);
        mRatingBar1=(RatingBar)view.findViewById(R.id.shop_act_rb);
        mRbTextView=(TextView)view.findViewById(R.id.rb_number_tv);
        mRecommTextView=(TextView)view.findViewById(R.id.recomm_count_tv);
        mSaleTextView=(TextView)view.findViewById(R.id.sale_count_act_tv);
        mDescTextView=(TextView)view.findViewById(R.id.details_act_tv);
        mSizeTextView=(TextView)view.findViewById(R.id.size_act_btn);
        mDestionTextView=(TextView)view.findViewById(R.id.dest_act_btn);
        mCostWhereTextView=(TextView)view.findViewById(R.id.cost_where_btn);
        mAlongTextView=(TextView)view.findViewById(R.id.along_say_tv);
        mCommentTextView=(TextView)view.findViewById(R.id.comment_count_tv);
        mCirImageView1=((CircleImageView)view. findViewById(R.id.icon_act_cv1));
        mCirImageView2=((CircleImageView) view.findViewById(R.id.icon_act_cv2));
        mCustomeNameTextView=(TextView)view.findViewById(R.id.custome_name_tv);
        mCustomeNameTextView1=(TextView)view.findViewById(R.id.custome_name_tv1);
        mRatingBar2=(RatingBar)view.findViewById(R.id.custome_comment_rb);
        mRatingBar3=(RatingBar)view.findViewById(R.id.custome_comment_rb1);
        mDateTextView=(TextView)view.findViewById(R.id.date_comment_tv);
        mDateTextView1=(TextView)view.findViewById(R.id.date_comment_tv1);
        mNongRenAnsTextView2=(TextView)view.findViewById(R.id.answer_act_tv2);
        mNongRenAnsTextView1=(TextView)view.findViewById(R.id.answer_act_tv1);
        mContentTextView=(TextView)view.findViewById(R.id.content_comment_tv);
        mContentTextView1=(TextView)view.findViewById(R.id.content_comment_tv1);
        mShopSizeTextView=(TextView)view.findViewById(R.id.size_comment_tv);
        mShopSizeTextView1=(TextView)view.findViewById(R.id.size_comment_tv1);
        mCommentButton=(Button)view.findViewById(R.id.comment_act_btn);
        mCirImageView3=((CircleImageView)view. findViewById(R.id.saller_act_civ));
        mEnterButton=(Button)view.findViewById(R.id.enter_act_btn);
        mSallerNameTextView=(TextView)view.findViewById(R.id.saller_name_tv);
        mTimeTextView=(TextView)view.findViewById(R.id.time_act_tv);
        mContentShopTextView=(TextView)view.findViewById(R.id.content_act_tv);
        mShowImage1=(ImageView)view.findViewById(R.id.show_act_iv1);
        mShowImage2=(ImageView)view.findViewById(R.id.show_act_iv2);
        mShowImage3=(ImageView)view.findViewById(R.id.show_act_iv3);
        mShowImage4=(ImageView)view.findViewById(R.id.show_act_iv4);
        mTabLayout=((TabLayout)view. findViewById(R.id.tab_act_shop));
        mViewPager = (ViewPager)view.findViewById(R.id.details_shop_vp);
        mtext = (TextView)view.findViewById(R.id.farmer_text);
        listImage = new ArrayList<String>();
        dataImage= new ArrayList<ImageView>();
        list = new ArrayList<Fragment>();
        Intent intent =getActivity().getIntent();
        int id=intent.getIntExtra("id",0);
        //此处需要改
        url = String.format(ContentApi.HOME_SHOP_DETAILS_URL,id);
        HttpUtils.downloadJson(getActivity(), url, new HttpUtils.ResultCallBack() {
            @Override
            public void onSuccess(String s) {
                json = s;
                Gson gson = new Gson();
                ShopThing shopThing = gson.fromJson(json, ShopThing.class);
                listImage = shopThing.getPictures();
                boolean flag = shopThing.isIsLimitedPromotion();
                if (flag == true) {
                    mTitleTextView.setText("限时促销" + shopThing.getTitle().toString());
                    orignLineView.setText(shopThing.getOrigin_anong_price().toString());
                } else {
                    mTitleTextView.setText(shopThing.getTitle().toString());
                    orignLineView.setVisibility(View.GONE);
                }
                whereTextView.append(shopThing.getOrigin().toString());
                moneyTextView.append(shopThing.getPrice());
                weightTextView.setText(" " + shopThing.getUnit());
                mRbTextView.setText("  " + String.valueOf(shopThing.getReview().getRating()));
                mRecommTextView.setText("    " + shopThing.getReview().getCount() + "人评价");
                mSaleTextView.append(shopThing.getSales());
                mDescTextView.setText(shopThing.getNotification());
                mSizeTextView.setText(shopThing.getSubProducts().get(0).getType());
                mDestionTextView.setText(shopThing.getShippingFee().getDestination().getProvince()
                        + ">" + shopThing.getShippingFee().getDestination().getCity() + ">" +
                        shopThing.getShippingFee().getDestination().getCounty());
                if (shopThing.getShippingFee().getNoFeeType() == 0) {
                    mCostWhereTextView.setText("包邮");
                } else {
                    mCostWhereTextView.setText(shopThing.getShippingFee().getBaseShippingFee() + "元"
                            + " (满" + shopThing.getShippingFee().getNoFeeMoney() + "元包邮");
                }
                //阿农说控制
                if (shopThing.getAnongView().toString().isEmpty()) {
                    LinearLayout mNLayout = (LinearLayout) view.findViewById(R.id.along_say_layout);
                    mNLayout.setVisibility(View.GONE);
                    mtext.setVisibility(View.GONE);
                    mAlongTextView.setVisibility(View.GONE);

                } else {
                    mAlongTextView.setText(shopThing.getAnongView());
                }
                //评论晒单控制
                if (shopThing.getLatestReviews().size() > 0) {
                    mCommentTextView.setText(String.valueOf(shopThing.getReview().getCount()));
                    if (!shopThing.getLatestReviews().get(0).getAvatar_url().isEmpty()) {
                        HttpUtils.downloadPic(shopThing.getLatestReviews().get(0).getAvatar_url(), mCirImageView1, getActivity());
                    } else {
                        mCirImageView1.setImageResource(R.drawable.noname);
                    }
                    mCustomeNameTextView.setText(shopThing.getLatestReviews().get(0).getUser());
                    mDateTextView.setText(shopThing.getLatestReviews().get(0).getCreated_at());
                    mContentTextView.setText(shopThing.getLatestReviews().get(0).
                            getProduct_reviews().get(0).getContent());
                    if (shopThing.getLatestReviews().get(0).getProduct_reviews().
                            get(0).getProductReviewReplies().size() > 0) {

                        mNongRenAnsTextView1.setText("农人回复："+shopThing.getLatestReviews().get(0).getProduct_reviews().
                                get(0).getProductReviewReplies().get(0).getReply_content());
                    } else {
                        mNongRenAnsTextView1.setHeight(0);
                        mNongRenAnsTextView1.setVisibility(View.GONE);
                    }
                    mShopSizeTextView.setText(shopThing.getLatestReviews().get(0).getProduct_type());
                    //评论2内容
                    if (!shopThing.getLatestReviews().get(1).getUser().equals("匿名用户")) {
                        HttpUtils.downloadPic(shopThing.getLatestReviews().get(1).getAvatar_url(), mCirImageView2, getActivity());
                    } else {
                        mCirImageView2.setImageResource(R.drawable.noname);
                    }
                    mCustomeNameTextView1.setText(shopThing.getLatestReviews().get(1).getUser());
                    mDateTextView1.setText(shopThing.getLatestReviews().get(1).getCreated_at());
                    mContentTextView1.setText(shopThing.getLatestReviews().get(1).
                            getProduct_reviews().get(0).getContent());
                    mShopSizeTextView1.setText(shopThing.getLatestReviews().get(1).getProduct_type());
                    if (shopThing.getLatestReviews().get(1).getProduct_reviews().
                            get(0).getProductReviewReplies().size() > 0) {
                        mNongRenAnsTextView2.setText("农人回复："+shopThing.getLatestReviews().get(1).getProduct_reviews().
                                get(0).getProductReviewReplies().get(0).getReply_content());
                    } else {
                        mNongRenAnsTextView2.setHeight(1);
                        mNongRenAnsTextView2.setVisibility(View.INVISIBLE);
                    }
                } else {
                    LinearLayout mCLayout = (LinearLayout)view. findViewById(R.id.comment_layout);
                    mCLayout.setVisibility(View.GONE);
                    View line = ((View)view .findViewById(R.id.view1));
                    View line1 = ((View) view.findViewById(R.id.view2));
                    line.setVisibility(View.GONE);
                    line1.setVisibility(View.GONE);
                }
                //进入店铺
                HttpUtils.downloadPic(shopThing.getSellerAvatar(), mCirImageView3, getActivity());
                mSallerNameTextView.setText(shopThing.getShop().getName());
                //店铺动态
                if (!shopThing.getFarmerDynamicInfo().getTimeDifference().isEmpty()) {
                    mTimeTextView.setText("发表于" + shopThing.getFarmerDynamicInfo().getTimeDifference() + "前");
                    mContentShopTextView.setText(shopThing.getFarmerDynamicInfo().getContent());
                    int imageSize = shopThing.getFarmerDynamicInfo().getPicture_num();
                    switch (imageSize) {
                        case 4:
                            HttpUtils.downloadPic(shopThing.getFarmerDynamicInfo().getPictures()
                                    .get(0), mShowImage1, getActivity());
                            HttpUtils.downloadPic(shopThing.getFarmerDynamicInfo().getPictures()
                                    .get(1), mShowImage2, getActivity());
                            HttpUtils.downloadPic(shopThing.getFarmerDynamicInfo().getPictures()
                                    .get(2), mShowImage3, getActivity());
                            HttpUtils.downloadPic(shopThing.getFarmerDynamicInfo().getPictures()
                                    .get(3), mShowImage4, getActivity());
                            break;
                        case 3:
                            HttpUtils.downloadPic(shopThing.getFarmerDynamicInfo().getPictures()
                                    .get(0), mShowImage1, getActivity());
                            HttpUtils.downloadPic(shopThing.getFarmerDynamicInfo().getPictures()
                                    .get(1), mShowImage2, getActivity());
                            HttpUtils.downloadPic(shopThing.getFarmerDynamicInfo().getPictures()
                                    .get(2), mShowImage3,getActivity());
                            mShowImage4.setVisibility(View.INVISIBLE);
                            break;
                        case 2:
                            HttpUtils.downloadPic(shopThing.getFarmerDynamicInfo().getPictures()
                                    .get(0), mShowImage1, getActivity());
                            HttpUtils.downloadPic(shopThing.getFarmerDynamicInfo().getPictures()
                                    .get(1), mShowImage2, getActivity());
                            mShowImage3.setVisibility(View.INVISIBLE);
                            mShowImage4.setVisibility(View.INVISIBLE);
                            break;
                        case 1:
                            HttpUtils.downloadPic(shopThing.getFarmerDynamicInfo().getPictures()
                                    .get(0), mShowImage1, getActivity());
                            mShowImage2.setVisibility(View.INVISIBLE);
                            mShowImage3.setVisibility(View.INVISIBLE);
                            mShowImage4.setVisibility(View.INVISIBLE);
                            break;
                        case 0:
                            mShowImage1.setVisibility(View.INVISIBLE);
                            mShowImage2.setVisibility(View.INVISIBLE);
                            mShowImage3.setVisibility(View.INVISIBLE);
                            mShowImage4.setVisibility(View.INVISIBLE);
                            LinearLayout mILayout = (LinearLayout)view. findViewById(R.id.details_layout);
                            ViewGroup.LayoutParams lp1 = mILayout.getLayoutParams();
                            lp1.height = 0;
                            mILayout.setLayoutParams(lp1);
                            mILayout.setVisibility(View.INVISIBLE);
                            break;
                    }
                } else {
                    LinearLayout mALayout = (LinearLayout)view. findViewById(R.id.act_layout);
                    mALayout.setVisibility(View.GONE);
                }
                int size = listImage.size();
                switch (size) {
                    case 5:
                        for (int i = 0; i < 5; i++) {
                            ImageView iv = new ImageView(getActivity());
                            iv.setScaleType(ImageView.ScaleType.FIT_XY);
                            String url = listImage.get(i).toString();
                            HttpUtils.downloadPic(url, iv, getActivity());
                            dataImage.add(iv);
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    MyAdapter adapter = new MyAdapter();
                                    mShopViewPager.setAdapter(adapter);
                                }
                            });
                        }
                        break;
                    case 4:
                        for (int i = 0; i < 4; i++) {
                            ImageView iv = new ImageView(getActivity());
                            iv.setScaleType(ImageView.ScaleType.FIT_XY);
                            String url = listImage.get(i).toString();
                            HttpUtils.downloadPic(url, iv, getActivity());
                            dataImage.add(iv);
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    MyAdapter adapter = new MyAdapter();
                                    mShopViewPager.setAdapter(adapter);
                                }
                            });
                        }
                        break;
                    case 3:
                        for (int i = 0; i < 3; i++) {
                            ImageView iv = new ImageView(getActivity());
                            iv.setScaleType(ImageView.ScaleType.FIT_XY);
                            String url = listImage.get(i).toString();
                            HttpUtils.downloadPic(url, iv, getActivity());
                            dataImage.add(iv);
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    MyAdapter adapter = new MyAdapter();
                                    mShopViewPager.setAdapter(adapter);
                                }
                            });
                        }
                        break;
                    case 2:
                        for (int i = 0; i < 2; i++) {
                            ImageView iv = new ImageView(getActivity());
                            iv.setScaleType(ImageView.ScaleType.FIT_XY);
                            String url = listImage.get(i).toString();
                            HttpUtils.downloadPic(url, iv, getActivity());
                            dataImage.add(iv);
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    MyAdapter adapter = new MyAdapter();
                                    mShopViewPager.setAdapter(adapter);
                                }
                            });
                        }
                        break;
                    default:
                        break;
                }
            }
        });
        icons = new ImageView[imageViews.length];
        LinearLayout layout = (LinearLayout)view.findViewById(R.id.shop_layout);
        for (int i = 0; i < icons.length; i++) {
            icons[i] = (ImageView) layout.getChildAt(i);
            icons[i].setEnabled(true);
            icons[i].setTag(i);
            icons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    mShopViewPager.setCurrentItem((Integer) v.getTag());
                }
            });
        }
        icons[0].setEnabled(false);
        mShopViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < icons.length; i++) {
                    icons[i].setEnabled(true);
                }
                icons[position].setEnabled(false);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        mDestionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WhereActivity.class);
                startActivity(intent);

                startActivityForResult(intent,10002);
            }
        });
        //配送地址
        Intent receiveIntent = getActivity().getIntent();
        mDestionTextView.setText(receiveIntent.getStringExtra("pro")
                + ">" +  receiveIntent.getStringExtra("city")+ ">" +
                receiveIntent.getStringExtra("dist"));
        //TabLayout切换页面实现
        ShopDetailsFrag1 sdFrag1 = new ShopDetailsFrag1();
        Bundle bundle = new Bundle();
        bundle.putInt("id", id);
        sdFrag1.setArguments(bundle);
        list.add(sdFrag1);
        ShopDetailsFrag2 sdFrag2 = new ShopDetailsFrag2();
        list.add(sdFrag2);
        sdFrag2.setArguments(bundle);
        adapter = new MyFragmentAdapter(getActivity().getSupportFragmentManager(),list);
        mViewPager.setAdapter(adapter);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabLayout.setupWithViewPager(mViewPager);
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);



    }



    class MyAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return dataImage.size();
        }

        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            // TODO Auto-generated method stub
            return arg0 == arg1;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            // TODO Auto-generated method stub
            container.addView(dataImage.get(position));
            return dataImage.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            // TODO Auto-generated method stub
            container.removeView(dataImage.get(position));
        }
    }
}
