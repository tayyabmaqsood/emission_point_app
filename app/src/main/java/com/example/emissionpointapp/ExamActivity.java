package com.example.emissionpointapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ExamActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    TextView textView;
    RadioButton radioButton;
    List<String> questions = Arrays.asList("What is Makharij of ع", "What is Mukharij of ق", "What is Makharij of ر", "What is Makharij of ب");
    List<String> answers = Arrays.asList("Middle of Throat","Base of Tongue which is near Uvula touching the mouth roof", " Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth","Inner part of the both lips touch each other","None of these");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        textView = findViewById(R.id.questionView);
        textView.setText(questions.get(new Random().nextInt(questions.size())));

        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.multipleChoice);
        for (int i = 0; i < radioGroup .getChildCount(); i++) {
            ((RadioButton) radioGroup.getChildAt(i)).setText(answers.get(i));
        }
    }

    public void updateView(View view) {
        radioGroup = findViewById(R.id.multipleChoice);
        int radioId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(radioId);
        radioButton.getText().toString();
    }
}