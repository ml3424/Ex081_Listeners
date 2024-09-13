package com.example.ex081_listeners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnBlue, btnRed, btnResult;
    int redClicks, blueClicks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBlue = findViewById(R.id.btnBlue);
        btnRed = findViewById(R.id.btnRed);
        btnResult = findViewById(R.id.btnResult);

        redClicks = 0;
        blueClicks = 0;

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueClicks++;
            }
        });
        btnRed.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                redClicks += 2;
                return false;
            }
        });

    }

    public void resultSrceen(View view) {
        Intent si = new Intent(this,ResultGameActivity.class);
        si.putExtra("redClicks",redClicks);
        si.putExtra("blueClicks",blueClicks);
        startActivity(si);
        redClicks = 0;
        blueClicks = 0;
    }
}