package com.example.myquizdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CompleteLevel extends AppCompatActivity {
    public static Button continueButton;
    public static Button difficultyButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_level);

        continueButton = (Button) findViewById(R.id.continue_button);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

//        difficultyButton = (Button) findViewById(R.id.difficulty_button);
//        difficultyButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openDifficulty();
//            }
//        });
    }

    public void openMAinActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openDifficulty(){
        Intent intent = new Intent(this, Difficulty.class);
        startActivity(intent);
    }
}