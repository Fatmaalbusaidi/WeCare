package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Spec3 extends AppCompatActivity {
    public WebView webView;
    Button back3;
    Button FirstBtn3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spec3);

        back3=findViewById(R.id.back3);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Spec3.this,Drs.class);
                startActivity(intent);
            }
        });
        FirstBtn3=findViewById(R.id.FirstBtn3);
        FirstBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView=(WebView) findViewById(R.id.wv3);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.finlandeyecenter.com/index");
            }
        });
    }
}