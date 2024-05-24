package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForHeart extends AppCompatActivity {

    Button back8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_heart);

        back8=findViewById(R.id.back8);
        back8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ForHeart.this,Pharmacies.class);
                startActivity(intent);
            }
        });
    }
}