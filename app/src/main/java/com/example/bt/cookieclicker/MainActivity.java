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

    public int normalBonusCount = 0;
    public int superBonusCount = 0;
    public int duperBonusCount = 0;
    public int hyperBonusCount = 0;
    public int megaBonusCount = 0;
    public int ultraBonusCount = 0;

    public int normalBonusCost = 5;
    public int superBonusCost = 10;
    public int duperBonusCost = 20;
    public int hyperBonusCost = 35;
    public int megaBonusCost = 55;
    public int ultraBonusCost = 80;

    public int normalBonusPerSecond; // bonus 1
    public int superBonusPreSecond;  // bonus 2
    public int duperBonusPerSecond;  // bonus 3
    public int hyperBonusPerSecond;  // bonus 5
    public int megaBonusPerSecond;   // bonus 8
    public int ultraBonusPerSecond;  // bonus 13


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int totalBonusScore = normalBonusPerSecond + superBonusPreSecond + duperBonusPerSecond +
                hyperBonusPerSecond + megaBonusPerSecond + ultraBonusPerSecond;

        Timer timer = new Timer();
        final TextView tvMainScore = (TextView) findViewById(R.id.tvMainScore);

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    public void run() {
                        mainScore += totalBonusScore;
                        tvMainScore.setText(String.valueOf(mainScore));
                    }
                });
            }
        }, 1000, 1000);
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
        mainScore -= normalBonusCost;
        normalBonusCost += 5;
        normalBonusPerSecond = normalBonusCount;
        displayNormalBonusCalc(normalBonusPerSecond);
        TextView tvNormalCount = (TextView) findViewById(R.id.tvNormalCount);
        tvNormalCount.setText(String.valueOf(normalBonusCount));
        TextView tvMainScore = (TextView) findViewById(R.id.tvMainScore);
        tvMainScore.setText(String.valueOf(mainScore));
    }

    public void btSuperBonusAdd (View v){
        if (mainScore < superBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT).show();
            return;
        }
        superBonusCount++;
        mainScore -= superBonusCost;
        superBonusCost += 10;
        superBonusPreSecond = superBonusCount * 2;
        displaySuperBonusCalc(superBonusPreSecond);
        TextView tvSuperCount = (TextView) findViewById(R.id.tvSuperCount);
        tvSuperCount.setText(String.valueOf(superBonusCount));
        TextView tvMainScore = (TextView) findViewById(R.id.tvMainScore);
        tvMainScore.setText(String.valueOf(mainScore));
    }

    public void btDuperBonusAdd (View v){
        if (mainScore < duperBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT).show();
            return;
        }
        duperBonusCount++;
        mainScore -= duperBonusCost;
        duperBonusCost += 15;
        duperBonusPerSecond = duperBonusCount * 3;
        displayDuperBonusCalc(duperBonusPerSecond);
        TextView tvDuperCount = (TextView) findViewById(R.id.tvDuperCount);
        tvDuperCount.setText(String.valueOf(duperBonusCount));
        TextView tvMainScore = (TextView) findViewById(R.id.tvMainScore);
        tvMainScore.setText(String.valueOf(mainScore));
    }

    public void btHyperBonusAdd (View v){
        if (mainScore < hyperBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT).show();
            return;
        }
        hyperBonusCount++;
        mainScore -= hyperBonusCost;
        hyperBonusCost += 20;
        hyperBonusPerSecond = hyperBonusCount * 5;
        displayHyperBonusCalc(hyperBonusPerSecond);
        TextView tvHyperCount = (TextView) findViewById(R.id.tvHyperCount);
        tvHyperCount.setText(String.valueOf(hyperBonusCount));
        TextView tvMainScore = (TextView) findViewById(R.id.tvMainScore);
        tvMainScore.setText(String.valueOf(mainScore));
    }

    public void btMegaBonusAdd (View v){
        if (mainScore < megaBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT).show();
            return;
        }
        megaBonusCount++;
        mainScore -= megaBonusCost;
        megaBonusCost += 25;
        megaBonusPerSecond = megaBonusCount * 8;
        displayMegaBonusCalc(megaBonusPerSecond);
        TextView tvMegaCount = (TextView) findViewById(R.id.tvMegaCount);
        tvMegaCount.setText(String.valueOf(megaBonusCount));
        TextView tvMainScore = (TextView) findViewById(R.id.tvMainScore);
        tvMainScore.setText(String.valueOf(mainScore));
    }

    public void btUltraBonusAdd (View v){
        if (mainScore < ultraBonusCost) {
            Toast.makeText(this, "You do not have enough points.", Toast.LENGTH_SHORT).show();
            return;
        }
        ultraBonusCount++;
        mainScore -= ultraBonusCost;
        ultraBonusCost += 30;
        ultraBonusPerSecond = ultraBonusCount * 13;
        displayUltraBonusCalc(ultraBonusPerSecond);
        TextView tvUltraCount = (TextView) findViewById(R.id.tvUltraCount);
        tvUltraCount.setText(String.valueOf(ultraBonusCount));
        TextView tvMainScore = (TextView) findViewById(R.id.tvMainScore);
        tvMainScore.setText(String.valueOf(mainScore));
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


/*
    public void normalButtonOnClick() {
            mainScore = normalBonusCount * timer.scheduleAtFixedRate(task,1000,1000);
            displayScore(mainScore);
    }
    public void superButtonOnClick() {
            mainScore = superBonusCount * timer.scheduleAtFixedRate(task,1000,2000);
            displayScore(mainScore);
    }
    public void duperButtonOnClick() {
            mainScore = duperBonusCount * timer.scheduleAtFixedRate(task,1000,3000);
            displayScore(mainScore);
    }
    public void hyperButtonOnClick() {
            mainScore = hyperBonusCount * timer.scheduleAtFixedRate(task,1000,4000);
            displayScore(mainScore);
    }
    public void megaButtonOnClick() {
            mainScore = megaBonusCount * timer.scheduleAtFixedRate(task,1000,5000);
            displayScore(mainScore);
    }
    public void ultraButtonOnClick() {
            mainScore = ultraBonusCount * timer.scheduleAtFixedRate(task,1000,6000);
            displayScore(mainScore);
    }*/

    public void ResetButtonOnClick() {
        mainScore = 0;

        normalBonusCount = 0;
        superBonusCount = 0;
        duperBonusCount = 0;
        hyperBonusCount = 0;
        megaBonusCount = 0;
        ultraBonusCount = 0;

        normalBonusCost = 5;
        superBonusCost = 10;
        duperBonusCost = 20;
        hyperBonusCost = 35;
        megaBonusCost = 55;
        ultraBonusCost = 80;
    }
}
