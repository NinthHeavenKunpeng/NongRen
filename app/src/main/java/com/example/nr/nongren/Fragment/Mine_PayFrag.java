package com.example.nr.nongren.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nr.nongren.R;

/**
 * Created by aa on 2016/7/22.
 */
public class Mine_PayFrag extends Fragment {

//支付暂未完成
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.classify_frag, container, false);
        return v;
    }
}
