package com.example.ex081_listeners;

import androidx.appcompat.app.AppCompatActivity;

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

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueClicks++;
                btnBlue.setText("" + blueClicks);
            }
        });
        btnRed.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                redClicks++;
                btnRed.setText("" + redClicks);
                return false;
            }
        });

    }
}