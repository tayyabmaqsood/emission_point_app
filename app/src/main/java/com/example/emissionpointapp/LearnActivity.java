package com.example.emissionpointapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LearnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        char[] arabic_alpha = new char[]{'ا', 'ب', 'پ', 'ت', 'ث', 'ج', 'چ', 'ح', 'خ', 'د', 'ذ', 'ر', 'ز', 'ژ', 'ص', 'ض', 'ط', 'ظ', 'ع', 'غ', 'ف', 'ق', 'ک', 'گ', 'ل', 'م', 'ن', 'و', 'ه', 'ی'};

        GridLayout gridLayout = findViewById(R.id.gridLayout);
        Button btn = new Button(this);
        btn.setId(arabic_alpha[0]);
        btn.setText(arabic_alpha[0]);
        btn.setHeight(100);
        btn.setWidth(100);
        gridLayout.setRowCount(3);
        gridLayout.setColumnCount(5);
        gridLayout.addView(btn);

        //        for (int i = 0; i < arabic_alpha.length; i++) {
//            Button btn = new Button(this);
//            btn.setId(arabic_alpha[i]);
//            btn.setText(arabic_alpha[i]);
//            btn.setHeight(100);
//            btn.setWidth(100);
//            btn.setLayoutParams(new GridLayout.LayoutParams());
//
//        }
    }

    public void endActivity(View view) {
        finish();
    }
}