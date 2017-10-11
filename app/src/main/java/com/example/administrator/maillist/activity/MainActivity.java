package com.example.administrator.maillist.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.RadioGroup;

import com.example.administrator.maillist.R;
import com.example.administrator.maillist.fragment.DialFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.base.XFragmentAdapter;
import cn.droidlover.xdroidmvp.mvp.XActivity;

/**
 * Created by Administrator on 2017/10/5.
 */

public class MainActivity extends XActivity {

    //获取控件
    @BindView(R.id.content_view_pager)
    ViewPager mViewPager;
    @BindView(R.id.top_tabLayout)
    TabLayout mTabLayout;
//    @BindView(R.id.top_radio_group)
//    RadioGroup mRadioGroup;

    XFragmentAdapter adapter;
    List<Fragment> fragmentList = new ArrayList<>();
    String[] titles = {"拨号", "联系人", "信息", "个人中心"};
//    String[] titles = {"Dial", "Contacts", "Message", "Personal"};

    @Override
    public void initData(Bundle savedInstanceState) {
        fragmentList.clear();
        fragmentList.add(DialFragment.newInstance());
        fragmentList.add(DialFragment.newInstance());
        fragmentList.add(DialFragment.newInstance());

        if (adapter == null) {
            adapter = new XFragmentAdapter(getSupportFragmentManager(), fragmentList, titles);
        }
        mViewPager.setAdapter(adapter);
        mViewPager.setOffscreenPageLimit(4);

        mTabLayout.setupWithViewPager(mViewPager);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public Object newP() {
        return null;
    }
}
