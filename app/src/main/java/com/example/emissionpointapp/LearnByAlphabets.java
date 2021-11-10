package com.example.emissionpointapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.List;

public class LearnByAlphabets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_by_alphabets);
        char[] arabic_alpha = {'ا', 'ب',  'ت', 'ث', 'ج', 'ح', 'خ', 'د', 'ذ', 'ر', 'ز', 'س','ش','ص', 'ض', 'ط', 'ظ', 'ع', 'غ', 'ف', 'ق', 'ک', 'ل', 'م', 'ن', 'و', 'ه', 'ی'};
        List<String> filename = Arrays.asList("mk123","mk1516","mk11","mk12","mk67","mk123","mk123","mk11","mk12","mk8910","mk13","mk13","mk67","mk13","mk67","mk11","mk12","mk123","mk123","mk1516","mk45","mk45","mk8910","mk1516","mk14","mk1516","mk123","mk67");
        for (int i = 0; i < arabic_alpha.length; i++) {
            GridLayout gridLayout = findViewById(R.id.gridLayout);
            Button btn = new Button(this);
            btn.setId(i);
            btn.setText(String.valueOf(arabic_alpha[i]));
            btn.setLayoutParams(new GridLayout.LayoutParams());
            btn.setLayoutParams(new ViewGroup.LayoutParams(120, ViewGroup.LayoutParams.WRAP_CONTENT));
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int id = v.getId();
                    ImageView imageView = findViewById(R.id.resultImage);
                    String uri = "@drawable/"+ filename.get(id);
                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());
                    Drawable res = getResources().getDrawable(imageResource);
                    imageView.setImageDrawable(res);

                }
            });
            gridLayout.addView(btn);

        }
    }
}