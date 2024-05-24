package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Spec1 extends AppCompatActivity {
    public WebView webView;
    Button back1;
    Button FirstBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spec1);

        back1=findViewById(R.id.back);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Spec1.this,Drs.class);
                startActivity(intent);
            }
        });
        FirstBtn=findViewById(R.id.FirstBtn);
        FirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView=(WebView) findViewById(R.id.wv);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://muscatprivatehospital.com/services/physiotherapy/");
            }
        });
    }
}