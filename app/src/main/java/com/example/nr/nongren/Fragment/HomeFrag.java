package com.example.nr.nongren.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.nr.nongren.Activity.FarmerCircleActivity;
import com.example.nr.nongren.Activity.NewActivity;
import com.example.nr.nongren.Activity.RecommendActivity;
import com.example.nr.nongren.Activity.ReputionActivity;
import com.example.nr.nongren.Adapter.FragmentAdapter;
import com.example.nr.nongren.Adapter.RecommendAdapter;
import com.example.nr.nongren.Api.ContentApi;
import com.example.nr.nongren.Bean.HomeBanner;
import com.example.nr.nongren.Bean.Recommend;
import com.example.nr.nongren.Bean.ReputionAndName;
import com.example.nr.nongren.Bean.SalePrice;
import com.example.nr.nongren.MyView.FullyLinearLayoutManager;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import com.example.nr.nongren.Utils.Parser;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by hjw on 2016/7/17.
 */
public class HomeFrag extends Fragment {
    private boolean isRunning = true;
    @Nullable

    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            MyAdapter adapter = new MyAdapter();
            int size=adapter.getCount();
            switch (size){
                case 5:
                if(mViewPager.getCurrentItem()==0){
                          mViewPager.setCurrentItem(mViewPager.getCurrentItem()+1);
                    }else if(mViewPager.getCurrentItem()>=1&&mViewPager.getCurrentItem()<4){
                          mViewPager.setCurrentItem(mViewPager.getCurrentItem()+1);
                    }else if(mViewPager.getCurrentItem()==4){
                          mViewPager.setCurrentItem(0);
                    }
                    break;
                case 4:
                    if(mViewPager.getCurrentItem()==0){
                        mViewPager.setCurrentItem(mViewPager.getCurrentItem()+1);
                    }else if(mViewPager.getCurrentItem()>=1&&mViewPager.getCurrentItem()<3){
                        mViewPager.setCurrentItem(mViewPager.getCurrentItem()+1);
                    }else if(mViewPager.getCurrentItem()==3){
                        mViewPager.setCurrentItem(0);
                    }
                    break;
                case 3:
                    if(mViewPager.getCurrentItem()==0){
                        mViewPager.setCurrentItem(mViewPager.getCurrentItem()+1);
                    }else if(mViewPager.getCurrentItem()>=1&&mViewPager.getCurrentItem()<2){
                        mViewPager.setCurrentItem(mViewPager.getCurrentItem()+1);
                    }else if(mViewPager.getCurrentItem()==2){
                        mViewPager.setCurrentItem(0);
                    }
                    break;
                case 2:
                    if(mViewPager.getCurrentItem()==0){
                        mViewPager.setCurrentItem(mViewPager.getCurrentItem()+1);
                    }else if(mViewPager.getCurrentItem()==1){
                        mViewPager.setCurrentItem(0);
                    }
                    break;
                default:
                    break;
            }
            if (isRunning){
                handler.sendEmptyMessageDelayed(0, 6000);
            }
        }
    };
    private ViewPager mViewPager;
    private ImageView mSaleImage,mFestivalImage,mLaunchImage;
    private String json,saleImageUrl,festivalImageUrl,launchImageUrl;
    private SalePrice salePrice;
    private ReputionAndName reputionAndName;
    private HomeBanner homeBanner;
    private List<ImageView> dataImage;
    private List<HomeBanner>dataBanner;
    private ImageView[] icons;
    private ImageView [] imageViews = new ImageView[5];
    private ViewPager reputViewPager,newViewPager,farmerViewPager;
    private List<Fragment> repuData,newData,farmerData;
    private FragmentAdapter repuAdapter,newAdapter,farmerAdapter;
    private List<Recommend.ProductsBean>list;
    private View lineView;
    private Button button;
    private TextView mText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view  = inflater.inflate(R.layout.home_frag, container, false);
        mText = ((TextView) view.findViewById(R.id.more_home_frag_tv));
        mSaleImage = ((ImageView) view.findViewById(R.id.sale_home_frag));
        mViewPager = ((ViewPager) view.findViewById(R.id.slideshow_vp));
        mFestivalImage = (ImageView)view.findViewById(R.id.week_home_frag);
        mLaunchImage = (ImageView)view.findViewById(R.id.new_home_frag);
        reputViewPager = ((ViewPager) view.findViewById(R.id.reputation_viewPager));
        newViewPager=((ViewPager) view.findViewById(R.id.new_viewPager));
        lineView = ((View) view.findViewById(R.id.line));
        farmerViewPager=((ViewPager) view.findViewById(R.id.people_viewPager));
        button = ((Button) view.findViewById(R.id.more_btn));
        dataImage= new ArrayList<ImageView>();
        dataBanner = new ArrayList<HomeBanner>();
        repuData = new ArrayList<Fragment>();
        newData = new ArrayList<Fragment>();
        farmerData = new ArrayList<Fragment>();
         list = new ArrayList<Recommend.ProductsBean>();
        mFestivalImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ReputionActivity.class);
                startActivity(intent);
            }
        });
        mLaunchImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NewActivity.class);
                startActivity(intent);
            }
        });
        HttpUtils.downloadJson(getActivity(), ContentApi.HOME_SALE_URL, new HttpUtils.ResultCallBack() {
            @Override
            public void onSuccess(String s) {
                    json = s;
                if (Parser.parserSalePrice(json)!=null){
                    salePrice = Parser.parserSalePrice(json);

                    saleImageUrl = salePrice.getPicture().toString();
                    HttpUtils.downloadPic(saleImageUrl, mSaleImage, getActivity());
                }else{
                    mSaleImage.setVisibility(View.GONE);
                    lineView.setVisibility(View.GONE);
                }
            }
        });
        HttpUtils.downloadJson(getActivity(), ContentApi.HOME_NEW_REPUTION_URL, new HttpUtils.ResultCallBack() {
            @Override
            public void onSuccess(String s) {
                json = s ;
                Gson gson = new Gson();
                reputionAndName =gson.fromJson(json,ReputionAndName.class);
                festivalImageUrl=reputionAndName.getFestival().getPicture().toString();
                launchImageUrl = reputionAndName.getLaunch().getPicture().toString();
                HttpUtils.downloadPic(festivalImageUrl,mFestivalImage,getActivity());
                HttpUtils.downloadPic(launchImageUrl,mLaunchImage,getActivity());
            }
        });
        HttpUtils.downloadJson(getActivity(), ContentApi.HOME_BANNER_URL, new HttpUtils.ResultCallBack() {
            @Override
            public void onSuccess(String s) {
                json = s;
                dataBanner = Parser.parserBanner(json);
                int size = dataBanner.size();
                switch (size) {
                    case 5:
                    for (int i = 0; i < 5; i++) {
                        ImageView iv = new ImageView(getActivity());
                        iv.setScaleType(ImageView.ScaleType.FIT_XY);
                        String url = dataBanner.get(i).getPicture().toString();
                        HttpUtils.downloadPic(url, iv, getActivity());
                        dataImage.add(iv);
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                MyAdapter adapter = new MyAdapter();
                                mViewPager.setAdapter(adapter);
                            }
                        });
                    }
                        break;
                    case 4:
                        for (int i = 0; i < 4; i++) {
                            ImageView iv = new ImageView(getActivity());
                            iv.setScaleType(ImageView.ScaleType.FIT_XY);
                            String url = dataBanner.get(i).getPicture().toString();
                            HttpUtils.downloadPic(url, iv, getActivity());
                            dataImage.add(iv);
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    MyAdapter adapter = new MyAdapter();
                                    mViewPager.setAdapter(adapter);
                                }
                            });
                        }
                        break;
                    case 3:
                        for (int i = 0; i < 3; i++) {
                            ImageView iv = new ImageView(getActivity());
                            iv.setScaleType(ImageView.ScaleType.FIT_XY);
                            String url = dataBanner.get(i).getPicture().toString();
                            HttpUtils.downloadPic(url, iv, getActivity());
                            dataImage.add(iv);
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    MyAdapter adapter = new MyAdapter();
                                    mViewPager.setAdapter(adapter);
                                }
                            });
                        }
                        break;
                    case 2:
                        for (int i = 0; i < 2; i++) {
                            ImageView iv = new ImageView(getActivity());
                            iv.setScaleType(ImageView.ScaleType.FIT_XY);
                            String url = dataBanner.get(i).getPicture().toString();
                            HttpUtils.downloadPic(url, iv, getActivity());
                            dataImage.add(iv);
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    MyAdapter adapter = new MyAdapter();
                                    mViewPager.setAdapter(adapter);
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
        LinearLayout layout = (LinearLayout) view.findViewById(R.id.layout);
        for (int i = 0; i < icons.length; i++) {
            icons[i] = (ImageView) layout.getChildAt(i);
            icons[i].setEnabled(true);
            icons[i].setTag(i);
            icons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    mViewPager.setCurrentItem((Integer) v.getTag());
                }
            });
        }
        icons[0].setEnabled(false);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
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
        //阿农一周口碑滚动
        ReputionFrag rFrag = new ReputionFrag();
        repuData.add(rFrag);
        ReputionFrag1 rFrag1 = new ReputionFrag1();
        repuData.add(rFrag1);
        repuAdapter = new FragmentAdapter(getFragmentManager(),repuData);
        reputViewPager.setOffscreenPageLimit(1);
        reputViewPager.setAdapter(repuAdapter);
        //阿农上新滚动
        NewFrag nFrag = new NewFrag();
        newData.add(nFrag);
        NewFrag1 nFrag1 = new NewFrag1();
        newData.add(nFrag1);
        newAdapter = new FragmentAdapter(getFragmentManager(),newData);
        newViewPager.setAdapter(newAdapter);
        newViewPager.setOffscreenPageLimit(1);
        //农人圈滚动
        FarmerFrag farmerFrag = new FarmerFrag();
        farmerData.add(farmerFrag);
        FarmerFrag1 farmerFrag1 = new FarmerFrag1();
        farmerData.add(farmerFrag1);
        FarmerFrag2 farmerFrag2 = new FarmerFrag2();
        farmerData.add(farmerFrag2);
        FarmerFrag3 farmerFrag3 = new FarmerFrag3();
        farmerData.add(farmerFrag3);
        farmerAdapter  = new FragmentAdapter(getFragmentManager(),farmerData);
        farmerViewPager.setOffscreenPageLimit(3);
        farmerViewPager.setAdapter(farmerAdapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RecommendActivity.class);
                startActivity(intent);
            }
        });
        mText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FarmerCircleActivity.class);
                startActivity(intent);
            }
        });
        handler.sendEmptyMessageDelayed(0, 6000);
        return view;
    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        isRunning = false;
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
