package com.example.nr.nongren.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.nr.nongren.R;

public class Mine_PhoneNumber01 extends AppCompatActivity {

    private TextView tv_phone_basenumber;
    private Button bt_phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine__phone_number01);
        initView();
    }

    private void initView() {
        tv_phone_basenumber = ((TextView) findViewById(R.id.tv_phone_basenumber));

        bt_phoneNumber = ((Button) findViewById(R.id.bt_phoneNumber));
        bt_phoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Mine_PhoneNumber02.class);
                startActivity(intent);
            }
        });

    }
}
