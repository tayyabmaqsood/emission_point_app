package com.example.emissionpointapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class finishActivity extends AppCompatActivity {
    String score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        String Correct = getIntent().getStringExtra("Correct");
        String Wrong = getIntent().getStringExtra("Wrong");

        TextView textView = findViewById(R.id.correctTextView);
        textView.setText(Correct);

        textView = findViewById(R.id.wrongTextView2);
        textView.setText(Wrong);
        score = "Correct: "+Correct +" Wrong: "+Wrong;
    }

    public void startQuizActivity(View view) {
        Intent intent = new Intent(this,ExamActivity.class);
        startActivity(intent);
    }

    public void shareScore(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT,score);
        sendIntent.setType("text/plain");
        Intent shareIntent = Intent.createChooser(sendIntent,null);
        startActivity(shareIntent);
    }

    public void quitActivity(View view){
        
    }
}