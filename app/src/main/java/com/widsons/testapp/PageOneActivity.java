package com.widsons.testapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.widsons.testapp.databinding.ActivityPageOneBinding;

public class PageOneActivity extends AppCompatActivity {
    ActivityPageOneBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_page_one);
        binding.setActivity(this);
    }

    public void onClickOperation() {



    }
}