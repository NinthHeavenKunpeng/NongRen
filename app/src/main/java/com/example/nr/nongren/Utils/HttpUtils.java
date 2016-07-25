package com.example.nr.nongren.Utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.ImageView;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.nr.nongren.R;
import com.squareup.picasso.Picasso;

/**
 * Created by hjw on 2016/7/18.
 */
public class HttpUtils {
    /**
     * 验证当前是否有网络*/
    public static boolean checkNetWork(Context ct) {
        //获取连接管理对象--
        ConnectivityManager cm=(ConnectivityManager) ct.getSystemService(Context.CONNECTIVITY_SERVICE);
        //获取网络信息对象
        NetworkInfo ni=cm.getActiveNetworkInfo();
        if(ni!=null&&ni.isAvailable())//非null验证
        {
            return true;
        }
        else {
            return false;
        }
    }
    public  static void downloadJson(Context context,String url,final ResultCallBack callBack){
        RequestQueue mQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if (response.toString()!=null){
                        callBack.onSuccess(response.toString());
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {


            }
        });
        mQueue.add(stringRequest);
    }
    public static void downloadPic(String url,ImageView imageView,Context context,int targetWidth,int targetHeight){
        Picasso.with(context)
                .load(url)
                .placeholder(R.drawable.pic_loading169)
                .error(R.drawable.pic_loading169)
                .centerCrop()
                .config(Bitmap.Config.ALPHA_8)
                .resize(targetWidth,targetHeight)
                .into(imageView);
    }
    public static void downloadPic(String url,ImageView imageView,Context context){
        Picasso.with(context)
                .load(url)
                .placeholder(R.drawable.pic_loading169)
                .error(R.drawable.pic_loading169)
                .config(Bitmap.Config.ARGB_8888)
                .into(imageView);
    }
    /**
     *异步下载时，通过接口回掉保存和传输数据
     */
    public interface ResultCallBack{
        void onSuccess(String s);
        //void onError();
    }
}
