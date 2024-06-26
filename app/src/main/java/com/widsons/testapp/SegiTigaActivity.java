package com.widsons.testapp;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.widsons.testapp.databinding.ActivitySegiTigaBinding;

public class SegiTigaActivity extends AppCompatActivity {

    ActivitySegiTigaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_segi_tiga);
        binding.setActivity(this);
    }

    public void onClickHitung() {
        double alas = Double.parseDouble(binding.editTextAlas.getText().toString());
        double tinggi = Double.parseDouble(binding.editTextTinggi.getText().toString());
        // hitung di sini
        binding.textViewHasil.setText("hasil adalah : ");
    }
}