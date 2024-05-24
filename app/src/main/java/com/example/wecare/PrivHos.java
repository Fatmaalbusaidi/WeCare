package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class PrivHos extends AppCompatActivity {
    public WebView webView;
    Button FirstBtn6;
    Button back7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priv_hos);

        back7=findViewById(R.id.back7);
        back7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PrivHos.this,HospType.class);
                startActivity(intent);
            }
        });

        FirstBtn6=findViewById(R.id.FirstBtn6);
        FirstBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView=(WebView) findViewById(R.id.wv6);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://omaninternationalhospital.com/");
            }
        });
    }
}