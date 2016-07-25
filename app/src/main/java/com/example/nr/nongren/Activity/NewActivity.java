package com.example.nr.nongren.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;

import com.example.nr.nongren.Adapter.NewAdapter;
import com.example.nr.nongren.Adapter.RepuationAdapter;
import com.example.nr.nongren.Api.ContentApi;
import com.example.nr.nongren.Bean.NewDetails;
import com.example.nr.nongren.Bean.RepuationDetails;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class NewActivity extends AppCompatActivity {
    private ImageView mNewImage;
    private RecyclerView mNewRecyView;
    private String json;
    private List<NewDetails.ProductsBean> list;
    private NewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        mNewImage = ((ImageView) findViewById(R.id.list_new_iv));
        mNewRecyView = ((RecyclerView) findViewById(R.id.list_new_rv));
        list = new ArrayList<NewDetails.ProductsBean>();
        HttpUtils.downloadJson(this, ContentApi.HOME_NEW_URL, new HttpUtils.ResultCallBack() {
            @Override
            public void onSuccess(String s) {
                json = s;
                Gson gson = new Gson();
                NewDetails newDetails = gson.fromJson(json, NewDetails.class);
                list = newDetails.getProducts();
                Log.e("aaa",String.valueOf(list.size()));
                HttpUtils.downloadPic(newDetails.getList_page_picture(), mNewImage, NewActivity.this);
                LinearLayoutManager layoutManager = new LinearLayoutManager(NewActivity.this);
                layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                mNewRecyView.setLayoutManager(layoutManager);
                mNewRecyView.setHasFixedSize(true);
                adapter = new NewAdapter(NewActivity.this, list);
                mNewRecyView.setAdapter(adapter);
            }
        });
    }
}
