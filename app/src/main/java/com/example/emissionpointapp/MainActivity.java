package com.example.emissionpointapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hideImageView(View view) {
        ImageView imageView = findViewById(R.id.repoView);
        if (imageView.getVisibility() == view.VISIBLE) {
            imageView.setVisibility(view.INVISIBLE);
        }
        else
            imageView.setVisibility(view.VISIBLE);
    }
}