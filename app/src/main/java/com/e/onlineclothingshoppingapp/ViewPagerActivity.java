package com.e.onlineclothingshoppingapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.e.onlineclothingshoppingapp.adapter.ViewPagerAdapter;
import com.e.onlineclothingshoppingapp.fragment.LoginFragment;
import com.e.onlineclothingshoppingapp.fragment.SignUpFragment;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        tabLayout = findViewById(R.id.tabId);
        viewPager = findViewById(R.id.viewPager);

        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.LoginFragment(new LoginFragment(),"Login");
        adapter.LoginFragment(new SignUpFragment(),"Signup");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
