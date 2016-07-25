package com.example.nr.nongren.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.nr.nongren.Api.ContentApi;
import com.example.nr.nongren.Bean.ShopDetails;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import com.google.gson.Gson;

/**
 * Created by hjw on 2016/7/21.
 */
public class ShopDetailsFrag1 extends Fragment {
    private WebView mShopWebView;
    private String data,json,url;
    private  int id;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.shop_details_frag1,container,false);
        mShopWebView = ((WebView) view.findViewById(R.id.shop_details_wb));
        mShopWebView.getSettings().setJavaScriptEnabled(true);
        mShopWebView.getSettings().setBuiltInZoomControls(true);
        Bundle bundle = getArguments();
        id = bundle.getInt("id");
        url = String.format(ContentApi.HOME_WEBVIEW_SHOP_URL, id);
        HttpUtils.downloadJson(getActivity(),url, new HttpUtils.ResultCallBack() {
            @Override
            public void onSuccess(String s) {
                json = s;

                Gson gson = new Gson();
                ShopDetails shopDetails = gson.fromJson(json, ShopDetails.class);
                data = shopDetails.getDetail().getIdentification() + shopDetails.getDetail().getOrigin()
                        + shopDetails.getDetail().getProduce() + shopDetails.getDetail().getNutrition()
                        + shopDetails.getDetail().getNutrition() + shopDetails.getDetail().getPick()
                        + shopDetails.getDetail().getMore().toString();
                mShopWebView.setWebViewClient(new WebViewClient() {
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        view.loadDataWithBaseURL(null, data, "text/html", "utf-8", null);
                        mShopWebView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                        mShopWebView.getSettings().setLoadWithOverviewMode(true);
                        return true;
                    }
                });
                mShopWebView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                mShopWebView.getSettings().setLoadWithOverviewMode(true);
                mShopWebView.loadDataWithBaseURL(null, data, "text/html", "utf-8", null);
            }
        });

        return view;
    }
}
