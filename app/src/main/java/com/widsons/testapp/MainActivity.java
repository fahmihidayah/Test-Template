package com.widsons.testapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.widsons.testapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setActivity(this);
    }

    public void onClickGoToPageOne() {
        Intent intentOne = new Intent(this, PageOneActivity.class);
        startActivity(intentOne);
    }

    public void onClickGoToPageTwo() {
        Intent intentTwo = new Intent(this, PageTwoActivity.class);
        startActivity(intentTwo);
    }
}