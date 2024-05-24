package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class GovHos extends AppCompatActivity {
    public WebView webView;
    Button FirstBtn5;
    Button back6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gov_hos);
        back6=findViewById(R.id.back6);

        back6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GovHos.this,HospType.class);
                startActivity(intent);
            }
        });
        FirstBtn5=findViewById(R.id.FirstBtn5);
        FirstBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView=(WebView) findViewById(R.id.wv5);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://royalhospital.med.om/eng/index.php");
            }
        });
    }
}