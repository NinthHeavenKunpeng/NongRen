package com.example.nr.nongren.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by hjw on 2016/7/21.
 */
public class MyFragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;
    private String[] titles = new String[]{"图文详情", "商品参数"};
    public  MyFragmentAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int fragment) {
        return fragments.get(fragment);
    }

    public int getCount() {
        return fragments.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}

