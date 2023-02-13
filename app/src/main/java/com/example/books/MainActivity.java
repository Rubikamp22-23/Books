package com.example.books;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.books.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.alchemistName.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Alchemist_layout.class));
        });

        binding.theDarkSide.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, dark_side_layout.class));
        });

        binding.midnightLibrary.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Midnight_Layout.class));
        });






    }
}