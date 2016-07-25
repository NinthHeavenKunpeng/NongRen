package com.example.nr.nongren.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.nr.nongren.Adapter.FragmentAdapter;
import com.example.nr.nongren.Fragment.ClassifyFrag;
import com.example.nr.nongren.Fragment.HomeFrag;
import com.example.nr.nongren.Fragment.MineFrag;
import com.example.nr.nongren.Fragment.ShopCartFrag;
import com.example.nr.nongren.R;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private List<Fragment> data;
    private ImageButton[] icons;
    private FragmentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewPage);
        Intent intent = getIntent();
        int item = intent.getIntExtra("item", 0);
        data = new ArrayList<Fragment>();
        HomeFrag homeFrag = new HomeFrag();
        data.add(homeFrag);
        ClassifyFrag classifyFrag = new ClassifyFrag();
        data.add(classifyFrag);
        ShopCartFrag shopCartFrag = new ShopCartFrag();
        data.add(shopCartFrag);
        MineFrag mineFrag = new MineFrag();
        data.add(mineFrag);
        adapter = new FragmentAdapter(getSupportFragmentManager(),data);
        viewPager.setAdapter(adapter);
//        if ((viewPager.getCurrentItem()!=0)){
            viewPager.setCurrentItem(item);
       // }
        initDot();
        viewPager.setOffscreenPageLimit(3);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                for (int i = 0; i < 4; i++) {
                    icons[i].setEnabled(true);
                }

                icons[position].setEnabled(false);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    private void initDot(){
        // 创建存放点的数组
        icons = new ImageButton[4];
        // 获得存放点 控件的线性布局
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);

        // 循环获得线性布局中小点的控件，并设置图片
        for (int i = 0; i < 4; i++) {
            // 获得ViewGroup中指定位置的View,存放到数组中
            icons[i] = (ImageButton)layout.getChildAt(i);

            // 设置状态为true.与dot.xml文件中的选择器相关联
            icons[i].setEnabled(true);

            // 每个点与对应的索引相关联，01234
            icons[i].setTag(i);

            // 添加点的单击事件
            // 当点击点时，ViewPager的页面进行相应的切换
            icons[i].setOnClickListener(new View.OnClickListener() {

                // v,事件源，代表点击的点
                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    // 设置ViewPager的当前页面,点的索引与页面的索引一致
                    viewPager.setCurrentItem((Integer) v.getTag());
                }
            });
        }

        // 设置第一个点为选中状态
        icons[0].setEnabled(false);

    }
}
