package com.example.wasteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Intent intent =getIntent();
        String message=intent.getStringExtra(MainActivity.MSG);
        TextView textView = findViewById(R.id.textView4);
        textView.setText(message);
    }
    public void Home(View view)
    {
        Intent intent =new Intent(this,Intro.class);
        startActivity(intent);
    }

}