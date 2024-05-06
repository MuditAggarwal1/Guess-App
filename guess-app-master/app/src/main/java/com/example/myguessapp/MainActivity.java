package com.example.myguessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int guessedNumber;

    String randomNumber;

    public void number(View view) {




        EditText editText = (EditText) findViewById(R.id.editText);

        int enteredNumber = Integer.parseInt(editText.getText().toString());

        if(enteredNumber==guessedNumber){

            Toast.makeText(this, "Yes! This is what I guessed!", Toast.LENGTH_SHORT).show();
        }

        else if(enteredNumber>guessedNumber){

            Toast.makeText(this,"Go lower!", Toast.LENGTH_SHORT).show();
        }

        else{

            Toast.makeText(this, "Go higher!",Toast.LENGTH_SHORT).show();
        }






    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        guessedNumber = rand.nextInt(21);

        randomNumber = Integer.toString(guessedNumber);

        Log.i("Guessed number", randomNumber);

    }
}
