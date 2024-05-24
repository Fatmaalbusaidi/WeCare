package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HospType extends AppCompatActivity {
    Button nobutton;
    Button bbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hosp_type);

        nobutton=findViewById(R.id.nobutton);
        bbutton=findViewById(R.id.bbutton);

        nobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HospType.this,Emergency.class);
                startActivity(intent);
            }
        });

        bbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HospType.this,HActivity2.class);
                startActivity(intent);
            }
        });

        CardView card11 =findViewById(R.id.card11);
        card11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HospType.this,GovHos.class));
            }
        });

        CardView card22 =findViewById(R.id.card22);
        card22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HospType.this,PrivHos.class));
            }
        });
    }
}
