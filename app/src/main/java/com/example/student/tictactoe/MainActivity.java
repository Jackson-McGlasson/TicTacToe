package com.example.student.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1Var;
    int clickState = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1Var = (Button) findViewById(R.id.button1);
    }

    public void click1(View view){
        if(clickState == 0){
            button1Var.setText("0");
            clickState=1;
        }
        else {
            button1Var.setText("1");
            clickState=0;
        }

    }
}
