package com.example.nr.nongren.Activity;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.example.nr.nongren.Adapter.FramerAdapter;
import com.example.nr.nongren.Api.ContentApi;
import com.example.nr.nongren.Bean.FarmerRelation;
import com.example.nr.nongren.MyView.SwipeRecyclerView;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import com.example.nr.nongren.Utils.Parser;
import java.util.ArrayList;
import java.util.List;
public class FarmerCircleActivity extends AppCompatActivity implements SwipeRecyclerView.OnRefreshAndLoadListener{
    public static  int currentpages = 1;
    private SwipeRecyclerView farmerRv;
    private FramerAdapter adapter;
    private String json,url;
    private List<FarmerRelation> mList;
    private SwipeRefreshLayout mSwipeLayout;
        Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                switch (msg.what){
                    case 0:
                        break;
                    case 1:
                        currentpages++;
                        url=String.format(ContentApi.HPME_FARMER_CIRCLE_URL,currentpages);
                        HttpUtils.downloadJson(FarmerCircleActivity.this, url, new HttpUtils.ResultCallBack() {
                            @Override
                            public void onSuccess(String s) {
                                json =s;
                                mList=Parser.parserCircle(json);
                                if (mList.size()>0){
                                    adapter = new FramerAdapter(FarmerCircleActivity.this,mList);
                                    farmerRv.setAdapter(adapter);
                                    farmerRv.completeLoad();
                                    adapter.notifyDataSetChanged();
                                }else{
                                    farmerRv.setVisibility(View.GONE);
                                    ImageView imageView = new ImageView(FarmerCircleActivity.this);
                                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                                            LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                                    //lp.setMargins(0, 100, 0, 200);
                                    imageView.setLayoutParams(lp);
                                    imageView.setImageResource(R.drawable.nothing);
                                    Toast.makeText(FarmerCircleActivity.this,"农人圈已经没有更新啦！",Toast.LENGTH_SHORT).show();

                                }
                            }
                        });
                        break;
                    case 2:
                        currentpages=1;
                        url=String.format(ContentApi.HPME_FARMER_CIRCLE_URL,currentpages);
                        HttpUtils.downloadJson(FarmerCircleActivity.this, url, new HttpUtils.ResultCallBack() {
                            @Override
                            public void onSuccess(String s) {
                                json =s;
                                mList=Parser.parserCircle(json);
                                Log.e("AAAAAA",String.valueOf(mList.size()));
                                adapter = new FramerAdapter(FarmerCircleActivity.this,mList);
                                farmerRv.setAdapter(adapter);
                                farmerRv.completeLoad();
                                adapter.notifyDataSetChanged();
                            }
                        });
                    mSwipeLayout.setRefreshing(false);
                    Toast.makeText(FarmerCircleActivity.this, "这已经是最新的农人啦(●'◡'●)！", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_circle);
        farmerRv = ((SwipeRecyclerView) findViewById(R.id.farmer_rv));
        mSwipeLayout = ((SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout));
        mSwipeLayout.setColorSchemeResources(android.R.color.holo_blue_light, android.R.color.holo_red_light,
                android.R.color.holo_orange_light, android.R.color.holo_green_light);
        mSwipeLayout.setProgressViewOffset(true, -50, (int) TypedValue
                .applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50, getResources()
                        .getDisplayMetrics()));
        farmerRv.setOnRefreshAndLoadListener(mSwipeLayout, this);
        mList =new ArrayList<FarmerRelation>();
        url = String.format(ContentApi.HPME_FARMER_CIRCLE_URL,currentpages);
        HttpUtils.downloadJson(this, url, new HttpUtils.ResultCallBack() {
            @Override
            public void onSuccess(String s) {
                json =s;
                mList=Parser.parserCircle(json);
                LinearLayoutManager layoutManager = new LinearLayoutManager(FarmerCircleActivity.this);
                layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                farmerRv.setLayoutManager(layoutManager);
                farmerRv.setHasFixedSize(true);
                adapter = new FramerAdapter(FarmerCircleActivity.this,mList);
                farmerRv.setAdapter(adapter);
                mSwipeLayout.setRefreshing(true);
                handler.sendEmptyMessageDelayed(2, 3000);
            }
        });
    }

    @Override
    public void onUpLoad() {
        handler.sendEmptyMessageDelayed(1, 2000);
    }

    @Override
    public void onRefresh() {
        handler.sendEmptyMessageDelayed(0, 3000);
    }
}
