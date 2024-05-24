package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HActivity2 extends AppCompatActivity {
    Button button10;
    Button drbutton1;
    Button drbutton2;
    Button drbutton3;

    Button drbutton4;

    Button drbutton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hactivity2);
        button10=findViewById(R.id.button10);
        drbutton1=findViewById(R.id.drbutton1);
        drbutton2=findViewById(R.id.drbutton2);
        drbutton3=findViewById(R.id.drbutton3);
        drbutton4=findViewById(R.id.drbutton4);
        drbutton5=findViewById(R.id.drbutton5);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        drbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HActivity2.this,Drs.class);
                startActivity(intent);
            }
        });
        drbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HActivity2.this,HospType.class);
                startActivity(intent);
            }
        });

        drbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HActivity2.this,Dis.class);
                startActivity(intent);
            }
        });

        drbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HActivity2.this,Pharmacies.class);
                startActivity(intent);
            }
        });

        drbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HActivity2.this,HDetails.class);
                startActivity(intent);
            }
        });
    }
}
