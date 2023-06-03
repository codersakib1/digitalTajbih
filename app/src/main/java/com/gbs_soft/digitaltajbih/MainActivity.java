package com.gbs_soft.digitaltajbih;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvCount;
    Button buttonAdd, buttonSub, buttonReset;
    int count = 0;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvCount = findViewById(R.id.tvCount);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonReset = findViewById(R.id.buttonReset);



        buttonAdd.setOnClickListener(view -> {
            count = count+1;
            tvCount.setText(""+count);

        });


        buttonSub.setOnClickListener(view -> {
            count--;
            tvCount.setText(""+count);


        });


        buttonReset.setOnClickListener(view -> {

            count=0;
            tvCount.setText(""+count);

        });



    }
}