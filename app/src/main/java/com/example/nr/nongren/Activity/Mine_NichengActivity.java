package com.example.nr.nongren.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nr.nongren.R;

public class Mine_NichengActivity extends AppCompatActivity {


    private TextView tv_nicheng;
    private EditText tv_write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine__nicheng);
        initView();

    }

    private void initView() {
        tv_nicheng = ((TextView) findViewById(R.id.tv_nicheng));
        tv_write = ((EditText) findViewById(R.id.tv_write));

    }
}
