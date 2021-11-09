package com.example.emissionpointapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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

    public void openRepository(View view) {
        Uri uri = Uri.parse("https://github.com/tayyabmaqsood/emission_point_app"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}