package com.fiap.mcustodio.placarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private String timeCasa;
    private String timeVisitante;
    private TextView teamName1;
    private TextView teamName2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        teamName1 = (TextView) findViewById(R.id.textview_game_team1);
        teamName2 = (TextView) findViewById(R.id.textview_game_team2);

        if (getIntent() != null) {
            timeCasa = getIntent().getStringExtra("TIMECASA");
            timeVisitante = getIntent().getStringExtra("TIMEVISITANTE");

            teamName1.setText(timeCasa);
            teamName2.setText(timeVisitante);
        }
    }
}
