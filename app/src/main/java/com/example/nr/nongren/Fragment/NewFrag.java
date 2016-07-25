package com.example.nr.nongren.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nr.nongren.Activity.ShopActivity;
import com.example.nr.nongren.Api.ContentApi;
import com.example.nr.nongren.Bean.ReputionAndName;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import com.google.gson.Gson;

/**
 * Created by hjw on 2016/7/19.
 */
public class NewFrag extends Fragment {
    private ImageView newImage1,newImage2,newImage3;
    private TextView newTextView1,newTextView2,newTextView3;
    private ReputionAndName reputionAndName;
    private String json,newText1,newText2,newText3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.new_frag,container,false);
        newImage1 = ((ImageView) view.findViewById(R.id.new_iv1));
        newImage2 = ((ImageView) view.findViewById(R.id.new_iv2));
        newImage3 = ((ImageView) view.findViewById(R.id.new_iv3));
        newTextView1 = ((TextView) view.findViewById(R.id.new_tv1));
        newTextView2 = ((TextView) view.findViewById(R.id.new_tv2));
        newTextView3 = ((TextView) view.findViewById(R.id.new_tv3));
        HttpUtils.downloadJson(getActivity(), ContentApi.HOME_NEW_REPUTION_URL, new HttpUtils.ResultCallBack() {
            @Override
            public void onSuccess(String s) {
                json = s;
                Gson gson = new Gson();
                reputionAndName = gson.fromJson(json, ReputionAndName.class);
                HttpUtils.downloadPic(reputionAndName.getLaunch().getLaunchActivityProducts().get(0).getPicture().toString()
                        , newImage1, getActivity());
                HttpUtils.downloadPic(reputionAndName.getLaunch().getLaunchActivityProducts().get(1).getPicture().toString()
                        , newImage2, getActivity());
                HttpUtils.downloadPic(reputionAndName.getLaunch().getLaunchActivityProducts().get(2).getPicture().toString()
                        , newImage3, getActivity());
                newText1 = reputionAndName.getLaunch().getLaunchActivityProducts().get(0).getTitle();
                newText2 = reputionAndName.getLaunch().getLaunchActivityProducts().get(1).getTitle();
                newText3 = reputionAndName.getLaunch().getLaunchActivityProducts().get(2).getTitle();
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        newTextView1.setText(newText1);
                        newTextView2.setText(newText2);
                        newTextView3.setText(newText3);
                    }
                });
                newImage1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), ShopActivity.class);
                        intent.putExtra("id", reputionAndName.getLaunch().getLaunchActivityProducts().
                                get(0).getId());
                        startActivity(intent);
                    }
                });
                newImage2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), ShopActivity.class);
                        intent.putExtra("id", reputionAndName.getLaunch().getLaunchActivityProducts().
                                get(1).getId());
                        startActivity(intent);
                    }
                });
                newImage3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), ShopActivity.class);
                        intent.putExtra("id", reputionAndName.getLaunch().getLaunchActivityProducts().
                                get(2).getId());
                        startActivity(intent);
                    }
                });
            }
        });

        return view;
    }
}
