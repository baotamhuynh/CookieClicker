package com.example.bt.cookieclicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int mainScore = 0;

    int normalBonusCount = 0;
    int superBonusCount = 0;
    int duperBonusCount = 0;
    int hyperBonusCount = 0;
    int dyperBonusCount = 0;
    int ultraBonusCount = 0;

    int normalBonusCost = 5;
    int superBonusCost = 10;
    int duperBonusCost = 20;
    int hyperBonusCost = 35;
    int dyperBonusCost = 55;
    int ultraBonusCost = 80;


    /**
     *
     */
    public void displayScore(int score){
            TextView scoreSet = (TextView) findViewById(R.id.mainScore);
            scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     * @param score
     */
    public void displayNormalBonusCount(int score){
        TextView scoreSet = (TextView) findViewById(R.id.mainScore);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     * @param score
     */
    public void displaySuperBonusCount(int score){
        TextView scoreSet = (TextView) findViewById(R.id.mainScore);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     * @param score
     */
    public void displayDuperBonusCount(int score){
        TextView scoreSet = (TextView) findViewById(R.id.mainScore);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     * @param score
     */
    public void displayHyperBonusCount(int score){
        TextView scoreSet = (TextView) findViewById(R.id.mainScore);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     * @param score
     */
    public void displayDyperBonusCount(int score){
        TextView scoreSet = (TextView) findViewById(R.id.mainScore);
        scoreSet.setText(String.valueOf(score));
    }

    public void displayUltraBonusCount(int score){
        TextView scoreSet = (TextView) findViewById(R.id.mainScore);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     */
    public void clickMeButtonScoreAdd(){
        mainScore++;
        displayScore(mainScore);
    }

    /**
     *
     */
    public void normalButtonPress(){
        normalBonusCost += 5;
        if (mainScore < normalBonusCost){
            Toast.makeText(this,"You do not have enough points.",Toast.LENGTH_SHORT);
            return;
        }
        else{
            mainScore -= normalBonusCost;
        }
    }

    /**
     *
     */
    public void superButtonPress(){
        superBonusCost += 10;
        if (mainScore < normalBonusCost){
            Toast.makeText(this,"You do not have enough points.",Toast.LENGTH_SHORT);
            return;
        }
        else{
            mainScore -= normalBonusCost;

        }
    }

    /**
     *
     */
    public void duperButtonPress(){
        duperBonusCost += 15;
        if (mainScore < normalBonusCost){
            Toast.makeText(this,"You do not have enough points.",Toast.LENGTH_SHORT);
            return;
        }
        else{
            mainScore -= normalBonusCost;
        }
    }

    /**
     *
     */
    public void hyperButtonPress(){
        hyperBonusCost += 20;
        if (mainScore < normalBonusCost){
            Toast.makeText(this,"You do not have enough points.",Toast.LENGTH_SHORT);
            return;
        }
        else{
            mainScore -= normalBonusCost;
        }
    }

    /**
     *
     */
    public void dyperButtonPress(){
        dyperBonusCost += 25;
        if (mainScore < normalBonusCost){
            Toast.makeText(this,"You do not have enough points.",Toast.LENGTH_SHORT);
            return;
        }
        else{
            mainScore -= normalBonusCost;
        }
    }

    /**
     *
     */
    public void ultraButtonPress(){
        ultraBonusCost += 30;
        if (mainScore < normalBonusCost){
            Toast.makeText(this,"You do not have enough points.",Toast.LENGTH_SHORT);
            return;
        }
        else{
            mainScore -= normalBonusCost;
        }
    }

    public void resetButton(){
        int mainScore = 0;

        int normalBonusCount = 0;
        int superBonusCount = 0;
        int duperBonusCount = 0;
        int hyperBonusCount = 0;
        int dyperBonusCount = 0;
        int ultraBonusCount = 0;

        int normalBonusCost = 5;
        int superBonusCost = 10;
        int duperBonusCost = 20;
        int hyperBonusCost = 35;
        int dyperBonusCost = 55;
        int ultraBonusCost = 80;
    }
}
