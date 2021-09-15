package com.example.deeplink_on_cutomtabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);

        String uri = "https://0l2tjzu2r1.execute-api.ap-northeast-1.amazonaws.com/sample-html"; //サンプルのページ
        button.setOnClickListener(v -> {
            CustomTabsIntent tabsIntent = new CustomTabsIntent.Builder().build();
            tabsIntent.launchUrl(this, Uri.parse(uri));
        });
    }
}