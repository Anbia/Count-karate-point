package com.doxt.android.countscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scorePointTeamRed = 0;

    public void addPointSambonTeamRed (View view){
        scorePointTeamRed = scorePointTeamRed + 3;
        displayPointForTeamRed(scorePointTeamRed);
    }

    public void addPointWazariTeamRed (View view){
        scorePointTeamRed = scorePointTeamRed + 2;
        displayPointForTeamRed(scorePointTeamRed);
    }

    public void  addPointIpponTeamRed (View view){
        scorePointTeamRed = scorePointTeamRed + 1;
        displayPointForTeamRed(scorePointTeamRed);
    }

    public void displayPointForTeamRed(int point){
        TextView textViewPoint = (TextView) findViewById(R.id.point_to_team_red);
        textViewPoint.setText(String.valueOf(point));
    }

    int scorePointTeamBlue = 0;

    public void addPointSambonTeamBlue (View view){
        scorePointTeamBlue = scorePointTeamBlue +  3;
        displayPointForTeamBlue(scorePointTeamBlue);
    }

    public void addPointWazariTeamBlue (View view){
        scorePointTeamBlue = scorePointTeamBlue + 2;
        displayPointForTeamBlue(scorePointTeamBlue);
    }

    public void addPointIpponTeamBlue (View view){
        scorePointTeamBlue = scorePointTeamBlue + 1;
        displayPointForTeamBlue(scorePointTeamBlue);
    }

    public void displayPointForTeamBlue(int point){
        TextView textViewPoint = (TextView) findViewById(R.id.point_to_team_blue);
        textViewPoint.setText(String.valueOf(point));
    }

    public void resetScore(View view) {
        scorePointTeamRed   = 0;
        scorePointTeamBlue  = 0;
        displayPointForTeamRed(scorePointTeamRed);
        displayPointForTeamBlue(scorePointTeamBlue);
    }
}
