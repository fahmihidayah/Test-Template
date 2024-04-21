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

    public void onClickGoToLuasLingkaran() {
        Intent intent = new Intent(this, LuasLingkaranActivity.class);
        startActivity(intent);
    }

    public void onClickGoToKelilingLingkaran() {
        Intent intent = new Intent(this, KelilingLingkaranActivity.class);
        startActivity(intent);
    }

    public void onClickGoToKelilingPersegiPanjang() {
        Intent intent = new Intent(this, PersegiPanjangActivity.class);
        startActivity(intent);
    }

    public void onClickGoToLuasSegitiga() {
        Intent intent = new Intent(this, SegiTigaActivity.class);
        startActivity(intent);
    }

}