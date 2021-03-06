package com.example.nr.nongren.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nr.nongren.Api.ContentApi;
import com.example.nr.nongren.Bean.FarmerCircle;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import com.google.gson.Gson;

/**
 * Created by hjw on 2016/7/19.
 */
public class FarmerFrag2 extends Fragment {
    private ImageView iconImage,farmerImage1,farmerImage2,farmerImage3;
    private TextView nameTextView,timeTextView,titleTextView;
    private String json;
    private FarmerCircle farmer;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.farmer_frag2,container,false);
        iconImage = ((ImageView) view.findViewById(R.id.people_icon_iv2));
        nameTextView = ((TextView) view.findViewById(R.id.farmer_name_tv2));
        timeTextView = ((TextView) view.findViewById(R.id.farmer_time_tv2));
        titleTextView = ((TextView) view.findViewById(R.id.farmer_title_tv2));
        farmerImage1 = ((ImageView) view.findViewById(R.id.farmer_iv1_frag1));
        farmerImage2 = ((ImageView) view.findViewById(R.id.farmer_iv2_frag1));
        farmerImage3 = ((ImageView) view.findViewById(R.id.farmer_iv3_frag1));
        HttpUtils.downloadJson(getActivity(), ContentApi.HOME_FARMER_URL, new HttpUtils.ResultCallBack() {
            @Override
            public void onSuccess(String s) {
                json = s;
                Gson gson = new Gson();
                farmer = gson.fromJson(json, FarmerCircle.class);
                HttpUtils.downloadPic(farmer.getFarmerDynamicInfo().get(2).getUserMicroAvatar().toString(),
                        iconImage, getActivity());
                HttpUtils.downloadPic(farmer.getFarmerDynamicInfo().get(2).getPictures().get(0).toString(),
                        farmerImage1, getActivity());
                HttpUtils.downloadPic(farmer.getFarmerDynamicInfo().get(2).getPictures().get(1).toString(),
                        farmerImage2, getActivity());
                HttpUtils.downloadPic(farmer.getFarmerDynamicInfo().get(2).getPictures().get(2).toString(),
                        farmerImage3, getActivity());
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        nameTextView.setText(farmer.getFarmerDynamicInfo().get(2).getUserName());
                        timeTextView.setText(farmer.getFarmerDynamicInfo().get(2).getTimeDifference());
                        titleTextView.setText(farmer.getFarmerDynamicInfo().get(2).getContent());
                    }
                });
            }
        });
        return  view;
    }
}
