package com.example.bt.cookieclicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    public int mainScore = 0;

    public int normalBonusCount = 0; // bonus 1
    public int superBonusCount = 0;  // bonus 2
    public int duperBonusCount = 0;  // bonus 3
    public int hyperBonusCount = 0;  // bonus 5
    public int megaBonusCount = 0;   // bonus 8
    public int ultraBonusCount = 0;  // bonus 13

    public int normalBonusCost = 5;
    public int superBonusCost = 10;
    public int duperBonusCost = 20;
    public int hyperBonusCost = 35;
    public int megaBonusCost = 55;
    public int ultraBonusCost = 80;

    public int normalBonusPerSecond;
    public int superBonusPreSecond;
    public int duperBonusPerSecond;
    public int hyperBonusPerSecond;
    public int megaBonusPerSecond;
    public int ultraBonusPerSecond;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     */
    public void ClickMeButtonOnClick(View v) {
        mainScore++;
        TextView tvMainScore = (TextView) findViewById(R.id.tvMainScore);
        tvMainScore.setText(String.valueOf(mainScore));
    }

    public void btNormalBonusAdd (View v){
        if (mainScore < normalBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT).show();
            return;
        }
        normalBonusCount++;
        normalBonusPerSecond = normalBonusCount;
        displayNormalBonusCalc(normalBonusPerSecond);
        TextView tvNormalCount = (TextView) findViewById(R.id.tvNormalCount);
        tvNormalCount.setText(String.valueOf(normalBonusCount));
    }

    public void btSuperBonusAdd (View v){
        if (mainScore < superBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT).show();
            return;
        }
        superBonusCount++;
        superBonusPreSecond = superBonusCount * 2;
        displaySuperBonusCalc(superBonusPreSecond);
        TextView tvSuperCount = (TextView) findViewById(R.id.tvSuperCount);
        tvSuperCount.setText(String.valueOf(superBonusCount));
    }

    public void btDuperBonusAdd (View v){
        if (mainScore < duperBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT).show();
            return;
        }
        duperBonusCount++;
        duperBonusPerSecond = duperBonusCount * 3;
        displayDuperBonusCalc(duperBonusPerSecond);
        TextView tvDuperCount = (TextView) findViewById(R.id.tvDuperCount);
        tvDuperCount.setText(String.valueOf(duperBonusCount));
    }

    public void btHyperBonusAdd (View v){
        if (mainScore < hyperBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT).show();
            return;
        }
        hyperBonusCount++;
        hyperBonusPerSecond = hyperBonusCount * 5;
        displayHyperBonusCalc(hyperBonusPerSecond);
        TextView tvHyperCount = (TextView) findViewById(R.id.tvHyperCount);
        tvHyperCount.setText(String.valueOf(hyperBonusCount));
    }

    public void btMegaBonusAdd (View v){
        if (mainScore < megaBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT).show();
            return;
        }
        megaBonusCount++;
        megaBonusPerSecond = megaBonusCount * 8;
        displayMegaBonusCalc(megaBonusPerSecond);
        TextView tvMegaCount = (TextView) findViewById(R.id.tvMegaCount);
        tvMegaCount.setText(String.valueOf(megaBonusCount));
    }

    public void btUltraBonusAdd (View v){
        if (mainScore < ultraBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT).show();
            return;
        }
        ultraBonusCount++;
        ultraBonusPerSecond = ultraBonusCount * 13;
        displayUltraBonusCalc(ultraBonusPerSecond);
        TextView tvUltraCount = (TextView) findViewById(R.id.tvUltraCount);
        tvUltraCount.setText(String.valueOf(ultraBonusCount));
    }

    /**
     * Displays the calculation of normal over time bonus
     *
     * @param score
     */
    public void displayNormalBonusCalc(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvNormalCalc);
        scoreSet.setText(String.valueOf(score + "/s"));
    }

    /**
     * Displays the calculation of super over time bonus
     *
     * @param score
     */
    public void displaySuperBonusCalc(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvSuperCalc);
        scoreSet.setText(String.valueOf(score + "/s"));
    }

    /**
     * Displays the calculation of duper over time bonus
     *
     * @param score
     */
    public void displayDuperBonusCalc(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvDuperCalc);
        scoreSet.setText(String.valueOf(score + "/s"));
    }

    /**
     * Displays the calculation of hyper over time bonus
     *
     * @param score
     */
    public void displayHyperBonusCalc(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvHyperCalc);
        scoreSet.setText(String.valueOf(score + "/s"));
    }

    /**
     * Displays the calculation of mega over time bonus
     *
     * @param score
     */
    public void displayMegaBonusCalc(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvMegaCalc);
        scoreSet.setText(String.valueOf(score + "/s"));
    }

    /**
     * Displays the calculation of ultra over time bonus
     *
     * @param score
     */
    public void displayUltraBonusCalc(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvUltraCalc);
        scoreSet.setText(String.valueOf(score + "/s"));
    }

    int secondsPassed = 0;
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            secondsPassed++;
        }
    };

/*
    public void normalButtonOnClick() {
        else {
            mainScore -= normalBonusCost;
            normalBonusCost += 5;
            displayNormalBonusCount(normalBonusCount);
            displayNormalBonusCalc(normalBonusCount + " * 1/s");
            mainScore = normalBonusCount * timer.scheduleAtFixedRate(task,1000,1000);
            displayScore(mainScore);
        }
    }
    public void superButtonOnClick() {
        else {
            mainScore -= superBonusCost;
            superBonusCost += 10;
            displaySuperBonusCount(superBonusCount);
            displaySuperBonusCalc(superBonusCount + " * 2/s");
            mainScore = superBonusCount * timer.scheduleAtFixedRate(task,1000,2000);
            displayScore(mainScore);
        }
    }
    public void duperButtonOnClick() {
        else {
            mainScore -= duperBonusCost;
            duperBonusCost += 15;
            displayDuperBonusCount(duperBonusCount);
            displayDuperBonusCalc(duperBonusCount + " * 3/s");
            mainScore = duperBonusCount * timer.scheduleAtFixedRate(task,1000,3000);
            displayScore(mainScore);
        }
    }
    public void hyperButtonOnClick() {
        else {
            mainScore -= hyperBonusCost;
            hyperBonusCost += 20;
            hyperBonusCount++;
            displayHyperBonusCount(HyperBonusCount);
            displayHyperBonusCalc(HyperBonusCount + " * 4/s");
            mainScore = hyperBonusCount * timer.scheduleAtFixedRate(task,1000,4000);
            displayScore(mainScore);
        }
    }
    public void megaButtonOnClick() {
        else {
            mainScore -= megaBonusCost;
            megaBonusCost += 25;
            megaBonusCount++;
            displayMegaBonusCount(megaBonusCount);
            displayMegaBonusCalc(megaBonusCount + " * 5/s");
            mainScore = megaBonusCount * timer.scheduleAtFixedRate(task,1000,5000);
            displayScore(mainScore);
        }
    }
    public void ultraButtonOnClick() {
        else {
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
        int megaBonusCount = 0;
        int ultraBonusCount = 0;

        int normalBonusCost = 5;
        int superBonusCost = 10;
        int duperBonusCost = 20;
        int hyperBonusCost = 35;
        int megaBonusCost = 55;
        int ultraBonusCost = 80;
    }*/
}
