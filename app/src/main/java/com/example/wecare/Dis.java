package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dis extends AppCompatActivity {
    Button home15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis);
        home15=findViewById(R.id.home15);
        home15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dis.this,HActivity2.class);
                startActivity(intent);
            }
        });
        CardView card111 =findViewById(R.id.card111);
        card111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dis.this,Dis1.class));
            }
        });
        CardView card222 =findViewById(R.id.card222);
        card222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dis.this,Dis2.class));
            }
        });
        CardView card333 =findViewById(R.id.card333);
        card333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dis.this,Dis3.class));
            }
        });

        CardView card444 =findViewById(R.id.card444);
        card444.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dis.this,Dis4.class));
            }
        });

    }
}