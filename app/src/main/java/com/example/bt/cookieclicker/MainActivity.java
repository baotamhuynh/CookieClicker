package com.example.bt.cookieclicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

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
     * Displays the main score
     *
     * @param score
     */
    public void displayScore(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvMainScore);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     * Displays how many times normal bonus has been bought
     *
     * @param score
     */
    public void displayNormalBonusCount(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvNormalCount);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     * Displays the calculation of normal over time bonus
     *
     * @param score
     */
    public void displayNormalBonusCalc(String score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvNormalCalc);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     * Displays how many times super bonus has been bought
     *
     * @param score
     */
    public void displaySuperBonusCount(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvSuperCount);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     * Displays the calculation of super over time bonus
     *
     * @param score
     */
    public void displaySuperBonusCalc(String score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvSuperCalc);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     * Displays how many times duper bonus has been bought
     *
     * @param score
     */
    public void displayDuperBonusCount(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvDuperCount);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     * Displays the calculation of duper over time bonus
     *
     * @param score
     */
    public void displayDuperBonusCalc(String score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvDuperCalc);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     * Displays how many times hyper bonus has been bought
     *
     * @param score
     */
    public void displayHyperBonusCount(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvHyperCount);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     * Displays the calculation of hyper over time bonus
     *
     * @param score
     */
    public void displayHyperBonusCalc(String score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvHyperCalc);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     * Displays how many times dyper bonus has been bought
     *
     * @param score
     */
    public void displayDyperBonusCount(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvDyperCount);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     * Displays the calculation of dyper over time bonus
     *
     * @param score
     */
    public void displayDyperBonusCalc(String score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvDyperCalc);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     * Displays the calculation of ultra over time bonus
     *
     * @param score
     */
    public void displayUltraBonusCount(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvUltraCount);
        scoreSet.setText(String.valueOf(score));
    }

    /**
     * Displays the calculation of ultra over time bonus
     *
     * @param ultraCalc
     */
    public void displayUltraBonusCalc(String ultraCalc) {
        TextView scoreSet = (TextView) findViewById(R.id.tvUltraCalc);
        scoreSet.setText(String.valueOf(ultraCalc));
    }

    int secondsPassed = 0;
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            secondsPassed++;
        }
    };

    /**
     *
     */
    public void clickMeButtonOnClick() {
        mainScore++;
        displayScore(mainScore);
    }

    /**
     *
     */
    public void normalButtonOnClick() {

        if (mainScore < normalBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT);
            return;
        } else {
            mainScore -= normalBonusCost;
            normalBonusCost += 5;
            displayNormalBonusCount(normalBonusCount);
            displayNormalBonusCalc(normalBonusCount + " * 1/s");
            mainScore = normalBonusCount * timer.scheduleAtFixedRate(task,1000,1000);
            displayScore(mainScore);
        }
    }

    /**
     *
     */
    public void superButtonOnClick() {

        if (mainScore < superBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT);
            return;
        } else {
            mainScore -= superBonusCost;
            superBonusCost += 10;
            displaySuperBonusCount(superBonusCount);
            displaySuperBonusCalc(superBonusCount + " * 2/s");
            mainScore = superBonusCount * timer.scheduleAtFixedRate(task,1000,2000);
            displayScore(mainScore);
        }
    }

    /**
     *
     */
    public void duperButtonOnClick() {

        if (mainScore < duperBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT);
            return;
        } else {
            mainScore -= duperBonusCost;
            duperBonusCost += 15;
            displayDuperBonusCount(duperBonusCount);
            displayDuperBonusCalc(duperBonusCount + " * 3/s");
            mainScore = duperBonusCount * timer.scheduleAtFixedRate(task,1000,3000);
            displayScore(mainScore);
        }
    }

    /**
     *
     */
    public void hyperButtonOnClick() {

        if (mainScore < hyperBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT);
            return;
        } else {
            mainScore -= hyperBonusCost;
            hyperBonusCost += 20;
            hyperBonusCount++;
            displayHyperBonusCount(HyperBonusCount);
            displayHyperBonusCalc(HyperBonusCount + " * 4/s");
            mainScore = hyperBonusCount * timer.scheduleAtFixedRate(task,1000,4000);
            displayScore(mainScore);
        }
    }

    /**
     *
     */
    public void dyperButtonOnClick() {

        if (mainScore < dyperBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT);
            return;
        } else {
            mainScore -= dyperBonusCost;
            dyperBonusCost += 25;
            dyperBonusCount++;
            displayDyperBonusCount(dyperBonusCount);
            displayDyperBonusCalc(dyperBonusCount + " * 5/s");
            mainScore = dyperBonusCount * timer.scheduleAtFixedRate(task,1000,5000);
            displayScore(mainScore);
        }
    }

    /**
     *
     */
    public void ultraButtonOnClick() {

        if (mainScore < ultraBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT);
            return;
        } else {
            mainScore -= ultraBonusCost;
            ultraBonusCost += 30;
            ultraBonusCount++;
            displayUltraBonusCount(ultraBonusCount);
            displayDuperBonusCalc(ultraBonusCount + " * 6/s");
            mainScore = ultraBonusCount * timer.scheduleAtFixedRate(task,1000,6000);
            displayScore(mainScore);
        }
    }


    public void scorePerSec() {
    }

    public void resetButtonOnClick() {
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
