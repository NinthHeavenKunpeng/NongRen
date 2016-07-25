package com.example.nr.nongren.Activity;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.example.nr.nongren.Adapter.RecoDetailsAdapter;
import com.example.nr.nongren.Api.ContentApi;
import com.example.nr.nongren.Bean.ShopRecommend;
import com.example.nr.nongren.MyView.SwipeRecyclerView;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
public class RecommendActivity extends AppCompatActivity  implements SwipeRecyclerView.OnRefreshAndLoadListener {
    private List<ShopRecommend.ProductsBean>list;
    private RecoDetailsAdapter adapter;
    private SwipeRecyclerView mRecommRV;
    private String json,url;
    public static int page =1;
    private SwipeRefreshLayout mSwipeRefreshWidget;
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 0:

                    break;
                case 1:
                    page++;
                    url= String.format(ContentApi.HOME_HOT_RECOMMEND_URL,page);
                    HttpUtils.downloadJson(RecommendActivity.this, url, new HttpUtils.ResultCallBack() {
                        @Override
                        public void onSuccess(String s) {
                            json = s;
                            Gson gson = new Gson();
                            ShopRecommend shopReco = gson.fromJson(json,ShopRecommend.class);
                            list = shopReco.getProducts();
                            if (list.size()>0){
                            adapter = new RecoDetailsAdapter(RecommendActivity.this,list);
                            mRecommRV.setAdapter(adapter);
                            mRecommRV.completeLoad();
                            adapter.notifyDataSetChanged();}
                            else {
                                mRecommRV.setVisibility(View.GONE);
                                ImageView imageView = new ImageView(RecommendActivity.this);
                                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                                        LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                                //.setMargins(0, 100, 0, 200);
                                imageView.setLayoutParams(lp);
                                imageView.setImageResource(R.drawable.nothing);
                                Toast.makeText(RecommendActivity.this,"阿农这已经没有商品啦！",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                    break;
                case 2:
                    page=1;
                    url= String.format(ContentApi.HOME_HOT_RECOMMEND_URL,page);
                    HttpUtils.downloadJson(RecommendActivity.this, url, new HttpUtils.ResultCallBack() {
                        @Override
                        public void onSuccess(String s) {
                            json = s;
                            Gson gson = new Gson();
                            ShopRecommend shopReco = gson.fromJson(json,ShopRecommend.class);
                            list = shopReco.getProducts();
                            adapter = new RecoDetailsAdapter(RecommendActivity.this,list);
                            mRecommRV.setAdapter(adapter);
                            mRecommRV.completeLoad();
                            adapter.notifyDataSetChanged();
                        }
                    });
                    mSwipeRefreshWidget.setRefreshing(false);
                    Toast.makeText(RecommendActivity.this,"这已经是阿农最新的商品啦(●'◡'●)！",Toast.LENGTH_SHORT).show();
                    break;
            }

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);
        mRecommRV = ((SwipeRecyclerView) findViewById(R.id.recommend_rv));
        mSwipeRefreshWidget = ((SwipeRefreshLayout) findViewById(R.id.swipe_refresh_widget));
        mSwipeRefreshWidget.setColorSchemeResources(android.R.color.holo_blue_light, android.R.color.holo_red_light,
                android.R.color.holo_orange_light, android.R.color.holo_green_light);
        mSwipeRefreshWidget.setProgressViewOffset(true, -50, (int) TypedValue
                .applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50, getResources()
                        .getDisplayMetrics()));
        mRecommRV.setOnRefreshAndLoadListener(mSwipeRefreshWidget, this);
        list = new ArrayList<ShopRecommend.ProductsBean>();
        url = String.format(ContentApi.HOME_HOT_RECOMMEND_URL,page);
        HttpUtils.downloadJson(this, url, new HttpUtils.ResultCallBack() {
            @Override
            public void onSuccess(String s) {
                json =s;
                Gson gson = new Gson();
                ShopRecommend shopReco = gson.fromJson(json,ShopRecommend.class);
                list = shopReco.getProducts();
                LinearLayoutManager layoutManager = new LinearLayoutManager(RecommendActivity.this);
                layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                mRecommRV.setLayoutManager(layoutManager);
                mRecommRV.setHasFixedSize(true);
                adapter = new RecoDetailsAdapter(RecommendActivity.this,list);
                mRecommRV.setAdapter(adapter);
                mSwipeRefreshWidget.setRefreshing(true);
                handler.sendEmptyMessageDelayed(2, 3000);
            }
        });


    }
    @Override
    public void onUpLoad() {//写这个,分页
        handler.sendEmptyMessageDelayed(1, 2000);
    }

    @Override
    public void onRefresh() {//下拉刷新

        handler.sendEmptyMessageDelayed(0, 3000);
    }
}
