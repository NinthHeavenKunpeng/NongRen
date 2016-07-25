package com.example.nr.nongren.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupMenu;

import com.example.nr.nongren.R;

public class Mine_HeadActivity extends AppCompatActivity {

    private LinearLayout ll_head_touciang;
    private PopupMenu pMenu;
    private LinearLayout ll_nicheng;
    private LinearLayout ll_sex;
    private LinearLayout ll_bind_shoujihao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine__head);
        initView();
    }

    private void initView() {

        //头
        ll_head_touciang = ((LinearLayout) findViewById(R.id.ll_head_touxiang));
        ll_head_touciang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pMenu = new PopupMenu(getApplication(), v);
                getMenuInflater().inflate(R.menu.head_menu, pMenu.getMenu());

                pMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_paizhao:

                                break;
                            case R.id.action_xuanqu:


                                break;
                            default:
                                break;

                        }
                        return false;
                    }
                });
                pMenu.show();
            }

        });



        //呢成
        ll_nicheng = ((LinearLayout) findViewById(R.id.ll_necheng));
        ll_nicheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Mine_NichengActivity.class);
                startActivity(intent);
            }
        });


        //性别   头
        ll_sex = ((LinearLayout) findViewById(R.id.ll_sex));
        ll_sex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        //绑定手机号
        ll_bind_shoujihao = ((LinearLayout) findViewById(R.id.ll_bind_shoujihao));
        ll_bind_shoujihao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Mine_PhoneNumber01.class);
                startActivity(intent);
            }
        });
        //登入密码


    }
}
