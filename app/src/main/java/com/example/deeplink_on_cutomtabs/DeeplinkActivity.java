package com.example.deeplink_on_cutomtabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class DeeplinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deeplink);
        Button button = findViewById(R.id.toMain);


        Uri intentUri = getIntent().getData();
        if(intentUri != null) {
            Log.d("Intent Uri",intentUri.toString());
        }

        button.setOnClickListener(v-> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}