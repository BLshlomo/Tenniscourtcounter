package com.example.android.tenniscourtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreGamePlayerA = 0;
    int scoreSetPlayerA = 0;
    int scoreMatchPlayerA = 0;
    int scoreGamePlayerB = 0;
    int scoreSetPlayerB = 0;
    int scoreMatchPlayerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the reset button is clicked
     */
    public void reset(View view) {
        scoreGamePlayerA = 0;
        scoreSetPlayerA = 0;
        scoreMatchPlayerA = 0;
        scoreGamePlayerB = 0;
        scoreSetPlayerB = 0;
        scoreMatchPlayerB = 0;
        displayPlayerAGameScore(scoreGamePlayerA);
        displayPlayerASetScore(scoreSetPlayerA);
        displayPlayerAMatchScore(scoreMatchPlayerA);
        displayPlayerBGameScore(scoreGamePlayerB);
        displayPlayerBSetScore(scoreSetPlayerB);
        displayPlayerBMatchScore(scoreMatchPlayerB);

    }

    /**
     * This method is called when the 15 points button is clicked for player A
     */
    public void add15ForPlayerA(View view) {
        scoreGamePlayerA = 15;
        displayPlayerAGameScore(scoreGamePlayerA);
    }

    /**
     * This method is called when the 30 points button is clicked for Player A
     */
    public void add30ForPlayerA(View view) {
        scoreGamePlayerA = 30;
        displayPlayerAGameScore(scoreGamePlayerA);
    }

    /**
     * This method is called when the 40 points button is clicked for Player A
     */
    public void add40ForPlayerA(View view) {
        scoreGamePlayerA = 40;
        displayPlayerAGameScore(scoreGamePlayerA);
    }

    /**
     * This method is called when the +1 set button is clicked for Player A
     */
    public void addOneSetForPlayerA(View view) {
        scoreSetPlayerA = scoreSetPlayerA + 1;
        scoreGamePlayerA = 0;
        scoreGamePlayerB = 0;
        displayPlayerASetScore(scoreSetPlayerA);
        displayPlayerAGameScore(scoreGamePlayerA);
        displayPlayerBGameScore(scoreGamePlayerB);
    }

    /**
     * This method is called when the +1 match button is clicked for Player A
     */
    public void addOneMatchForPlayerA(View view) {
        scoreMatchPlayerA = scoreMatchPlayerA + 1;
        scoreGamePlayerA = 0;
        scoreSetPlayerA = 0;
        scoreGamePlayerB = 0;
        scoreSetPlayerB = 0;
        displayPlayerAMatchScore(scoreMatchPlayerA);
        displayPlayerASetScore(scoreSetPlayerA);
        displayPlayerAGameScore(scoreGamePlayerA);
        displayPlayerBSetScore(scoreSetPlayerB);
        displayPlayerBGameScore(scoreGamePlayerB);
    }

    /**
     * Displays the given games points for Player A.
     */
    public void displayPlayerAGameScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_game);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given set points for Player A.
     */
    public void displayPlayerASetScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_set);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given match points for Player A.
     */
    public void displayPlayerAMatchScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_match);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the 15 points button is clicked for player B
     */
    public void add15ForPlayerB(View view) {
        scoreGamePlayerB = 15;
        displayPlayerBGameScore(scoreGamePlayerB);
    }

    /**
     * This method is called when the 30 points button is clicked for Player B
     */
    public void add30ForPlayerB(View view) {
        scoreGamePlayerB = 30;
        displayPlayerBGameScore(scoreGamePlayerB);
    }

    /**
     * This method is called when the 40 points button is clicked for Player B
     */
    public void add40ForPlayerB(View view) {
        scoreGamePlayerB = 40;
        displayPlayerBGameScore(scoreGamePlayerB);
    }

    /**
     * This method is called when the +1 set button is clicked for Player B
     */
    public void addOneSetForPlayerB(View view) {
        scoreSetPlayerB = scoreSetPlayerB + 1;
        scoreGamePlayerA = 0;
        scoreGamePlayerB = 0;
        displayPlayerBSetScore(scoreSetPlayerB);
        displayPlayerAGameScore(scoreGamePlayerA);
        displayPlayerBGameScore(scoreGamePlayerB);
    }

    /**
     * This method is called when the +1 match button is clicked for Player B
     */
    public void addOneMatchForPlayerB(View view) {
        scoreMatchPlayerB = scoreMatchPlayerB + 1;
        scoreGamePlayerA = 0;
        scoreSetPlayerA = 0;
        scoreGamePlayerB = 0;
        scoreSetPlayerB = 0;
        displayPlayerBMatchScore(scoreMatchPlayerB);
        displayPlayerASetScore(scoreSetPlayerA);
        displayPlayerAGameScore(scoreGamePlayerA);
        displayPlayerBSetScore(scoreSetPlayerB);
        displayPlayerBGameScore(scoreGamePlayerB);
    }

    /**
     * Displays the given games points for Player B.
     */
    public void displayPlayerBGameScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_game);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given set points for Player B.
     */
    public void displayPlayerBSetScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_set);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given match points for Player B.
     */
    public void displayPlayerBMatchScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_match);
        scoreView.setText(String.valueOf(score));
    }

}
