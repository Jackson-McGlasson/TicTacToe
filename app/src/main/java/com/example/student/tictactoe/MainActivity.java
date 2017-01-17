package com.example.student.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView button1Var;
    TextView button2Var;
    TextView button3Var;
    TextView button4Var;
    TextView button5Var;
    TextView button6Var;
    TextView button7Var;
    TextView button8Var;
    TextView button9Var;
    int clickState = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1Var = (TextView) findViewById(R.id.button1);
        button2Var = (TextView) findViewById(R.id.button2);
        button3Var = (TextView) findViewById(R.id.button3);
        button4Var = (TextView) findViewById(R.id.button4);
        button5Var = (TextView) findViewById(R.id.button5);
        button6Var = (TextView) findViewById(R.id.button6);
        button7Var = (TextView) findViewById(R.id.button7);
        button8Var = (TextView) findViewById(R.id.button8);
        button9Var = (TextView) findViewById(R.id.button9);
    }

    public void click1(View view){
        if(clickState == 0){
            button1Var.setText("O");
            clickState=1;
        }
        else {
            button1Var.setText("X");
            clickState=0;
        }

    }
    public void click2(View view){
        if(clickState == 0){
            button2Var.setText("O");
            clickState=1;
        }
        else {
            button2Var.setText("X");
            clickState=0;
        }

    }
    public void click3(View view){
        if(clickState == 0){
            button3Var.setText("O");
            clickState=1;
        }
        else {
            button3Var.setText("X");
            clickState=0;
        }

    }
    public void click4(View view){
        if(clickState == 0){
            button4Var.setText("O");
            clickState=1;
        }
        else {
            button4Var.setText("X");
            clickState=0;
        }

    }
    public void click5(View view){
        if(clickState == 0){
            button5Var.setText("O");
            clickState=1;
        }
        else {
            button5Var.setText("X");
            clickState=0;
        }

    }
    public void click6(View view){
        if(clickState == 0){
            button6Var.setText("O");
            clickState=1;
        }
        else {
            button6Var.setText("X");
            clickState=0;
        }

    }
    public void click7(View view){
        if(clickState == 0){
            button7Var.setText("O");
            clickState=1;
        }
        else {
            button7Var.setText("X");
            clickState=0;
        }

    }
    public void click8(View view){
        if(clickState == 0){
            button8Var.setText("O");
            clickState=1;
        }
        else {
            button8Var.setText("X");
            clickState=0;
        }

    }
    public void click9(View view){
        if(clickState == 0){
            button9Var.setText("O");
            clickState=1;
        }
        else {
            button9Var.setText("X");
            clickState=0;
        }

    }
}
