package com.example.nr.nongren.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nr.nongren.Api.ContentApi;
import com.example.nr.nongren.Bean.ReputionAndName;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import com.google.gson.Gson;

/**
 * Created by hjw on 2016/7/19.
 */
public class ReputionFrag extends Fragment {
    private ImageView repuImage1,repuImage2,repuImage3;
    private TextView repuTextView1,repuTextView2,repuTextView3;
    private ReputionAndName reputionAndName;
    private String json,repuText1,repuText2,repuText3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.repution_frag,container,false);
        repuImage1 = ((ImageView) view.findViewById(R.id.repu_iv1));
        repuImage2 = ((ImageView) view.findViewById(R.id.repu_iv2));
        repuImage3 = ((ImageView) view.findViewById(R.id.repu_iv3));
        repuTextView1 = ((TextView) view.findViewById(R.id.repu_tv1));
        repuTextView2 = ((TextView) view.findViewById(R.id.repu_tv2));
        repuTextView3 = ((TextView) view.findViewById(R.id.repu_tv3));
        HttpUtils.downloadJson(getActivity(), ContentApi.HOME_NEW_REPUTION_URL, new HttpUtils.ResultCallBack() {
            @Override
            public void onSuccess(String s) {
                json = s;
                Gson gson = new Gson();
                reputionAndName = gson.fromJson(json,ReputionAndName.class);
                HttpUtils.downloadPic(reputionAndName.getFestival().getLaunchActivityProducts().get(0).getPicture().toString()
                        , repuImage1, getActivity());
                HttpUtils.downloadPic(reputionAndName.getFestival().getLaunchActivityProducts().get(1).getPicture().toString()
                        ,repuImage2,getActivity());
                HttpUtils.downloadPic(reputionAndName.getFestival().getLaunchActivityProducts().get(2).getPicture().toString()
                        ,repuImage3,getActivity());
                repuText1= reputionAndName.getFestival().getLaunchActivityProducts().get(0).getTitle();
                repuText2= reputionAndName.getFestival().getLaunchActivityProducts().get(1).getTitle();
                repuText3= reputionAndName.getFestival().getLaunchActivityProducts().get(2).getTitle();
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        repuTextView1.setText(repuText1);
                        repuTextView2.setText(repuText2);
                        repuTextView3.setText(repuText3);
                    }
                });
            }
        });
        return view;
    }
}
