package com.example.emissionpointapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ExamActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    TextView textView;
    RadioButton radioButton;
    List<String> questionsList = Arrays.asList("What is Makharij of ع", "What is Mukharij of ق", "What is Makharij of ر", "What is Makharij of ب", "What os Makhrij ن");
    List<String> answersList = Arrays.asList("Middle of Throat","Base of Tongue which is near Uvula touching the mouth roof", " Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth","Inner part of the both lips touch each other","Rounded tip of the tongue touching the base of the frontal 6 teeth","None of these");
    public List<Integer> questionDisplayed = new ArrayList<Integer>(100);
    int correctAnswers = 0, wrongAnswers = 0;
    private View View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        setQuestions(View);
    }

    public void updateView(View view) {
        textView = findViewById(R.id.questionView);
        radioGroup = findViewById(R.id.multipleChoice);
        int radioId = radioGroup.getCheckedRadioButtonId();
        if (radioId == -1)
            wrongAnswers++;
        else {
            RadioButton radioButton = findViewById(radioId);
            String chooseOption = radioButton.getText().toString();
            String question = textView.getText().toString();
            if (questionsList.indexOf(question) == answersList.indexOf(chooseOption))
                correctAnswers++;
             else
                wrongAnswers++;
        }
        if(questionDisplayed.size() == 5){
            
        }
        else
            setQuestions(view);
    }

    public void setQuestions(View view){
        List<Integer> optionsDisplayed = new ArrayList<Integer>(100);
        optionsDisplayed.add(50);
        textView = findViewById(R.id.questionView);
        int questionIndex = new Random().nextInt(questionsList.size());


        if (questionDisplayed.contains(questionIndex) == false) {

            questionDisplayed.add(questionIndex);
            textView.setText(questionsList.get(questionIndex));

            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.multipleChoice);
            for (int i = 0; i < radioGroup.getChildCount(); i++) {
                int randomNumber = new Random().nextInt(answersList.size());
                boolean bol = optionsDisplayed.contains(randomNumber);
                if (bol == false) {
                    optionsDisplayed.add(randomNumber);
                    ((RadioButton) radioGroup.getChildAt(i)).setText(answersList.get(randomNumber));
                } else
                    i--;
            }
            if (!optionsDisplayed.contains(questionIndex))
                ((RadioButton) radioGroup.getChildAt(new Random().nextInt(4))).setText(answersList.get(questionIndex));

        }
    }
}