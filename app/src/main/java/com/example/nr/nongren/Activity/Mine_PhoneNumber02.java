package com.example.nr.nongren.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.nr.nongren.R;

public class Mine_PhoneNumber02 extends AppCompatActivity {

    private EditText et_PhoneWillbind;
    private EditText et_Phone_yanzhenma;
    private Button bt_PhoneGet_yanzhen_ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine__phone_number02);
        initView();
    }

    private void initView() {

        et_PhoneWillbind = ((EditText) findViewById(R.id.et_PhoneWillbind));


        et_Phone_yanzhenma = ((EditText) findViewById(R.id.et_Phone_yanzhenma));


        bt_PhoneGet_yanzhen_ma = ((Button) findViewById(R.id.bt_PhoneGet_yanzhen_ma));


    }
}
