package com.example.android.squashscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scorePlayer1 = 0;
    int scorePlayer2 = 0;
    int setPlayer1 = 0;
    int setPlayer2 = 0;
    String servePlayer1 = " ";
    String servePlayer2 = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Player 1 by 1 point.
     */
    public void addOneForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 1;
        displayForPlayer1(scorePlayer1);

        if (scorePlayer1==9) {
            scorePlayer1 = 0;
            scorePlayer2 = 0;
            setPlayer1 = setPlayer1 + 1;
            displayForPlayer1(scorePlayer1);
            displayForPlayer2(scorePlayer2);
            displaySetForPlayer1(setPlayer1);
            }
    }

    /**
     * Increase the score for Player 2 by 1 point.
     */
    public void addOneForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 1;
        displayForPlayer2(scorePlayer2);

        if (scorePlayer2==9) {
            scorePlayer1 = 0;
            scorePlayer2 = 0;
            setPlayer2 = setPlayer2 + 1;
            displayForPlayer1(scorePlayer1);
            displayForPlayer2(scorePlayer2);
            displaySetForPlayer2(setPlayer2);
        }
    }

    /**
     * Switch serve between players - Player 1.
     */
    public void switchServePlayer1(View v) {
        servePlayer1 = "*";
        servePlayer2 = " ";
        displayServePlayer1(servePlayer1);
        displayServePlayer2(servePlayer2);
    }

    /**
     * Switch serve between players - Player 2.
     */
    public void switchServePlayer2(View v) {
        servePlayer1 = " ";
        servePlayer2 = "*";
        displayServePlayer1(servePlayer1);
        displayServePlayer2(servePlayer2);
    }

    /**
     * Reset the score for both teams A and B.
     */
    public void resetScore(View v) {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        servePlayer1 = " ";
        servePlayer2 = " ";
        setPlayer1 = 0;
        setPlayer2 = 0;
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
        displaySetForPlayer1(setPlayer1);
        displaySetForPlayer2(setPlayer2);
        displayServePlayer1(servePlayer1);
        displayServePlayer2(servePlayer2);
    }

    /**
     * Displays the given score for Player 1.
     */
    public void displayForPlayer1(int score) {
        TextView scoreView = findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player 2.
     */
    public void displayForPlayer2(int score) {
        TextView scoreView = findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given set for Player 1.
     */
    public void displaySetForPlayer1(int score) {
        TextView scoreView = findViewById(R.id.player_1_sets);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given set for Player 2.
     */
    public void displaySetForPlayer2(int score) {
        TextView scoreView = findViewById(R.id.player_2_sets);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the serve for Player 1.
     */
    public void displayServePlayer1(String score) {
        TextView scoreView = findViewById(R.id.player_1_serve);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the serve for Player 2.
     */
    public void displayServePlayer2(String score) {
        TextView scoreView = findViewById(R.id.player_2_serve);
        scoreView.setText(String.valueOf(score));
    }

}
