package com.ucccwr.ontv;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Binding MainActivity.java with
        // activity_main.xml file
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // Find the WebView by its unique ID
        WebView w = (WebView) findViewById(R.id.web);

        // loading http://www.google.com url in the the WebView.
        w.loadUrl("http://10.34.35.64:3075/landing.html");

        // this will enable the javascript.
        w.getSettings().setJavaScriptEnabled(true);

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        w.setWebViewClient(new WebViewClient());
    }
}