package com.example.arithmeticapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OddEven extends AppCompatActivity {
    EditText ed1;
    AppCompatButton res,bck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_odd_even);
        ed1=(EditText) findViewById(R.id.chket);
        res=(AppCompatButton) findViewById(R.id.chkres);
        bck=(AppCompatButton) findViewById(R.id.chkbtm);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int num=Integer.parseInt(ed1.getText().toString());
                    if (num%2==0)
                        Toast.makeText(getApplicationContext(),num+" is even",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(getApplicationContext(),num+" is odd",Toast.LENGTH_LONG).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
                }

            }
        });
        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 =new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i3);
            }
        });

    }
}