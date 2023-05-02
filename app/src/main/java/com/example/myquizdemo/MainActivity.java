package com.example.myquizdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    TextView questionTextView;
    EditText answerTextView;
    Button submitButton;
    int totalQuestion = 0;
    int currentQuestionIndex = 0;
    String givenAnswer = "";
    String answer = "";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTextView = findViewById(R.id.question_Text_View);
        answerTextView = findViewById(R.id.answer_Text_View);
        submitButton = findViewById(R.id.submit_Button);

        submitButton.setOnClickListener(this);

        loadNewQuestion();
    }

    @Override
    public void onClick(View view) {
        Button clickedButton = (Button) view;
        givenAnswer =  answerTextView.getText().toString();

        if(clickedButton.getId() == R.id.submit_Button){
            if(givenAnswer.toLowerCase().equals(answer)){
                Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                if(currentQuestionIndex == totalQuestion-1) {
                    if(Difficulty.clickedButton == 5){
                        openCompleteGame();
                    }
                    else{
                        Difficulty.clickedButton++;
                        enableButton();
                        currentQuestionIndex = 0;
                        openCompleteLevel();
                    }
                    loadNewQuestion();
                }else{
                    currentQuestionIndex++;
                    loadNewQuestion();
                }
                answerTextView.setText("");
            }else{
                Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
            }
        }
    }
    void loadNewQuestion(){
//        Toast.makeText(MainActivity.this, "clickedButton: " + Difficulty.clickedButton, Toast.LENGTH_LONG).show();
        switch (Difficulty.clickedButton) {
            case 1:
                questionTextView.setText(QuestionAnswer.questionsLevel1[currentQuestionIndex]);
                answer = QuestionAnswer.answersLevel1[currentQuestionIndex].toLowerCase();
                totalQuestion = QuestionAnswer.questionsLevel1.length;
                break;
            case 2:
                questionTextView.setText(QuestionAnswer.questionsLevel2[currentQuestionIndex]);
                answer = QuestionAnswer.answersLevel2[currentQuestionIndex].toLowerCase();
                totalQuestion = QuestionAnswer.questionsLevel2.length;
                break;
            case 3:
                questionTextView.setText(QuestionAnswer.questionsLevel3[currentQuestionIndex]);
                answer = QuestionAnswer.answersLevel3[currentQuestionIndex].toLowerCase();
                totalQuestion = QuestionAnswer.questionsLevel3.length;
                break;
            case 4:
                questionTextView.setText(QuestionAnswer.questionsLevel4[currentQuestionIndex]);
                answer = QuestionAnswer.answersLevel4[currentQuestionIndex].toLowerCase();
                totalQuestion = QuestionAnswer.questionsLevel4.length;
                break;
            case 5:
                questionTextView.setText(QuestionAnswer.questionsLevel5[currentQuestionIndex]);
                answer = QuestionAnswer.answersLevel5[currentQuestionIndex].toLowerCase();
                totalQuestion = QuestionAnswer.questionsLevel5.length;
                break;
            default:
                break;
        }
    }

    public void enableButton(){
        switch (Difficulty.clickedButton) {
            case 2:
                Difficulty.difficultyButton2.setEnabled(true);
                Difficulty.difficultyButton2.setBackgroundColor(getResources().getColor(R.color.white));
                break;
            case 3:
                Difficulty.difficultyButton3.setEnabled(true);
                Difficulty.difficultyButton3.setBackgroundColor(getResources().getColor(R.color.white));
                break;
            case 4:
                Difficulty.difficultyButton4.setEnabled(true);
                Difficulty.difficultyButton4.setBackgroundColor(getResources().getColor(R.color.white));
                break;
            case 5:
                Difficulty.difficultyButton5.setEnabled(true);
                Difficulty.difficultyButton5.setBackgroundColor(getResources().getColor(R.color.white));
                break;
            default:
                break;
        }
    }

    public void disableButton(){
        Difficulty.difficultyButton2.setEnabled(false);
        Difficulty.difficultyButton2.setBackgroundColor(getResources().getColor(R.color.white));
        Difficulty.difficultyButton3.setEnabled(false);
        Difficulty.difficultyButton3.setBackgroundColor(getResources().getColor(R.color.white));
        Difficulty.difficultyButton4.setEnabled(false);
        Difficulty.difficultyButton4.setBackgroundColor(getResources().getColor(R.color.white));
        Difficulty.difficultyButton5.setEnabled(false);
        Difficulty.difficultyButton5.setBackgroundColor(getResources().getColor(R.color.white));
    }

    public void openCompleteLevel(){
        Intent intent = new Intent(this, CompleteLevel.class);
        startActivity(intent);
        finish();
    }

    public void openCompleteGame(){
        Intent intent = new Intent(this, GameComplete.class);
        startActivity(intent);
        finish();
    }

}