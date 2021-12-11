package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Second_Toast extends AppCompatActivity {
    private TextView mShowCount1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_toast);
        mShowCount1 = findViewById(R.id.show_hello);}

        public void secondFrame(View view) {
            Intent intent = getIntent();
            String id = getIntent().getStringExtra("mCount");
            if (mShowCount1 != null)
                mShowCount1.setText("Hello andrea!"+ id);
            startActivity(intent);
        }

    }

