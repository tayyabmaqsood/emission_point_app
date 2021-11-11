package com.example.emissionpointapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class LearnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

    }



    public void endActivity(View view) {
        finish();
    }

    public void learnByAlphabets(View view) {
        Intent intent = new Intent(this, LearnByAlphabets.class);
        startActivity(intent);
    }

    public void finishActivity(View view) {
        finish();
    }

    public void makharijActivity(View view) {
        Intent intent = new Intent(this, MakharijActivity.class);
        startActivity(intent);
    }

    public void startExam(View view) {
        Intent intent = new Intent(this,ExamActivity.class);
        startActivity(intent);
    }
}