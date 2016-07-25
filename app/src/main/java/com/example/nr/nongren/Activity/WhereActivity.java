package com.example.nr.nongren.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.nr.nongren.Bean.City;
import com.example.nr.nongren.Bean.District;
import com.example.nr.nongren.Bean.Province;
import com.example.nr.nongren.R;
import com.example.nr.nongren.Utils.Parser;
import java.util.ArrayList;
import java.util.List;
public class WhereActivity extends AppCompatActivity {
    private Spinner spinner1,spinner2,spinner3;
    private  Province province = null;
    private List<City> city;
    private List<Province> list ;
    private List<District> dis;
    private ArrayAdapter<Province> arrayAdapter1;
    private ArrayAdapter<City> arrayAdapter2;
    private ArrayAdapter<District>arrayAdapter3;
    private String  provinces,cities,districts;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where);
        spinner3 = (Spinner)findViewById(R.id.s3);
        spinner2 = (Spinner)findViewById(R.id.s2);
        spinner1 = (Spinner)findViewById(R.id.s1);
        button = (Button) findViewById(R.id.where_btn);
        list = new ArrayList<Province>();
        city = new ArrayList<City>();
        dis = new ArrayList<District>();
        list= Parser.parser(this);
        arrayAdapter1 = new ArrayAdapter<Province>(this,R.layout.support_simple_spinner_dropdown_item,list);
        arrayAdapter2 = new ArrayAdapter<City>(this,R.layout.support_simple_spinner_dropdown_item,list.get(0).getCitys());
        arrayAdapter3 = new ArrayAdapter<District>(this,R.layout.support_simple_spinner_dropdown_item,list.get(0).getCitys().get(0).getDistricts());
        spinner1.setAdapter(arrayAdapter1);
        spinner1.setSelection(0, true);
        spinner2.setAdapter(arrayAdapter2);
        spinner2.setSelection(0, true);
        spinner3.setAdapter(arrayAdapter3);
        spinner3.setSelection(0, true);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                province = list.get(position);
                provinces = list.get(position).getName();
                city = list.get(position).getCitys();
                arrayAdapter2 = new ArrayAdapter<City>(WhereActivity.this, R.layout.support_simple_spinner_dropdown_item, list.get(position).getCitys());
                spinner2.setAdapter(arrayAdapter2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                arrayAdapter3 = new ArrayAdapter<District>(WhereActivity.this,R.layout.support_simple_spinner_dropdown_item,province.getCitys().get(position).getDistricts());
                cities = city.get(position).getName();
                dis = city.get(position).getDistricts();
                spinner3.setAdapter(arrayAdapter3);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                districts=dis.get(position).getName();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intnet = new Intent(WhereActivity.this,ShopActivity.class);
                intnet.putExtra("pro",provinces);
                intnet.putExtra("city",cities);
                intnet.putExtra("dist",districts);
                startActivity(intnet);
            }
        });

    }
}
