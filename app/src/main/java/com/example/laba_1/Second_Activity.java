package com.example.laba_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String surname = getIntent().getStringExtra("Жидков");
        TextView textView = findViewById(R.id.textView);
        textView.setText("Переданный параметр: "+ surname);
    }
}