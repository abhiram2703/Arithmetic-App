package com.example.arithmeticapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class Smallest extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton res,bck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_smallest);
        ed1=(EditText) findViewById(R.id.smaet1);
        ed2=(EditText) findViewById(R.id.smaet2);
        res=(AppCompatButton) findViewById(R.id.smares);
        bck=(AppCompatButton) findViewById(R.id.smabtm);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int n1 = Integer.parseInt(ed1.getText().toString());
                    int n2 = Integer.parseInt(ed2.getText().toString());
                    if (n1 > n2)
                        Toast.makeText(getApplicationContext(), "Smallest=" + n2, Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(getApplicationContext(), "Smallest=" + n1, Toast.LENGTH_LONG).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),e.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 =new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i2);
            }
        });

    }
}