package com.fiap.mcustodio.placarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class GameActivity extends AppCompatActivity {

    private TextView teamName1;
    private TextView teamName2;
    private TextView teamScore1;
    private TextView teamScore2;
    private Button goalButton1;
    private Button goalButton2;

    private int score1 = 0;
    private int score2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        teamName1 = (TextView) findViewById(R.id.textview_game_team1);
        teamName2 = (TextView) findViewById(R.id.textview_game_team2);
        teamScore1 = (TextView) findViewById(R.id.textview_game_score1);
        teamScore2 = (TextView) findViewById(R.id.textview_game_score2);
        teamScore1.setText(String.valueOf(score1));
        teamScore2.setText(String.valueOf(score2));

        if (getIntent() != null) {
            String timeCasa = getIntent().getStringExtra("TIMECASA");
            String timeVisitante = getIntent().getStringExtra("TIMEVISITANTE");

            teamName1.setText(timeCasa);
            teamName2.setText(timeVisitante);
        }

        if (savedInstanceState != null) {
            score1 = savedInstanceState.getInt("Score1");
            score2 = savedInstanceState.getInt("Score2");
            teamScore1.setText(String.valueOf(score1));
            teamScore2.setText(String.valueOf(score2));
        }

        goalButton1 = (Button) findViewById(R.id.button_game_goal1);
        goalButton2 = (Button) findViewById(R.id.button_game_goal2);

        goalButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score1 = score1 + 1;
                String value = String.valueOf(score1);
                teamScore1.setText(value);
            }
        });

        goalButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score2 = score2 + 1;
                String value = String.valueOf(score2);
                teamScore2.setText(value);
            }
        });
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Score1", score1);
        outState.putInt("Score2", score2);
    }

}
