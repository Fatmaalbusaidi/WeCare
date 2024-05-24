package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Drs extends AppCompatActivity {
    Button home1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drs);

        home1=findViewById(R.id.home1);

        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Drs.this,HActivity2.class);
                startActivity(intent);
            }
        });
        CardView card1 = findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Drs.this,Spec1.class));
            }
        });
        CardView card2 = findViewById(R.id.card2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Drs.this,Spec2.class));
            }
        });


        CardView card3 =findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Drs.this,Spec3.class));
            }
        });

        CardView card4 =findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Drs.this,Spec4.class));
            }
        });

    }
}