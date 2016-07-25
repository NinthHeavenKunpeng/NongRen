package com.example.nr.nongren.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.PopupWindow.OnDismissListener;
import com.example.nr.nongren.Api.ContentApi;
import com.example.nr.nongren.Bean.ShopThing;
import com.example.nr.nongren.Fragment.ShopFrag;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.HttpUtils;
import com.google.gson.Gson;
public class ShopActivity extends AppCompatActivity {
    Context context;
    private String url;
    private ImageView popImage1;
    private ImageButton mImageButton1,mImageButton2,mImageButton3;
    private TextView mTextView1,mTextView2,text1,text2,text3,text4,
            text5,text6,text7,text8,text9,text10,text11,text12,text13,text14;
    private int num=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        initView();
        // 检查activity使用的布局中是否有碎片容器
        if (findViewById(R.id.fragment_container) != null) {
            // 如果我们只是恢复先前的状态,
            // 那么我们什么都不用做，只是返回或者我们可以覆盖先前的碎片
            if (savedInstanceState != null) {
                return;
            }
            ShopFrag shopFrag = new ShopFrag();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, shopFrag).commit();
//            使用特别的指令从一个Intent开始一个activity，
//            把Intent中附加的数据做为碎片的参数。
//            shopFrag.setArguments(getIntent().getExtras());
            mImageButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ShopActivity.this,MainActivity.class);
                    intent.putExtra("item",2);
                    startActivity(intent);
                }
            });
        }
        mTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopwindow(v);
            }
        });
    }

    private void initView() {
        mImageButton1 = ((ImageButton) findViewById(R.id.contact_btn));
        mImageButton2 = ((ImageButton) findViewById(R.id.collection_btn));
        mImageButton3 = ((ImageButton) findViewById(R.id.shopcart_btn));
        mTextView1 = ((TextView) findViewById(R.id.shopcart_frag_tv));
        mTextView2 = ((TextView) findViewById(R.id.buy_frag_tv));
    }
    /**
     * 显示popupWindow
     */
    private void showPopwindow(View v) {
        // 利用layoutInflater获得View
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.pop_main, null);
        // 下面是两种方法得到宽度和高度 getWindow().getDecorView().getWidth()
        PopupWindow window = new PopupWindow(view,
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT);
        // 设置popWindow弹出窗体可点击，这句话必须添加，并且是true
        window.setFocusable(true);
        // 实例化一个ColorDrawable颜色为半透明
        ColorDrawable dw = new ColorDrawable(0xb0000000);
//        ColorDrawable dw = new ColorDrawable(0x00ffffff);
        window.setBackgroundDrawable(dw);

        // 设置popWindow的显示和消失动画
        window.setAnimationStyle(R.style.mypopwindow_anim_style);
        // 在底部显示
        window.showAtLocation(v,
                Gravity.BOTTOM, 0, 0);
        text1 = (TextView)view.findViewById(R.id.plus_tv);
        text2 = (TextView)view.findViewById(R.id.num_tv);
        text2.setText(String.valueOf(num));
        text3 = (TextView)view.findViewById(R.id.mius_tv);
        text4=(TextView)view.findViewById(R.id.buy_tv);//加入购物车
        text5 = (TextView)view.findViewById(R.id.money_num_pop_tv);//商品价格
        text6 = (TextView)view.findViewById(R.id.num_pop_tv);//商品库存
        text7 = (TextView)view.findViewById(R.id.weight_pop_tv);//商品规格
        text8 = (TextView)view.findViewById(R.id.text1);//商品1
        text9 = (TextView)view.findViewById(R.id.text2);//商品2
        text10 = (TextView)view.findViewById(R.id.text3);//商品3
        text11 = (TextView)view.findViewById(R.id.text4);//商品4
        text12 = (TextView)view.findViewById(R.id.text5);//商品5
        text13= (TextView)view.findViewById(R.id.text6);//商品6
        text14= (TextView)view.findViewById(R.id.text7);//商品7
        popImage1 = (ImageView)view.findViewById(R.id.thunibl_pop_iv);//商品图片
        Intent intent =getIntent();
        int id=intent.getIntExtra("id",0);
        url = String.format(ContentApi.HOME_SHOP_DETAILS_URL,id);
        HttpUtils.downloadJson(ShopActivity.this, url, new HttpUtils.ResultCallBack() {
            @Override
            public void onSuccess(String s) {
                Gson gson = new Gson();
                final ShopThing shopThing = gson.fromJson(s, ShopThing.class);
                text5.setText("￥" + shopThing.getSubProducts().get(0).getAnong_price());
                text6.setText("库存：" + shopThing.getStock_num());
                int size = shopThing.getSubProducts().size();
                switch (size){
                    case 0:
                        break;
                    case 1:
                        text7.setText(shopThing.getSubProducts().get(0).getType());
                        text8.setText(shopThing.getSubProducts().get(0).getType());
                        text9.setVisibility(View.GONE);
                        text10.setVisibility(View.GONE);
                        text11.setVisibility(View.GONE);
                        text12.setVisibility(View.GONE);
                        text13.setVisibility(View.GONE);
                        text14.setVisibility(View.GONE);
                        break;
                    case 2:
                        text7.setText("请选择规格");
                        text8.setText(shopThing.getSubProducts().get(0).getType());
                        text8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(0).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(0).getAnong_price());
                            }
                        });
                        text9.setText(shopThing.getSubProducts().get(1).getType());
                        text9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(1).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(1).getAnong_price());
                            }
                        });
                        text10.setVisibility(View.GONE);
                        text11.setVisibility(View.GONE);
                        text12.setVisibility(View.GONE);
                        text13.setVisibility(View.GONE);
                        text14.setVisibility(View.GONE);
                        break;
                    case 3:
                        text7.setText("请选择规格");
                        text8.setText(shopThing.getSubProducts().get(0).getType());
                        text8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(0).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(0).getAnong_price());
                            }
                        });
                        text9.setText(shopThing.getSubProducts().get(1).getType());
                        text9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(1).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(1).getAnong_price());
                            }
                        });
                        text10.setText(shopThing.getSubProducts().get(2).getType());
                        text10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(2).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(2).getAnong_price());
                            }
                        });
                        text11.setVisibility(View.GONE);
                        text12.setVisibility(View.GONE);
                        text13.setVisibility(View.GONE);
                        text14.setVisibility(View.GONE);
                        break;
                    case 4:
                        text7.setText("请选择规格");
                        text8.setText(shopThing.getSubProducts().get(0).getType());
                        text8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(0).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(0).getAnong_price());
                            }
                        });
                        text9.setText(shopThing.getSubProducts().get(1).getType());
                        text9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(1).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(1).getAnong_price());
                            }
                        });
                        text10.setText(shopThing.getSubProducts().get(2).getType());
                        text10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(2).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(2).getAnong_price());
                            }
                        });
                        text11.setText(shopThing.getSubProducts().get(3).getType());
                        text11.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(3).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(3).getAnong_price());
                            }
                        });
                        text12.setVisibility(View.GONE);
                        text13.setVisibility(View.GONE);
                        text14.setVisibility(View.GONE);
                        break;
                    case 5:
                        text7.setText("请选择规格");
                        text8.setText(shopThing.getSubProducts().get(0).getType());
                        text8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(0).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(0).getAnong_price());
                            }
                        });
                        text9.setText(shopThing.getSubProducts().get(1).getType());
                        text9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(1).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(1).getAnong_price());
                            }
                        });
                        text10.setText(shopThing.getSubProducts().get(2).getType());
                        text10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(2).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(2).getAnong_price());
                            }
                        });
                        text11.setText(shopThing.getSubProducts().get(3).getType());
                        text11.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(3).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(3).getAnong_price());
                            }
                        });
                        text12.setText(shopThing.getSubProducts().get(4).getType());
                        text12.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(4).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(4).getAnong_price());
                            }
                        });
                        text13.setVisibility(View.GONE);
                        text14.setVisibility(View.GONE);
                        break;
                    case 6:
                        text7.setText("请选择规格");
                        text8.setText(shopThing.getSubProducts().get(0).getType());
                        text8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(0).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(0).getAnong_price());
                            }
                        });
                        text9.setText(shopThing.getSubProducts().get(1).getType());
                        text9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(1).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(1).getAnong_price());
                            }
                        });
                        text10.setText(shopThing.getSubProducts().get(2).getType());
                        text10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(2).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(2).getAnong_price());
                            }
                        });
                        text11.setText(shopThing.getSubProducts().get(3).getType());
                        text11.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(3).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(3).getAnong_price());
                            }
                        });
                        text12.setText(shopThing.getSubProducts().get(4).getType());
                        text12.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(4).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(4).getAnong_price());
                            }
                        });
                        text13.setText(shopThing.getSubProducts().get(5).getType());
                        text13.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(5).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(5).getAnong_price());
                            }
                        });
                        text14.setVisibility(View.GONE);
                        break;
                    case 7:
                        text7.setText("请选择规格");
                        text8.setText(shopThing.getSubProducts().get(0).getType());
                        text8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(0).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(0).getAnong_price());
                            }
                        });
                        text9.setText(shopThing.getSubProducts().get(1).getType());
                        text9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(1).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(1).getAnong_price());
                            }
                        });
                        text10.setText(shopThing.getSubProducts().get(2).getType());
                        text10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(2).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(2).getAnong_price());
                            }
                        });
                        text11.setText(shopThing.getSubProducts().get(3).getType());
                        text11.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(3).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(3).getAnong_price());
                            }
                        });
                        text12.setText(shopThing.getSubProducts().get(4).getType());
                        text12.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(4).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(4).getAnong_price());
                            }
                        });
                        text13.setText(shopThing.getSubProducts().get(5).getType());
                        text13.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(5).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(5).getAnong_price());
                            }
                        });
                        text14.setText(shopThing.getSubProducts().get(6).getType());
                        text14.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                text7.setText(shopThing.getSubProducts().get(6).getType());
                                text5.setText("￥" + shopThing.getSubProducts().get(6).getAnong_price());
                            }
                        });
                        break;
                }
                HttpUtils.downloadPic(shopThing.getThumbnail(),popImage1,ShopActivity.this);
            }
        });

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num++;
                text2.setText(String.valueOf(num));
            }
        });
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num--;
                text2.setText(String.valueOf(num));
            }
        });
        //popWindow消失监听方法
        window.setOnDismissListener(new OnDismissListener() {

            @Override
            public void onDismiss() {

            }
        });

    }
}



