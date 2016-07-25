package com.example.nr.nongren.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.example.nr.nongren.Adapter.RepuationAdapter;
import com.example.nr.nongren.Api.ContentApi;
import com.example.nr.nongren.Bean.RepuationDetails;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class ReputionActivity extends AppCompatActivity {

    private ImageView mRepuationImage;
    private RecyclerView mRecyView;
    private String json;
    private List<RepuationDetails.ProductsBean> list;
    private RepuationAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repution);
        mRepuationImage = ((ImageView) findViewById(R.id.list_repuation_iv));
        mRecyView = ((RecyclerView) findViewById(R.id.list_repuation_rv));
        list = new ArrayList<RepuationDetails.ProductsBean>();

        HttpUtils.downloadJson(this, ContentApi.HOME_REPUATION_URL, new HttpUtils.ResultCallBack() {
            @Override
            public void onSuccess(String s) {
                json = s;
                Gson gson = new Gson();
                RepuationDetails repuationDetails = gson.fromJson(json,RepuationDetails.class);
                list = repuationDetails.getProducts();
                HttpUtils.downloadPic(repuationDetails.getList_page_picture(),mRepuationImage,ReputionActivity.this);
                LinearLayoutManager layoutManager = new LinearLayoutManager(ReputionActivity.this);
                layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                mRecyView.setLayoutManager(layoutManager);
                mRecyView.setHasFixedSize(true);
                adapter = new RepuationAdapter(ReputionActivity.this,list);
                mRecyView.setAdapter(adapter);
            }
        });
    }
}
