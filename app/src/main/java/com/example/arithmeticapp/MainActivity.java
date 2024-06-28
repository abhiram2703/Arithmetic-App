package com.example.arithmeticapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MainActivity extends AppCompatActivity {
    AppCompatButton mb1,mb2,mb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       mb1=(AppCompatButton) findViewById(R.id.largemn);
       mb2=(AppCompatButton) findViewById(R.id.smallmn);
       mb3=(AppCompatButton) findViewById(R.id.odevmn);
        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(), Largest.class);
                startActivity(in);
            }
        });
        mb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 =new Intent(getApplicationContext(), Smallest.class);
                startActivity(in2);
            }
        });
        mb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 =new Intent(getApplicationContext(), OddEven.class);
                startActivity(in3);
            }
        });

    }
}