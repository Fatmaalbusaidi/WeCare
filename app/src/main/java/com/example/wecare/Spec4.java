package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Spec4 extends AppCompatActivity {
    public WebView webView;
    Button FirstBtn4;
    Button back4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spec4);

        back4=findViewById(R.id.back4);
        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Spec4.this,Drs.class);
                startActivity(intent);
            }
        });
        FirstBtn4=findViewById(R.id.FirstBtn4);
        FirstBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView=(WebView) findViewById(R.id.wv4);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.wassandental.com");
            }
        });
    }
}