package com.example.nr.nongren.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nr.nongren.Api.ContentApi;
import com.example.nr.nongren.Bean.ShopThing;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import com.google.gson.Gson;

/**
 * Created by hjw on 2016/7/21.
 */
public class ShopDetailsFrag2 extends Fragment {
    private TextView mTextView1,mTextView2,mTextView3,mTextView4,
            mTextView5,mTextView6,mTextView7,mTextView8;
    private String url,json;
    private  int id;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.shop_details_frag2,container,false);
        mTextView1 = ((TextView) view.findViewById(R.id.shop_name_frag_tv));
        mTextView2 = ((TextView) view.findViewById(R.id.shop_contain_frag_tv));
        mTextView3 = ((TextView) view.findViewById(R.id.shop_death_time_frag_tv));
        mTextView4 = ((TextView) view.findViewById(R.id.shop_produce_time_frag_tv));
        mTextView5 = ((TextView) view.findViewById(R.id.shop_protect_frag_tv));
        mTextView6 = ((TextView) view.findViewById(R.id.shop_people_frag_tv));
        mTextView7 = ((TextView) view.findViewById(R.id.shop_factory_frag_tv));
        mTextView8 = ((TextView) view.findViewById(R.id.shop_where_frag_tv));
        Bundle bundle = getArguments();
        id = bundle.getInt("id");
        url = String.format(ContentApi.HOME_SHOP_DETAILS_URL,id);
        HttpUtils.downloadJson(getActivity(), url, new HttpUtils.ResultCallBack() {
            @Override
            public void onSuccess(String s) {
                json = s;
                Gson gson = new Gson();
                ShopThing shopThing =gson.fromJson(json,ShopThing.class);
                mTextView1.setText(shopThing.getParameter().getStandard_name());
                mTextView2.setText(shopThing.getParameter().getIngredients());
                mTextView3.setText(shopThing.getParameter().getQuality_guarantee_period());
                mTextView4.setText(shopThing.getParameter().getManufacture_date());
                mTextView5.setText(shopThing.getParameter().getStorage());
                mTextView6.setText(shopThing.getParameter().getManufacturer());
                mTextView7.setText(shopThing.getParameter().getManufacturer_address());
                mTextView8.setText(shopThing.getParameter().getOrigin());
            }
        });

        return view;
    }
}
