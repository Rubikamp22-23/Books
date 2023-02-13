package com.example.books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Alchemist_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alchemist_layout);
        Alchemist alchemist = new Alchemist();

        TextView textView = findViewById(R.id.writer2);
        textView.setText(alchemist.getWriter());

        TextView textView1 = findViewById(R.id.genre2);
        textView1.setText(alchemist.getGenre());

        TextView textView2 = findViewById(R.id.year2);
        textView2.setText(alchemist.getYear());

        TextView textView3 = findViewById(R.id.translator2);
        textView3.setText(alchemist.getTranslator());

        TextView textView4 = findViewById(R.id.price2);
        textView4.setText(alchemist.getPrice());




    }
}