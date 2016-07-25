package com.example.nr.nongren.Activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.nr.nongren.Adapter.FragmentAdapter;
import com.example.nr.nongren.Fragment.Mine_PayFrag;
import com.example.nr.nongren.R;

import java.util.ArrayList;
import java.util.List;

public class Mine_CollectionCommodity extends AppCompatActivity {
    private LinearLayout ll_CollectionCommodity;
    private ViewPager collection_viewpager;
    private List<Fragment> data;
    private FragmentAdapter adapter;

    private int key = 0;


    //2  3
    private TextView tv_Pay_daifahuo;
    // 4  5
    private TextView tv_Pay_daipinjia;
    //3  4
    private TextView tv_Pay_daishouhuo;
    private TextView tv_Pay_pin_tuan;
    //1 1
    private TextView tv_Paydai_fukuan;


   /* tv_Pay_daifahuo = ((TextView) findViewById(R.id.tv_Pay_daifahuo));
    tv_Pay_daifahuo = ((TextView) findViewById(R.id.tv_Pay_daipinjia));
    tv_Pay_daifahuo = ((TextView) findViewById(R.id.tv_Pay_daishouhuo));
    tv_Pay_daifahuo = ((TextView) findViewById(R.id.tv_Pay_pin_tuan));
    tv_Pay_daifahuo = ((TextView) findViewById(R.id.tv_Paydai_fukuan));*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine__collection_commodity);
        initView();
        initfragment();
        adapter = new FragmentAdapter(getSupportFragmentManager(), data);
        collection_viewpager.setAdapter(adapter);
        collection_viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0) {
                // TODO Auto-generated method stub
                for (int i = 0; i < ll_CollectionCommodity.getChildCount(); i++) {
                    ((TextView) ll_CollectionCommodity.getChildAt(i))
                            .setTextColor(0xff000000);
                }
                ((TextView) ll_CollectionCommodity.getChildAt(arg0))
                        .setTextColor(0xffff0000);

            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
                // TODO Auto-generated method stub

            }
        });
        key=getIntent().getIntExtra("key",1);

        switch (key){
            case 1:
                //tv_Paydai_fukuan.setOnClickListener();
                for (int i = 0; i < ll_CollectionCommodity.getChildCount(); i++) {
                    ((TextView) ll_CollectionCommodity.getChildAt(i)).setTextColor(0xff000000);
                }
                ((TextView) ll_CollectionCommodity.getChildAt(0)).setTextColor(0xffff0000);
                collection_viewpager.setCurrentItem(0);
                break;
            case 2:
                for (int i = 0; i < ll_CollectionCommodity.getChildCount(); i++) {
                    ((TextView) ll_CollectionCommodity.getChildAt(i)).setTextColor(0xff000000);
                }
                ((TextView) ll_CollectionCommodity.getChildAt(1)).setTextColor(0xffff0000);
                collection_viewpager.setCurrentItem(1);
                break;


        }

    }

    private void initfragment() {
        data = new ArrayList<Fragment>();
        Mine_PayFrag mp1 = new Mine_PayFrag();

        data.add(mp1);

        Mine_PayFrag mp2 = new Mine_PayFrag();

        data.add(mp2);






    }

    private void initView() {
        ll_CollectionCommodity = ((LinearLayout) findViewById(R.id.ll_CollectionCommodity));
        collection_viewpager = ((ViewPager) findViewById(R.id.Collection_viewpager));






    }

    public void onClick(View v) {
        int index = ll_CollectionCommodity.indexOfChild(v);
        for (int i = 0; i < ll_CollectionCommodity.getChildCount(); i++) {
            ((TextView) ll_CollectionCommodity.getChildAt(i)).setTextColor(0xff000000);
        }
        ((TextView) ll_CollectionCommodity.getChildAt(index)).setTextColor(0xffff0000);
        collection_viewpager.setCurrentItem(index);

    }
}
