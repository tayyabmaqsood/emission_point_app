package com.example.emissionpointapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
//import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.MainIcon).setVisibility(View.INVISIBLE);
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

    //click and open repository function
    public void openRepository(View view) {
        Uri uri = Uri.parse("https://github.com/tayyabmaqsood/emission_point_app"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    //Open MainActivity2
    public void openSecondActivity(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }

    //IconPressed function
    public void backIconClicked(View view){
        if(findViewById(R.id.MainIcon).getTransitionName().toString().equals("Back"))
            finish();
        else {
            ActionBar ab = getSupportActionBar();
            ab.setDisplayHomeAsUpEnabled(true);
        }
    }
}