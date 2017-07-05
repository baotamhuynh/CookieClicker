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

    public int[] bonusCount = {0, 0, 0, 0, 0, 0};
    public int[] bonusCost = {5, 10, 20, 35, 55, 80};
    public int[] bonusPerSecond = {0, 0, 0, 0, 0, 0};

    public int mainScore = 0;

    public Timer timer;

    public TextView tvMainScore;
    public TextView tvNormalCount;
    public TextView tvNormalCost;
    public TextView tvNormalCalc;
    public TextView tvSuperCount;
    public TextView tvSuperCost;
    public TextView tvSuperCalc;
    public TextView tvDuperCount;
    public TextView tvDuperCost;
    public TextView tvDuperCalc;
    public TextView tvHyperCount;
    public TextView tvHyperCost;
    public TextView tvHyperCalc;
    public TextView tvMegaCount;
    public TextView tvMegaCost;
    public TextView tvMegaCalc;
    public TextView tvUltraCount;
    public TextView tvUltraCost;
    public TextView tvUltraCalc;

    public Button btNormalBonus;
    public Button btSuperBonus;
    public Button btDuperBonus;
    public Button btHyperBonus;
    public Button btMegaBonus;
    public Button btUltraBonus;

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
                        mainScore += bonusPerSecond[0] + bonusPerSecond[1] + bonusPerSecond[2] +
                                bonusPerSecond[3] + bonusPerSecond[4] + bonusPerSecond[5];
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

        if (mainScore >= bonusCost[0])
            btNormalBonus.setEnabled(true);

        else btNormalBonus.setEnabled(false);

        if (mainScore >= bonusCost[1])
            btSuperBonus.setEnabled(true);

        else btSuperBonus.setEnabled(false);

        if (mainScore >= bonusCost[2])
            btDuperBonus.setEnabled(true);

        else btDuperBonus.setEnabled(false);

        if (mainScore >= bonusCost[3])
            btHyperBonus.setEnabled(true);

        else btHyperBonus.setEnabled(false);

        if (mainScore >= bonusCost[4])
            btMegaBonus.setEnabled(true);

        else btMegaBonus.setEnabled(false);

        if (mainScore >= bonusCost[5])
            btUltraBonus.setEnabled(true);

        else btUltraBonus.setEnabled(false);
    }

    public void BonusButtonPressed(View v)
    {
        Initialization();

        int i;
        int costAddition;
        int countMultiplier;

        switch (v.getId()){
            case(R.id.btNormalBonus):
                i = 0;
                costAddition = 5;
                countMultiplier = 1;
                break;
            case(R.id.btSuperBonus):
                i = 1;
                costAddition = 10;
                countMultiplier = 2;
                break;
            case(R.id.btDuperBonus):
                i = 2;
                costAddition = 20;
                countMultiplier = 3;
                break;
            case(R.id.btHyperBonus):
                i = 3;
                costAddition = 35;
                countMultiplier = 5;
                break;
            case(R.id.btMegaBonus):
                i = 4;
                costAddition = 55;
                countMultiplier = 8;
                break;
            case(R.id.btUltraBonus):
                i = 5;
                costAddition = 80;
                countMultiplier = 13;
                break;
            default:
                throw new IllegalArgumentException();
        }
        bonusCount[i]++;
        mainScore -= bonusCost[i];
        bonusCost[i] += costAddition;
        bonusPerSecond[i] = bonusCount[i] * countMultiplier;
        switch(i){
            case 0:
                tvNormalCalc.setText(String.valueOf(bonusPerSecond[i] + "/s"));
                tvNormalCount.setText(String.valueOf(bonusCount[i]));
                tvNormalCost.setText(String.valueOf("Cost: " + bonusCost[i]));
                break;
            case 1:
                tvSuperCalc.setText(String.valueOf(bonusPerSecond[i] + "/s"));
                tvSuperCount.setText(String.valueOf(bonusCount[i]));
                tvSuperCost.setText(String.valueOf("Cost: " + bonusCost[i]));
                break;
            case 2:
                tvDuperCalc.setText(String.valueOf(bonusPerSecond[i] + "/s"));
                tvDuperCount.setText(String.valueOf(bonusCount[i]));
                tvDuperCost.setText(String.valueOf("Cost: " + bonusCost[i]));
                break;
            case 3:
                tvHyperCalc.setText(String.valueOf(bonusPerSecond[i] + "/s"));
                tvHyperCount.setText(String.valueOf(bonusCount[i]));
                tvHyperCost.setText(String.valueOf("Cost: " + bonusCost[i]));
                break;
            case 4:
                tvMegaCalc.setText(String.valueOf(bonusPerSecond[i] + "/s"));
                tvMegaCount.setText(String.valueOf(bonusCount[i]));
                tvMegaCost.setText(String.valueOf("Cost: " + bonusCost[i]));
                break;
            case 5:
                tvUltraCalc.setText(String.valueOf(bonusPerSecond[i] + "/s"));
                tvUltraCount.setText(String.valueOf(bonusCount[i]));
                tvUltraCost.setText(String.valueOf("Cost: " + bonusCost[i]));
                break;
            default:
                throw new IllegalArgumentException();
        }
        tvMainScore.setText(String.valueOf(mainScore));
    }

    public void ResetButtonOnClick() {
        Initialization();

        mainScore = 0;
        tvMainScore.setText(String.valueOf(0));
        for (int i = 0; i < 6; i++)
        {
            bonusCount[i] = 0;
            bonusPerSecond[i] = 0;
        }

        tvNormalCount.setText(String.valueOf(0));
        tvSuperCount.setText(String.valueOf(0));
        tvDuperCount.setText(String.valueOf(0));
        tvHyperCount.setText(String.valueOf(0));
        tvMegaCount.setText(String.valueOf(0));
        tvUltraCount.setText(String.valueOf(0));

        tvNormalCost.setText(String.valueOf("Cost: " + 5));
        bonusCost[0] = 5;
        tvSuperCost.setText(String.valueOf("Cost: " + 10));
        bonusCost[1] = 10;
        tvDuperCost.setText(String.valueOf("Cost: " + 20));
        bonusCost[2] = 20;
        tvHyperCost.setText(String.valueOf("Cost: " + 35));
        bonusCost[3] = 35;
        tvMegaCost.setText(String.valueOf("Cost: " + 55));
        bonusCost[4] = 55;
        tvUltraCost.setText(String.valueOf("Cost: " + 80));
        bonusCost[5] = 80;

        tvNormalCalc.setText(String.valueOf(0 + "/s"));
        tvSuperCalc.setText(String.valueOf(0 + "/s"));
        tvDuperCalc.setText(String.valueOf(0 + "/s"));
        tvHyperCalc.setText(String.valueOf(0 + "/s"));
        tvMegaCalc.setText(String.valueOf(0 + "/s"));
        tvUltraCalc.setText(String.valueOf(0 + "/s"));

        Toast.makeText(this, "You just reset the game!", Toast.LENGTH_SHORT).show();
    }
    public void Initialization()
    {
        tvMainScore = (TextView) findViewById(R.id.tvMainScore);
        tvNormalCount = (TextView) findViewById(R.id.tvNormalCount);
        tvNormalCost = (TextView) findViewById(R.id.tvNormalCost);
        tvNormalCalc = (TextView) findViewById(R.id.tvNormalCalc);
        tvSuperCount = (TextView) findViewById(R.id.tvSuperCount);
        tvSuperCost = (TextView) findViewById(R.id.tvSuperCost);
        tvSuperCalc = (TextView) findViewById(R.id.tvSuperCalc);
        tvDuperCount = (TextView) findViewById(R.id.tvDuperCount);
        tvDuperCost = (TextView) findViewById(R.id.tvDuperCost);
        tvDuperCalc = (TextView) findViewById(R.id.tvDuperCalc);
        tvHyperCount = (TextView) findViewById(R.id.tvHyperCount);
        tvHyperCost = (TextView) findViewById(R.id.tvHyperCost);
        tvHyperCalc = (TextView) findViewById(R.id.tvHyperCalc);
        tvMegaCount = (TextView) findViewById(R.id.tvMegaCount);
        tvMegaCost = (TextView) findViewById(R.id.tvMegaCost);
        tvMegaCalc = (TextView) findViewById(R.id.tvMegaCalc);
        tvUltraCount = (TextView) findViewById(R.id.tvUltraCount);
        tvUltraCost = (TextView) findViewById(R.id.tvUltraCost);
        tvUltraCalc = (TextView) findViewById(R.id.tvUltraCalc);
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
