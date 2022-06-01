package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class growTree extends AppCompatActivity {
    int coin = 0, waste = 0, water = 0, viryo = 0, magic = 0, day = 1;
    TextView dateText, userCoin, userCan,quest1Count,quest2Count,quest3Count;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grow_tree);
        dateText = (TextView) findViewById(R.id.date);
        userCoin = (TextView) findViewById(R.id.userCoin);
        userCan = (TextView) findViewById(R.id.userCan);
        quest1Count = (TextView) findViewById(R.id.quest1Count);
        quest2Count = (TextView) findViewById(R.id.quest2Count);
        quest3Count = (TextView) findViewById(R.id.quest3Count);

        Settext();
    }

    public void Settext() {
        dateText.setText(dateText.getText() + String.valueOf(day));
        userCoin.setText(String.valueOf(coin));
        userCan.setText(String.valueOf(waste));
        quest1Count.setText(String.valueOf(water) + quest1Count.getText());
        quest2Count.setText(String.valueOf(viryo) + quest2Count.getText());
        quest3Count.setText(String.valueOf(magic) + quest3Count.getText());
    }
}