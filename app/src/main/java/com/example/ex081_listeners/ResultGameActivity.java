package com.example.ex081_listeners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultGameActivity extends AppCompatActivity {

    Button btnBackToGame;
    TextView tVRed, tVBlue;

    int redClicks, blueClicks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_game);

        btnBackToGame = findViewById(R.id.btnBackToGame);
        tVRed = findViewById(R.id.tVRed);
        tVBlue = findViewById(R.id.tVBlue);

        Intent gi = getIntent();
        redClicks = gi.getIntExtra("redClicks", -1);
        blueClicks = gi.getIntExtra("blueClicks", -1);


        if (redClicks < blueClicks)
        {
            tVBlue.setText("  " + blueClicks + "\n WON!");
            tVRed.setText("  " + redClicks);
        }
        else if (redClicks > blueClicks)
        {
            tVRed.setText("  " + redClicks + "\n WON!");
            tVBlue.setText("  " + blueClicks);
        }
        else
        {
            tVRed.setText("  " + redClicks + "\n TIE");
            tVBlue.setText("  " + blueClicks + "\n TIE");
        }

    }

    public void backToGame(View view) {
        finish();
    }
}