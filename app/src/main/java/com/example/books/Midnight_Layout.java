package com.example.books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Midnight_Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midnight_layout);

        MidnightLibrary midnightLibrary = new MidnightLibrary();

        TextView textView = findViewById(R.id.writer3);
        textView.setText(midnightLibrary.getWriter());

        TextView textView1 = findViewById(R.id.genre3);
        textView1.setText(midnightLibrary.getGenre());

        TextView textView2 = findViewById(R.id.year3);
        textView2.setText(midnightLibrary.getYear());

        TextView textView3 = findViewById(R.id.translator3);
        textView3.setText(midnightLibrary.getTranslator());

        TextView textView4 = findViewById(R.id.price3);
        textView4.setText(midnightLibrary.getPrice());
    }
}