package com.example.bt.cookieclicker;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    public int mainScore = 0;

    public TextView tvMainScore;
    public TextView tvNormalCount;
    public TextView tvNormalCost;
    public TextView tvSuperCount;
    public TextView tvSuperCost;
    public TextView tvDuperCount;
    public TextView tvDuperCost;
    public TextView tvHyperCount;
    public TextView tvHyperCost;
    public TextView tvMegaCount;
    public TextView tvMegaCost;
    public TextView tvUltraCount;
    public TextView tvUltraCost;

    public Button btNormalBonus;
    public Button btSuperBonus;
    public Button btDuperBonus;
    public Button btHyperBonus;
    public Button btMegaBonus;
    public Button btUltraBonus;

    public Timer timer;

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

        timer = new Timer();
        tvMainScore = (TextView) findViewById(R.id.tvMainScore);

        btNormalBonus = (Button) findViewById(R.id.btNormalBonus);
        btSuperBonus = (Button) findViewById(R.id.btSuperBonus);
        btDuperBonus = (Button) findViewById(R.id.btDuperBonus);
        btHyperBonus = (Button) findViewById(R.id.btHyperBonus);
        btMegaBonus = (Button) findViewById(R.id.btMegaBonus);
        btUltraBonus = (Button) findViewById(R.id.btUltraBonus);

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    public void run() {
                        mainScore += normalBonusPerSecond + superBonusPreSecond + duperBonusPerSecond +
                                hyperBonusPerSecond + megaBonusPerSecond + ultraBonusPerSecond;
                        tvMainScore.setText(String.valueOf(mainScore));

                    }
                });
            }
        }, 1000, 1000);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    public void run() {
                        CheckIfEnoughPoints();
                    }
                });
            }
        }, 100, 100);
    }

    public void ClickMeButtonOnClick(View v) {
        mainScore++;
        tvMainScore.setText(String.valueOf(mainScore));
    }

    public void CheckIfEnoughPoints() {

        if (mainScore >= normalBonusCost) {
            btNormalBonus.setEnabled(true);
        }

        else{btNormalBonus.setEnabled(false);}

        if (mainScore >= superBonusCost) {
            btSuperBonus.setEnabled(true);
        }

        else{btSuperBonus.setEnabled(false);}

        if (mainScore >= duperBonusCost) {
            btDuperBonus.setEnabled(true);
        }

        else{btDuperBonus.setEnabled(false);}

        if (mainScore >= hyperBonusCost) {
            btHyperBonus.setEnabled(true);
        }

        else{btHyperBonus.setEnabled(false);}

        if (mainScore >= megaBonusCost) {
            btMegaBonus.setEnabled(true);
        }

        else{btMegaBonus.setEnabled(false);}

        if (mainScore >= ultraBonusCost) {
            btUltraBonus.setEnabled(true);
        }

        else{btUltraBonus.setEnabled(false);}
    }

    public void NormalBonusAdd (View v){
        tvMainScore = (TextView) findViewById(R.id.tvMainScore);
        tvNormalCount = (TextView) findViewById(R.id.tvNormalCount);
        tvNormalCost = (TextView) findViewById(R.id.tvNormalCost);

        normalBonusCount++;
        mainScore -= normalBonusCost;
        normalBonusCost += 5;
        normalBonusPerSecond = normalBonusCount;
        displayNormalBonusCalc(normalBonusPerSecond);
        tvNormalCount.setText(String.valueOf(normalBonusCount));
        tvMainScore.setText(String.valueOf(mainScore));
        tvNormalCost.setText(String.valueOf("Cost: " + normalBonusCost));
    }

    public void SuperBonusAdd (View v){
        tvMainScore = (TextView) findViewById(R.id.tvMainScore);
        tvSuperCount = (TextView) findViewById(R.id.tvSuperCount);
        tvSuperCost = (TextView) findViewById(R.id.tvSuperCost);

        superBonusCount++;
        mainScore -= superBonusCost;
        superBonusCost += 10;
        superBonusPreSecond = superBonusCount * 2;
        displaySuperBonusCalc(superBonusPreSecond);
        tvSuperCount.setText(String.valueOf(superBonusCount));
        tvMainScore.setText(String.valueOf(mainScore));
        tvSuperCost.setText(String.valueOf("Cost: " + superBonusCost));

    }

    public void DuperBonusAdd (View v){
        tvMainScore = (TextView) findViewById(R.id.tvMainScore);
        tvDuperCount = (TextView) findViewById(R.id.tvDuperCount);
        tvDuperCost = (TextView) findViewById(R.id.tvDuperCost);

        duperBonusCount++;
        mainScore -= duperBonusCost;
        duperBonusCost += 20;
        duperBonusPerSecond = duperBonusCount * 3;
        displayDuperBonusCalc(duperBonusPerSecond);
        tvDuperCount.setText(String.valueOf(duperBonusCount));
        tvMainScore.setText(String.valueOf(mainScore));
        tvDuperCost.setText(String.valueOf("Cost: " + duperBonusCost));
    }

    public void HyperBonusAdd (View v){
        tvMainScore = (TextView) findViewById(R.id.tvMainScore);
        tvHyperCount = (TextView) findViewById(R.id.tvHyperCount);
        tvHyperCost = (TextView) findViewById(R.id.tvHyperCost);

        hyperBonusCount++;
        mainScore -= hyperBonusCost;
        hyperBonusCost += 35;
        hyperBonusPerSecond = hyperBonusCount * 5;
        displayHyperBonusCalc(hyperBonusPerSecond);
        tvHyperCount.setText(String.valueOf(hyperBonusCount));
        tvMainScore.setText(String.valueOf(mainScore));
        tvHyperCost.setText(String.valueOf("Cost: " + hyperBonusCost));
    }

    public void MegaBonusAdd (View v){
        tvMainScore = (TextView) findViewById(R.id.tvMainScore);
        tvMegaCount = (TextView) findViewById(R.id.tvMegaCount);
        tvMegaCost = (TextView) findViewById(R.id.tvMegaCost);

        megaBonusCount++;
        mainScore -= megaBonusCost;
        megaBonusCost += 55;
        megaBonusPerSecond = megaBonusCount * 8;
        displayMegaBonusCalc(megaBonusPerSecond);
        tvMegaCount.setText(String.valueOf(megaBonusCount));
        tvMainScore.setText(String.valueOf(mainScore));
        tvMegaCost.setText(String.valueOf("Cost: " + megaBonusCost));
    }

    public void UltraBonusAdd (View v){
        tvMainScore = (TextView) findViewById(R.id.tvMainScore);
        tvUltraCount = (TextView) findViewById(R.id.tvUltraCount);
        tvUltraCost = (TextView) findViewById(R.id.tvUltraCost);

        ultraBonusCount++;
        mainScore -= ultraBonusCost;
        ultraBonusCost += 80;
        ultraBonusPerSecond = ultraBonusCount * 13;
        displayUltraBonusCalc(ultraBonusPerSecond);
        tvUltraCount.setText(String.valueOf(ultraBonusCount));
        tvMainScore.setText(String.valueOf(mainScore));
        tvUltraCost.setText(String.valueOf("Cost: " + ultraBonusCost));
    }

    public void displayNormalBonusCalc(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvNormalCalc);
        scoreSet.setText(String.valueOf(score + "/s"));
    }

    public void displaySuperBonusCalc(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvSuperCalc);
        scoreSet.setText(String.valueOf(score + "/s"));
    }

    public void displayDuperBonusCalc(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvDuperCalc);
        scoreSet.setText(String.valueOf(score + "/s"));
    }

    public void displayHyperBonusCalc(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvHyperCalc);
        scoreSet.setText(String.valueOf(score + "/s"));
    }

    public void displayMegaBonusCalc(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvMegaCalc);
        scoreSet.setText(String.valueOf(score + "/s"));
    }

    public void displayUltraBonusCalc(int score) {
        TextView scoreSet = (TextView) findViewById(R.id.tvUltraCalc);
        scoreSet.setText(String.valueOf(score + "/s"));
    }


    public void ResetButtonOnClick() {
        tvMainScore = (TextView) findViewById(R.id.tvMainScore);
        tvNormalCount = (TextView) findViewById(R.id.tvNormalCount);
        tvNormalCost = (TextView) findViewById(R.id.tvNormalCost);
        tvSuperCount = (TextView) findViewById(R.id.tvSuperCount);
        tvSuperCost = (TextView) findViewById(R.id.tvSuperCost);
        tvDuperCount = (TextView) findViewById(R.id.tvDuperCount);
        tvDuperCost = (TextView) findViewById(R.id.tvDuperCost);
        tvHyperCount = (TextView) findViewById(R.id.tvHyperCount);
        tvHyperCost = (TextView) findViewById(R.id.tvHyperCost);
        tvMegaCount = (TextView) findViewById(R.id.tvMegaCount);
        tvMegaCost = (TextView) findViewById(R.id.tvMegaCost);
        tvUltraCount = (TextView) findViewById(R.id.tvUltraCount);
        tvUltraCost = (TextView) findViewById(R.id.tvUltraCost);

        mainScore = 0;
        tvMainScore.setText(String.valueOf(0));

        normalBonusCount = 0;
        tvNormalCount.setText(String.valueOf(0));
        superBonusCount = 0;
        tvSuperCount.setText(String.valueOf(0));
        duperBonusCount = 0;
        tvDuperCount.setText(String.valueOf(0));
        hyperBonusCount = 0;
        tvHyperCount.setText(String.valueOf(0));
        megaBonusCount = 0;
        tvMegaCount.setText(String.valueOf(0));
        ultraBonusCount = 0;
        tvUltraCount.setText(String.valueOf(0));

        normalBonusCost = 5;
        tvNormalCost.setText(String.valueOf("Cost: " + 5));
        superBonusCost = 10;
        tvSuperCost.setText(String.valueOf("Cost: " + 10));
        duperBonusCost = 20;
        tvDuperCost.setText(String.valueOf("Cost: " + 20));
        hyperBonusCost = 35;
        tvHyperCost.setText(String.valueOf("Cost: " + 35));
        megaBonusCost = 55;
        tvMegaCost.setText(String.valueOf("Cost: " + 55));
        ultraBonusCost = 80;
        tvUltraCost.setText(String.valueOf("Cost: " + 80));

        normalBonusPerSecond = 0;
        superBonusPreSecond = 0;
        duperBonusPerSecond = 0;
        hyperBonusPerSecond = 0;
        megaBonusPerSecond = 0;
        ultraBonusPerSecond = 0;

        displayNormalBonusCalc(0);
        displaySuperBonusCalc(0);
        displayDuperBonusCalc(0);
        displayHyperBonusCalc(0);
        displayMegaBonusCalc(0);
        displayUltraBonusCalc(0);

        Toast.makeText(this, "You just reset the game!", Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.overflow_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_reset: {
                ResetButtonOnClick();
                break;
            }
            case R.id.action_about: {
                AlertDialog.Builder about = new AlertDialog.Builder(this, R.style.Theme_AppCompat_Dialog);
                about.setTitle("About us!")
                .setMessage("This app was created by Mikael Mäkelä and Bao Tam Huynh for the Android App Development -summer course.")
                .setNeutralButton("Coolio!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).show();
                break;
            }
        }
        return false;
    }
}
