package com.example.nr.nongren.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.nr.nongren.Activity.Mine_Address;
import com.example.nr.nongren.Activity.Mine_CollectionCommodity;
import com.example.nr.nongren.Activity.Mine_DaiPay;
import com.example.nr.nongren.Activity.Mine_HeadActivity;
import com.example.nr.nongren.Activity.Mine_TuiKuan;
import com.example.nr.nongren.R;

/**
 * Created by hjw on 2016/7/17.
 */
public class MineFrag extends Fragment {
    private View view;
    private LinearLayout ll_my_head;
    private LinearLayout ll_dianpu_shoucang;
    private LinearLayout ll_shangpin_shoucang;
    private LinearLayout ll_dai_fukuan;
    private LinearLayout ll_dai_fahuo;
    private LinearLayout ll_dai_pingjia;
    private LinearLayout ll_dai_shouhuo;
    private LinearLayout ll_shouhou;
    private LinearLayout ll_my_dingdan;
    private LinearLayout ll_address_shouhuo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       view  = inflater.inflate(R.layout.mine_frag,container,false);
        initView();
        return view;
    }

    private void initView() {
        ll_my_head = ((LinearLayout) view.findViewById(R.id.ll_my_head));
        ll_my_head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Mine_HeadActivity.class);
                startActivity(intent);
            }
        });

        //收藏的商品
        ll_dianpu_shoucang = ((LinearLayout) view.findViewById(R.id.ll_dianpu_shoucang));
        ll_dianpu_shoucang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Mine_CollectionCommodity.class);
                intent.putExtra("key",2);
                startActivity(intent);
            }
        });

        ll_shangpin_shoucang = ((LinearLayout) view.findViewById(R.id.ll_shangpin_shoucang));
        ll_shangpin_shoucang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Mine_CollectionCommodity.class);
                intent.putExtra("key",1);
                startActivity(intent);
            }
        });


        //待付款
        ll_dai_fukuan = ((LinearLayout) view.findViewById(R.id.ll_dai_fukuan));
        ll_dai_fukuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Mine_DaiPay.class);
                intent.putExtra("key",1);
                startActivity(intent);
            }
        });

        ll_dai_fahuo = ((LinearLayout) view.findViewById(R.id.ll_dai_fahuo));
        ll_dai_fahuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Mine_DaiPay.class);
                intent.putExtra("key",2);
                startActivity(intent);
            }
        });

        ll_dai_pingjia = ((LinearLayout) view.findViewById(R.id.ll_dai_pingjia));
        ll_dai_pingjia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Mine_DaiPay.class);
                intent.putExtra("key",4);
                startActivity(intent);
            }
        });

        ll_dai_shouhuo = ((LinearLayout) view.findViewById(R.id.ll_dai_shouhuo));
        ll_dai_shouhuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Mine_DaiPay.class);
                intent.putExtra("key",3);
                startActivity(intent);
            }
        });


        //售后
        ll_shouhou = ((LinearLayout) view.findViewById(R.id.ll_shouhou));
        ll_shouhou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Mine_TuiKuan.class);
                startActivity(intent);
            }
        });

        //我的订单
        ll_my_dingdan = ((LinearLayout) view.findViewById(R.id.ll_my_dingdan));
        ll_my_dingdan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Mine_DaiPay.class);
                startActivity(intent);
            }
        });

        //收货地址管理
        ll_address_shouhuo = ((LinearLayout) view.findViewById(R.id.ll_address_shouhuo));
        ll_address_shouhuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Mine_Address.class);
                startActivity(intent);
            }
        });
    }
}
