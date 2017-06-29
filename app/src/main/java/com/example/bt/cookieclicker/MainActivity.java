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
     * Displays the main score
     *
     * @param score
     */
    public void displayScore(int score){
            TextView scoreSet = (TextView) findViewById(R.id.mainScore);
            scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     * Displays how many times normal bonus has been bought
     *
     * @param score
     */
    public void displayNormalBonusCount(int score){
        TextView scoreSet = (TextView) findViewById(R.id.mainScore);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     * Displays the calculation of normal over time bonus
     *
     * @param score
     */
    public void displayNormalBonusCalc(int score){
        TextView scoreSet = (TextView) findViewById(R.id.mainScore);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     * Displays how many times super bonus has been bought
     *
     * @param score
     */
    public void displaySuperBonusCount(int score){
        TextView scoreSet = (TextView) findViewById(R.id.mainScore);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     * Displays the calculation of super over time bonus
     *
     * @param score
     */
    public void displaySuperBonusCalc(int score){
        TextView scoreSet = (TextView) findViewById(R.id.mainScore);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     * Displays how many times duper bonus has been bought
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
    public void displayDuperBonusCalc(int score){
        TextView scoreSet = (TextView) findViewById(R.id.mainScore);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     * Displays the calculation of normal over time bonus
     *
     * @param score
     */
    public void displayHyperBonusCount(int score){
        TextView scoreSet = (TextView) findViewById(R.id.mainScore);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     * Displays the calculation of normal over time bonus
     *
     * @param score
     */
    public void displayHyperBonusCalc(int score){
        TextView scoreSet = (TextView) findViewById(R.id.mainScore);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     * Displays the calculation of normal over time bonus
     *
     * @param score
     */
    public void displayDyperBonusCount(int score){
        TextView scoreSet = (TextView) findViewById(R.id.mainScore);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     * Displays the calculation of normal over time bonus
     *
     * @param score
     */
    public void displayDyperBonusCalc(int score){
        TextView scoreSet = (TextView) findViewById(R.id.mainScore);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     * Displays the calculation of normal over time bonus
     *
     * @param score
     */
    public void displayUltraBonusCount(int score){
        TextView scoreSet = (TextView) findViewById(R.id.mainScore);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     *
     *
     *
     * @param score
     */
    public void displayUltraBonusCalc(int score){
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

        if (mainScore < normalBonusCost){
            Toast.makeText(this,"You do not have enough points.",Toast.LENGTH_SHORT);
            return;
        }
        else{
            mainScore -= normalBonusCost;
            superBonusCost += 10;
        }
    }

    /**
     *
     */
    public void duperButtonPress(){

        if (mainScore < normalBonusCost){
            Toast.makeText(this,"You do not have enough points.",Toast.LENGTH_SHORT);
            return;
        }
        else{
            mainScore -= normalBonusCost;
            duperBonusCost += 15;
        }
    }

    /**
     *
     */
    public void hyperButtonPress(){

        if (mainScore < normalBonusCost){
            Toast.makeText(this,"You do not have enough points.",Toast.LENGTH_SHORT);
            return;
        }
        else{
            mainScore -= normalBonusCost;
            hyperBonusCost += 20;
        }
    }

    /**
     *
     */
    public void dyperButtonPress(){

        if (mainScore < normalBonusCost){
            Toast.makeText(this,"You do not have enough points.",Toast.LENGTH_SHORT);
            return;
        }
        else{
            mainScore -= normalBonusCost;
            dyperBonusCost += 25;
        }
    }

    /**
     *
     */
    public void ultraButtonPress(){

        if (mainScore < normalBonusCost){
            Toast.makeText(this,"You do not have enough points.",Toast.LENGTH_SHORT);
            return;
        }
        else{
            mainScore -= normalBonusCost;
            ultraBonusCost += 30;
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
