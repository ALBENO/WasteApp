package com.example.wasteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.Shikhar.WasteApp.user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Signup(View view) {
        Intent intent = new Intent(this, Signup.class);
        EditText editText1 = findViewById(R.id.username);
        EditText editText2 = findViewById(R.id.username2);
        EditText editText3 = findViewById(R.id.gender);

        if(editText3.getText().toString().equalsIgnoreCase("male")) {
            String message = "Mr. " + editText1.getText().toString() + " " + editText2.getText().toString();
            intent.putExtra(MSG, message);
        }
       
elseif(editText3.getText().toString().equalsIgnoreCase("female")) {
            String message = "Ms./Mrs. " + editText1.getText().toString() + " " + editText2.getText().toString();
            intent.putExtra(MSG, message);
        }
else {
            String message = editText1.getText().toString() + " " + editText2.getText().toString();
            intent.putExtra(MSG, message);   //   only passes key value pair so we provide a key named MSG
        }
        startActivity(intent);
    }
}

