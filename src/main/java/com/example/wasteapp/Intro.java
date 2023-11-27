package com.example.wasteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    public void Principle(View view)
    {
        Intent intent =new Intent(this,Principle.class);
        startActivity(intent);
    }

    public void threeR(View view)
    {
        Intent intent =new Intent(this,threeR.class);
        startActivity(intent);
    }

    public void Prevention(View view)
    {
        Intent intent =new Intent(this,Prevention.class);
        startActivity(intent);
    }

    public void Stats(View view)
    {
        Intent intent =new Intent(this,Stats.class);
        startActivity(intent);
    }

    public void Policy(View view)
    {
        Intent intent =new Intent(this,Policy.class);
        startActivity(intent);
    }
}



//    public void Home(View view)
//    {
//        Intent intent =new Intent(this,Intro.class);
//        startActivity(intent);
//    }