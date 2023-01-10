package com.waseem.brickgame.ui.settings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.waseem.brickgame.R;
import com.waseem.brickgame.Values;

public class PrivacyPolicyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        WebView webView = findViewById(R.id.wvPrivacyPolicy);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/privacy.html");

    }
}
