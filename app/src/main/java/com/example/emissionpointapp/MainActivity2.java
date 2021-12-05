package com.example.emissionpointapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = findViewById(R.id.MainIcon);
        imageView.setTransitionName("Home");
        String uri = "@drawable/ic_baseline_home_24";
        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        imageView.setImageDrawable(res);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
//        return super.onCreateOptionsMenu(menu);
        return  true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.Practice:
                Intent intent = new Intent(this, LearnActivity.class);
                startActivity(intent);
                break;
            case R.id.Exam:
                intent = new Intent(this, ExamActivity.class);
                startActivity(intent);
                break;
            case R.id.BackMenu:
                finish();
                break;
            case R.id.Quit:
                finishAffinity();
                System.exit(0);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }


    public void learnAlphbets(View view) {
        Intent intent = new Intent(MainActivity2.this, LearnActivity.class);
        startActivity(intent);
    }

    public void startExam(View view) {
        Intent intent = new Intent(this,ExamActivity.class);
        startActivity(intent);

    }
}