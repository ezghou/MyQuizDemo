package com.example.myquizdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Difficulty extends AppCompatActivity {
    public static Button difficultyButton1;
    public static Button difficultyButton2;
    public static Button difficultyButton3;
    public static Button difficultyButton4;
    public static Button difficultyButton5;
    public static Button difficultyButton6;
    public static Button difficultyButton7;
    public static Button difficultyButton8;
    public static Button difficultyButton9;
    public static Button difficultyButton10;
    public static int clickedButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        difficultyButton1 = (Button) findViewById(R.id.difficulty1_Button);
        difficultyButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedButton = 1;
                Toast.makeText(Difficulty.this, "clickedButtonDifficulty: " + clickedButton, Toast.LENGTH_SHORT).show();
                openMAinActivity();
            }
        });

        difficultyButton2 = (Button) findViewById(R.id.difficulty2_Button);
        difficultyButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedButton = 2;
                Toast.makeText(Difficulty.this, "clickedButtonDifficulty: " + clickedButton, Toast.LENGTH_SHORT).show();
                openMAinActivity();
            }
        });

        difficultyButton3 = (Button) findViewById(R.id.difficulty3_Button);
        difficultyButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedButton = 3;
                Toast.makeText(Difficulty.this, "clickedButtonDifficulty: " + clickedButton, Toast.LENGTH_SHORT).show();
                openMAinActivity();
            }
        });

        difficultyButton4 = (Button) findViewById(R.id.difficulty4_Button);
        difficultyButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedButton = 4;
                Toast.makeText(Difficulty.this, "clickedButtonDifficulty: " + clickedButton, Toast.LENGTH_SHORT).show();
                openMAinActivity();
            }
        });

        difficultyButton5 = (Button) findViewById(R.id.difficulty5_Button);
        difficultyButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedButton = 5;
                Toast.makeText(Difficulty.this, "clickedButtonDifficulty: " + clickedButton, Toast.LENGTH_SHORT).show();
                openMAinActivity();
            }
        });

    }

    public void openMAinActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}