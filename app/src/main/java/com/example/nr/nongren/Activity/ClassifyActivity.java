package com.example.nr.nongren.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.example.nr.nongren.Adapter.ClassifyListAdapter;
import com.example.nr.nongren.Bean.ClassListBean;
import com.example.nr.nongren.Bean.Classifybase;
import com.example.nr.nongren.Api.ContentApi;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ClassifyActivity extends AppCompatActivity {

    private PullToRefreshListView classfylv;
    private int key;
    private String url = null;
    private List<Classifybase> baseData;
    private List<ClassListBean.ProductsBean> listBeanData;
    private List<ClassListBean.ProductsBean> listBeanData02;
    private List<ClassListBean.ProductsBean> listBeanData03;
    private ClassifyListAdapter listAdapter;
    private int page = 1;
    private ListView listView;
    private LinearLayout ll_xiaoliang;
    private LinearLayout ll_pingfei;
    private LinearLayout ll_jiage;
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classify);
        classfylv = ((PullToRefreshListView) findViewById(R.id.classifylv));
        baseData = new ArrayList<Classifybase>();


        listBeanData = new ArrayList<ClassListBean.ProductsBean>();
        listBeanData02 = new ArrayList<ClassListBean.ProductsBean>();
        listBeanData03= new ArrayList<ClassListBean.ProductsBean>();


        listView = classfylv.getRefreshableView();
        v = View.inflate(this, R.layout.head_list, null);
        initHead();


        listView.addHeaderView(v);

        listAdapter = new ClassifyListAdapter(getApplicationContext(), listBeanData);


        classfylv.setAdapter(listAdapter);
        classfylv.setMode(PullToRefreshBase.Mode.BOTH);
     /*  classfylv.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                //getList();
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
              getList("-month_purchase_times");
            }
        });*/
        getKey();
        initBaseDate();

    }

    private void initHead() {

        ll_xiaoliang = ((LinearLayout) v.findViewById(R.id.ll_xiaoliang));

        ll_pingfei = ((LinearLayout) v.findViewById(R.id.ll_pingfei));

        ll_jiage = ((LinearLayout) v.findViewById(R.id.ll_jiage));

    }

    public void rangeList() {
        final String s1="-month_purchase_times";
        final String  s2="-review_rating";
       final  String s3="-anong_price";
        //listBeanData.clear();
        classfylv.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                //getList();
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                getList("-month_purchase_times");
            }
        });
        ll_xiaoliang.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                page=1;
                listBeanData.clear();
                getList(s1);
                classfylv.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
                    @Override
                    public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                        //getList();
                    }

                    @Override
                    public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                        getList(s1);
                    }
                });

            }
        });
        ll_pingfei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Log.e("123331", "onClick: "+s2);
                page=1;
                listBeanData.clear();
                getList(s2);
                classfylv.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
                    @Override
                    public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                        //getList();
                    }

                    @Override
                    public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                        getList(s2);
                    }
                });


            }
        });
        ll_jiage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page=1;
                getList(s3);
                listBeanData.clear();
                classfylv.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
                    @Override
                    public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                        //getList();
                    }

                    @Override
                    public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                        getList(s3);
                    }
                });

            }
        });
    }

    private void getList(String s1) {
        String url02 = String.format(url, s1, page);
       // Log.e("1111111111111", "getList: "+url02);
        if (HttpUtils.checkNetWork(this)) {
            HttpUtils.downloadJson(this, url02, new HttpUtils.ResultCallBack() {
                @Override
                public void onSuccess(String s) {
                    List<ClassListBean.ProductsBean> list = new Gson().fromJson(s, ClassListBean.class).getProducts();

                    if (list != null && list.size() > 0) {
                        page++;
                        listBeanData.addAll(list);
                        listAdapter.notifyDataSetChanged();
                    } else {
                        Toast.makeText(getApplicationContext(), "没有更多内容", Toast.LENGTH_SHORT).show();
                    }
                    //让加载布局回去
                    if (classfylv.isRefreshing()) {
                        classfylv.onRefreshComplete();
                    }

                }


            });

        }
    }/*
    private void getList02(String s1) {
        String url02 = String.format(url, s1, page02);
        if (HttpUtils.checkNetWork(this)) {
            HttpUtils.downloadJson(this, url02, new HttpUtils.ResultCallBack() {
                @Override
                public void onSuccess(String s) {
                    List<ClassListBean.ProductsBean> list = new Gson().fromJson(s, ClassListBean.class).getProducts();

                    if (list != null && list.size() > 0) {
                        page++;
                        listBeanData.addAll(list);
                        listAdapter.notifyDataSetChanged();
                    } else {
                        Toast.makeText(getApplicationContext(), "没有更多内容", Toast.LENGTH_SHORT).show();
                    }

                    //让加载布局回去
                    if (classfylv.isRefreshing()) {
                        classfylv.onRefreshComplete();
                    }

                }


            });

        }
    }
    private void getList03(String s1) {
        listBeanData02.clear();
        listBeanData.clear();
        //String s1=" -month_purchase_times";
        String url02 = String.format(url,s1,page03);
        Log.e("33333333", "getList: "+url02);
        //page++;
        if (HttpUtils.checkNetWork(this)) {
            HttpUtils.downloadJson(this, url02, new HttpUtils.ResultCallBack() {
                @Override
                public void onSuccess(String s) {
                    List<ClassListBean.ProductsBean> list = new Gson().fromJson(s, ClassListBean.class).getProducts();

                    if (list != null && list.size() > 0) {
                        page++;
                        listBeanData.addAll(list);
                        listAdapter.notifyDataSetChanged();
                    } else {
                        Toast.makeText(getApplicationContext(), "没有更多内容", Toast.LENGTH_SHORT).show();
                    }

                    //让加载布局回去
                    if (classfylv.isRefreshing()) {
                        classfylv.onRefreshComplete();
                    }

                }


            });

        }
    }*/

    private void initBaseDate() {
        if (HttpUtils.checkNetWork(this)) {
            HttpUtils.downloadJson(this, ContentApi.BASE_URL, new HttpUtils.ResultCallBack() {
                @Override
                public void onSuccess(String s) {
                    // Log.e("AAAA", "onSuccess: "+s);
                    //这个错误的意思是，你按对象解析的，而实际它是一个数组。所以你用数组解析就可以了！
                    String s1 = s.substring(1, s.length());
                    parseJson(s1);
                  //  Log.e("CCCCCC", "onSuccess: " + baseData.get(0).getId());
                    // baseData = new Gson().fromJson(s1, Classifybase.class).getChildren();
                }
            });
        }

    }

    /* [
     {
         "id": 1,
             "parent_id": null,
             "title": "米面粮油",
             "treelist": "1",
             "sort": 1,
             "icon_url": "http://img.anong.com/image/FrontendCategory/1/icon/5A45E60AD1B5503C0932640E6C2C6B09.png@!original",
             "children": [
         {
             "id": 169,
                 "parent_id": 1,
                 "title": "豆类",
                 "treelist": "1/169",
                 "sort": 1,
                 "icon_url": null,
                 "children": []
         },*/
    public void parseJson(String json) {
        JSONObject o1 = null;
        try {
            o1 = new JSONObject(json);
            JSONArray arr = o1.getJSONArray("children");
            for (int i = 0; i < arr.length(); i++) {
                JSONObject o2 = arr.getJSONObject(i);
                Classifybase cf = new Classifybase();
                cf.setId(o2.getString("id"));
                baseData.add(cf);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

    private void getKey() {
        //  key = getIntent().getIntExtra("key");
        String s1="-month_purchase_times";

        key = getIntent().getIntExtra("key", 1);
        switch (key) {
            case 1:

                url = ContentApi.RICE_ALL_URL;
                getList(s1);
                rangeList();
                break;
           case 2:


                url = ContentApi.RICE_ALL_URL02;
               getList(s1);
                rangeList();
                break;
            case 3:
                url = ContentApi.RICE_ALL_URL03;
                getList(s1);
                rangeList();
                break;
            case 4:
                url = ContentApi.RICE_ALL_URL04;
                getList(s1);
                rangeList();
                break;
            case 5:
                url = ContentApi.RICE_ALL_URL05;
                getList(s1);
                rangeList();
                break;
            case 6:
                url = ContentApi.RICE_ALL_URL06;

                getList(s1);
                rangeList();
                break;
            case 7:
                url = ContentApi.RICE_ALL_URL07;
                getList(s1);
                rangeList();
                break;
            case 8:
                url = ContentApi.RICE_ALL_URL08;
                getList(s1);
                rangeList();
                break;
            case 9:
                url = ContentApi.RICE_ALL_URL09;
                getList(s1);
                rangeList();
                break;
            case 10:
                url = ContentApi.RICE_ALL_URL10;
                getList(s1);
                rangeList();
                break;
            case 11:
                url = ContentApi.RICE_ALL_URL11;
                getList(s1);
                rangeList();
                break;
            case 12:
                url = ContentApi.RICE_ALL_URL12;
                getList(s1);
                rangeList();
                break;


            //干货副食

           case 13:
                url = ContentApi.GANHUO_ALL_URL;
               getList(s1);
               rangeList();
                break;
            case 14:
                url = ContentApi.GANHUO_ALL_URL02;
                getList(s1);
                rangeList();
                break;
            case 15:

                url = ContentApi.GANHUO_ALL_URL03;
                getList(s1);
                rangeList();
                break;
            case 16:
                url = ContentApi.GANHUO_ALL_URL04;
                getList(s1);
                rangeList();

                break;
            case 17:

                url = ContentApi.GANHUO_ALL_URL05;
                getList(s1);
                rangeList();
                break;
            case 18:
                url = ContentApi.GANHUO_ALL_URL06;
                getList(s1);
                rangeList();

                break;
            case 19:
                url = ContentApi.GANHUO_ALL_URL07;
                getList(s1);
                rangeList();

                break;
            case 20:
                url = ContentApi.GANHUO_ALL_URL08;
                getList(s1);
                rangeList();

                break;
            case 21:

                url = ContentApi.GANHUO_ALL_URL09;
                getList(s1);
                rangeList();
                break;
            case 22:
                url = ContentApi.GANHUO_ALL_URL10;
                getList(s1);
                rangeList();

                break;
            case 23:

                url = ContentApi.GANHUO_ALL_URL11;
                getList(s1);
                rangeList();
                break;
            case 24:

                url = ContentApi.GANHUO_ALL_URL12;
                getList(s1);
                rangeList();
                break;
            case 25:
                url = ContentApi.GANHUO_ALL_URL13;
                getList(s1);
                rangeList();

                break;
            case 26:
                url = ContentApi.GANHUO_ALL_URL14;
                getList(s1);
                rangeList();

                break;
            case 27:

                url = ContentApi.GANHUO_ALL_URL15;
                getList(s1);
                rangeList();
                break;

            //干果蜜饯 13
            case 28:
                url = ContentApi.GANGUO_ALL_URL;
                getList(s1);
                rangeList();
                break;
            case 29:
                url = ContentApi.GANGUO_ALL_URL02;
                getList(s1);
                rangeList();

                break;
            case 30:
                url = ContentApi.GANGUO_ALL_URL03;
                getList(s1);
                rangeList();

                break;
            case 31:
                url = ContentApi.GANGUO_ALL_URL04;
                getList(s1);
                rangeList();

                break;
            case 32:
                url = ContentApi.GANGUO_ALL_URL05;
                getList(s1);
                rangeList();

                break;
            case 33:
                url = ContentApi.GANGUO_ALL_URL06;
                getList(s1);
                rangeList();

                break;
            case 34:
                url = ContentApi.GANGUO_ALL_URL07;
                getList(s1);
                rangeList();

                break;
            case 35:
                url = ContentApi.GANGUO_ALL_URL08;
                getList(s1);
                rangeList();

                break;
            case 36:
                url = ContentApi.GANGUO_ALL_URL09;
                getList(s1);
                rangeList();

                break;
            case 37:
                url = ContentApi.GANGUO_ALL_URL10;
                getList(s1);
                rangeList();

                break;
            case 38:
                url = ContentApi.GANGUO_ALL_URL11;
                getList(s1);
                rangeList();

                break;
            case 39:
                url = ContentApi.GANGUO_ALL_URL12;
                getList(s1);
                rangeList();

                break;
            case 40:
                url = ContentApi.GANGUO_ALL_URL13;
                getList(s1);
                rangeList();

                break;

            //生鲜水果27
            case 41:

                url = ContentApi.FRUIT_ALL_URL;
                getList(s1);
                rangeList();
                break;
            case 42:
                url = ContentApi.FRUIT_ALL_URL02;
                getList(s1);
                rangeList();

                break;
            case 43:
                url = ContentApi.FRUIT_ALL_URL03;
                getList(s1);
                rangeList();

                break;
            case 44:
                url = ContentApi.FRUIT_ALL_URL04;
                getList(s1);
                rangeList();

                break;
            case 45:
                url = ContentApi.FRUIT_ALL_URL05;
                getList(s1);
                rangeList();

                break;
            case 46:
                url = ContentApi.FRUIT_ALL_URL06;
                getList(s1);
                rangeList();

                break;
            case 47:
                url = ContentApi.FRUIT_ALL_URL07;
                getList(s1);
                rangeList();

                break;
            case 48:
                url = ContentApi.FRUIT_ALL_URL08;
                getList(s1);
                rangeList();

                break;
            case 49:

                url = ContentApi.FRUIT_ALL_URL09;
                getList(s1);
                rangeList();
                break;
            case 50:
                url = ContentApi.FRUIT_ALL_URL10;
                getList(s1);
                rangeList();

                break;
            case 51:

                url = ContentApi.FRUIT_ALL_URL11;
                getList(s1);
                rangeList();
                break;
            case 52:
                url = ContentApi.FRUIT_ALL_URL12;
                getList(s1);
                rangeList();

                break;
            case 53:

                url = ContentApi.FRUIT_ALL_URL13;
                getList(s1);
                rangeList();
                break;
            case 54:
                url = ContentApi.FRUIT_ALL_URL14;
                getList(s1);
                rangeList();

                break;
            case 55:

                url = ContentApi.FRUIT_ALL_URL15;
                getList(s1);
                rangeList();
                break;
            case 56:

                url = ContentApi.FRUIT_ALL_URL16;
                getList(s1);
                rangeList();
                break;
            case 57:

                url = ContentApi.FRUIT_ALL_URL17;
                getList(s1);
                rangeList();
                break;
            case 58:
                url = ContentApi.FRUIT_ALL_URL18;
                getList(s1);
                rangeList();

                break;
            case 59:
                url = ContentApi.FRUIT_ALL_URL19;
                getList(s1);
                rangeList();

                break;
            case 60:
                url = ContentApi.FRUIT_ALL_URL20;
                getList(s1);
                rangeList();

                break;
            case 61:

                url = ContentApi.FRUIT_ALL_URL21;
                getList(s1);
                rangeList();
                break;
            case 62:

                url = ContentApi.FRUIT_ALL_URL22;
                getList(s1);
                rangeList();
                break;
            case 63:

                url = ContentApi.FRUIT_ALL_URL23;
                getList(s1);
                rangeList();
                break;
            case 64:

                url = ContentApi.FRUIT_ALL_URL24;
                getList(s1);
                rangeList();
                break;
            case 65:
                url = ContentApi.FRUIT_ALL_URL25;
                getList(s1);
                rangeList();

                break;
            case 66:

                url = ContentApi.FRUIT_ALL_URL26;
                getList(s1);
                rangeList();
                break;
            case 67:

                url = ContentApi.FRUIT_ALL_URL27;
                getList(s1);
                rangeList();
                break;

            //茶饮冲剂
            case 68:
                url = ContentApi.TER_ALL_URL;
                getList(s1);
                rangeList();
                break;
            case 69:
                url = ContentApi.TER_ALL_URL02;
                getList(s1);
                rangeList();
                break;
            case 70:
                url = ContentApi.TER_ALL_URL03;
                getList(s1);
                rangeList();
                break;
            case 71:
                url = ContentApi.TER_ALL_URL04;
                getList(s1);
                rangeList();
                break;
            case 72:
                url = ContentApi.TER_ALL_URL05;
                getList(s1);
                rangeList();
                break;
            case 73:
                url = ContentApi.TER_ALL_URL06;
                getList(s1);
                rangeList();
                break;
            case 74:
                url = ContentApi.TER_ALL_URL07;
                getList(s1);
                rangeList();
                break;
            case 75:
                url = ContentApi.TER_ALL_URL08;
                getList(s1);
                rangeList();
                break;
            case 76:
                url = ContentApi.TER_ALL_URL09;
                getList(s1);
                rangeList();
                break;
            case 77:
                url = ContentApi.TER_ALL_URL10;
                getList(s1);
                rangeList();
                break;
            case 78:
                url = ContentApi.TER_ALL_URL11;
                getList(s1);
                rangeList();
                break;
            case 79:
                url = ContentApi.TER_ALL_URL12;
                getList(s1);
                rangeList();
                break;
            case 80:
                url = ContentApi.TER_ALL_URL13;
                getList(s1);
                rangeList();
                break;


            //滋补营养20

            case 81:
                url = ContentApi.ZIBU_ALL_URL;
                getList(s1);
                rangeList();
                break;
            case 82:
                url = ContentApi.ZIBU_ALL_URL02;
                getList(s1);
                rangeList();
                break;
            case 83:
                url = ContentApi.ZIBU_ALL_URL03;
                getList(s1);
                rangeList();
                break;
            case 84:
                url = ContentApi.ZIBU_ALL_URL04;
                getList(s1);
                rangeList();
                break;
            case 85:
                url = ContentApi.ZIBU_ALL_URL05;
                getList(s1);
                rangeList();
                break;
            case 86:
                url = ContentApi.ZIBU_ALL_URL06;
                getList(s1);
                rangeList();
                break;
            case 87:
                url = ContentApi.ZIBU_ALL_URL07;
                getList(s1);
                rangeList();
                break;
            case 88:
                url = ContentApi.ZIBU_ALL_URL08;
                getList(s1);
                rangeList();
                break;
            case 89:
                url = ContentApi.ZIBU_ALL_URL09;
                getList(s1);
                rangeList();
                break;
            case 90:
                url = ContentApi.ZIBU_ALL_URL10;
                getList(s1);
                rangeList();
                break;
            case 91:
                url = ContentApi.ZIBU_ALL_URL11;
                getList(s1);
                rangeList();
                break;
            case 92:
                url = ContentApi.ZIBU_ALL_URL12;
                getList(s1);
                rangeList();
                break;
            case 93:
                url = ContentApi.ZIBU_ALL_URL13;
                getList(s1);
                rangeList();
                break;
            case 94:
                url = ContentApi.ZIBU_ALL_URL14;
                getList(s1);
                rangeList();
                break;
            case 95:
                url = ContentApi.ZIBU_ALL_URL15;
                getList(s1);
                rangeList();
                break;
            case 96:
                url = ContentApi.ZIBU_ALL_URL16;
                getList(s1);
                rangeList();
                break;
            case 97:
                url = ContentApi.ZIBU_ALL_URL17;
                getList(s1);
                rangeList();
                break;
            case 98:
                url = ContentApi.ZIBU_ALL_URL18;
                getList(s1);
                rangeList();
                break;
            case 99:
                url = ContentApi.ZIBU_ALL_URL19;
                getList(s1);
                rangeList();
                break;
            case 100:
                url = ContentApi.ZIBU_ALL_URL20;
                getList(s1);
                rangeList();
                break;


            //休闲零食
            case 101:
                url = ContentApi.XIUXIAN_ALL_URL;
                getList(s1);
                rangeList();
                break;
            case 102:
                url = ContentApi.XIUXIAN_ALL_URL02;
                getList(s1);
                rangeList();
                break;
            case 103:
                url = ContentApi.XIUXIAN_ALL_URL03;
                getList(s1);
                rangeList();
                break;
            case 104:
                url = ContentApi.XIUXIAN_ALL_URL04;
                getList(s1);
                rangeList();
                break;
            case 105:
                url = ContentApi.XIUXIAN_ALL_URL05;
                getList(s1);
                rangeList();
                break;
            case 106:
                url = ContentApi.XIUXIAN_ALL_URL06;
                getList(s1);
                rangeList();
                break;
            case 107:
                url = ContentApi.XIUXIAN_ALL_URL07;
                getList(s1);
                rangeList();
                break;
            case 108:
                url = ContentApi.XIUXIAN_ALL_URL08;
                getList(s1);
                rangeList();
                break;
            case 109:
                url = ContentApi.XIUXIAN_ALL_URL09;
                getList(s1);
                rangeList();
                break;
            case 110:
                url = ContentApi.XIUXIAN_ALL_URL10;
                getList(s1);
                rangeList();
                break;
            case 111:
                url = ContentApi.XIUXIAN_ALL_URL11;
                getList(s1);
                rangeList();
                break;
            case 112:
                url = ContentApi.XIUXIAN_ALL_URL12;
                getList(s1);
                rangeList();
                break;
            case 113:
                url = ContentApi.XIUXIAN_ALL_URL13;
                getList(s1);
                rangeList();
                break;
            case 114:
                url = ContentApi.XIUXIAN_ALL_URL14;
                getList(s1);
                rangeList();
                break;
            case 115:
                url = ContentApi.XIUXIAN_ALL_URL15;
                getList(s1);
                rangeList();
                break;


        }
    }


}
