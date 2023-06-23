package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.hellotoast.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvCounter.setText(Integer.toString(counter));

        binding.btToast.setOnClickListener(v -> {
            Toast.makeText(this, "Holaaa!", Toast.LENGTH_SHORT).show();
        });

        binding.btCount.setOnClickListener(v -> {
            counter++;
            binding.tvCounter.setText(Integer.toString(counter));
        });
    }
}