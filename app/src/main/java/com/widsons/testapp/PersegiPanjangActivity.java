package com.widsons.testapp;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.widsons.testapp.databinding.ActivityPersegiPanjangBinding;

public class PersegiPanjangActivity extends AppCompatActivity {

    ActivityPersegiPanjangBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_persegi_panjang);
        binding.setActivity(this);
    }
    public void onClickHitung() {
        Toast.makeText(this, "Hasil here", Toast.LENGTH_SHORT).show();
    }
}