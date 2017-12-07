package com.fiap.mcustodio.placarapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.orhanobut.logger.Logger;


public class MainActivity extends AppCompatActivity {

    EditText team1;
    EditText team2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.d("ABRIU");
        team1 = (EditText) findViewById(R.id.edittext_main_team1);
        team2 = (EditText) findViewById(R.id.edittext_main_team2);
    }

    public void comecarJogo(View view) {
        Logger.d("CLIQUE");
        if (team1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Preencha o time da casa", Toast.LENGTH_SHORT).show();
        } else {
            if (team2.getText().toString().isEmpty()) {
                Toast.makeText(this, "Preencha o time visitante", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(this, GameActivity.class);
                intent.putExtra("TIMECASA", team1.getText().toString());
                intent.putExtra("TIMEVISITANTE", team2.getText().toString());
                startActivity(intent);
            }
        }

    }
}
