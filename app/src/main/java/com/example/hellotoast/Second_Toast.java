package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Second_Toast extends AppCompatActivity {
    private TextView mShowCount1;
    private TextView mShowCount2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_toast);
        mShowCount2 = findViewById(R.id.show_hello);
        mShowCount1 = findViewById(R.id.show_it);}
        Intent intent = getIntent();
        String count = getIntent().getStringExtra("mCount");
        mShowCount1.setText(count);



    }
}

