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

public class Mine_DaiPay extends AppCompatActivity {

    private LinearLayout ll_Pay;
    private ViewPager Pay_viewpager;
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
        setContentView(R.layout.activity_mine__dai_pay);
        initView();
        initfragment();
        adapter = new FragmentAdapter(getSupportFragmentManager(), data);
        Pay_viewpager.setAdapter(adapter);
        Pay_viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0) {
                // TODO Auto-generated method stub
                for (int i = 0; i < ll_Pay.getChildCount(); i++) {
                    ((TextView) ll_Pay.getChildAt(i))
                            .setTextColor(0xff000000);
                }
                ((TextView) ll_Pay.getChildAt(arg0))
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
                for (int i = 0; i < ll_Pay.getChildCount(); i++) {
                    ((TextView) ll_Pay.getChildAt(i)).setTextColor(0xff000000);
                }
                ((TextView) ll_Pay.getChildAt(1)).setTextColor(0xffff0000);
                Pay_viewpager.setCurrentItem(1);
                break;
            case 2:
                for (int i = 0; i < ll_Pay.getChildCount(); i++) {
                    ((TextView) ll_Pay.getChildAt(i)).setTextColor(0xff000000);
                }
                ((TextView) ll_Pay.getChildAt(3)).setTextColor(0xffff0000);
                Pay_viewpager.setCurrentItem(3);
                break;
            case 3:
                for (int i = 0; i < ll_Pay.getChildCount(); i++) {
                    ((TextView) ll_Pay.getChildAt(i)).setTextColor(0xff000000);
                }
                ((TextView) ll_Pay.getChildAt(4)).setTextColor(0xffff0000);
                Pay_viewpager.setCurrentItem(4);
                break;
            case 4:
                for (int i = 0; i < ll_Pay.getChildCount(); i++) {
                    ((TextView) ll_Pay.getChildAt(i)).setTextColor(0xff000000);
                }
                ((TextView) ll_Pay.getChildAt(5)).setTextColor(0xffff0000);
                Pay_viewpager.setCurrentItem(5);
                break;

        }

    }

    private void initfragment() {
        data = new ArrayList<Fragment>();
        Mine_PayFrag mp1 = new Mine_PayFrag();

        data.add(mp1);

        Mine_PayFrag mp2 = new Mine_PayFrag();

        data.add(mp2);

        Mine_PayFrag mp3 = new Mine_PayFrag();

        data.add(mp3);


        Mine_PayFrag mp4 = new Mine_PayFrag();

        data.add(mp4);

        Mine_PayFrag mp5 = new Mine_PayFrag();

        data.add(mp5);
        Mine_PayFrag mp6 = new Mine_PayFrag();

        data.add(mp6);


    }

    private void initView() {
        ll_Pay = ((LinearLayout) findViewById(R.id.ll_Pay));
        Pay_viewpager = ((ViewPager) findViewById(R.id.Pay_viewpager));


        tv_Pay_daifahuo = ((TextView) findViewById(R.id.tv_Pay_daifahuo));
        tv_Pay_daifahuo = ((TextView) findViewById(R.id.tv_Pay_daipinjia));
        tv_Pay_daifahuo = ((TextView) findViewById(R.id.tv_Pay_daishouhuo));
        tv_Pay_daifahuo = ((TextView) findViewById(R.id.tv_Pay_pin_tuan));
        tv_Pay_daifahuo = ((TextView) findViewById(R.id.tv_Paydai_fukuan));



    }

    public void onClick(View v) {
        int index = ll_Pay.indexOfChild(v);
        for (int i = 0; i < ll_Pay.getChildCount(); i++) {
            ((TextView) ll_Pay.getChildAt(i)).setTextColor(0xff000000);
        }
        ((TextView) ll_Pay.getChildAt(index)).setTextColor(0xffff0000);
        Pay_viewpager.setCurrentItem(index);

    }

}
