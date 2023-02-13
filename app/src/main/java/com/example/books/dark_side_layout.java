package com.example.books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class dark_side_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darkside_layout);
        DarkSide darkSide = new DarkSide();

        TextView textView = findViewById(R.id.writer3);
        textView.setText(darkSide.getWriter());

        TextView textView1 = findViewById(R.id.genre3);
        textView1.setText(darkSide.getGenre());

        TextView textView2 = findViewById(R.id.year3);
        textView2.setText(darkSide.getYear());

        TextView textView3 = findViewById(R.id.translator3);
        textView3.setText("فرناز فرود");

        TextView textView4 = findViewById(R.id.price3);
        textView4.setText("60");




    }
}