package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Spec2 extends AppCompatActivity {

    public WebView webView;
    Button FirstBtn2;
    Button back2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spec2);

        back2=findViewById(R.id.back2);

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Spec2.this,Drs.class);
                startActivity(intent);
            }
        });

        FirstBtn2=findViewById(R.id.FirstBtn2);

        FirstBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView=(WebView) findViewById(R.id.wv2);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("https://www.fuh.care/updates/fuh-heart-institute?gclid=Cj0KCQjwyLGjBhDKARIsAFRNgW81suddKKuuzEDcHQ45kDfLqoSedx0eKPMSZp27frg-NIUKyqZiloMaAj9bEALw_wcB");
            }
        });
    }
}