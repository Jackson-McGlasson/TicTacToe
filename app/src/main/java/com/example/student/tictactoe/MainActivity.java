package com.example.student.tictactoe;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
    int x1 = 0;
    int x2 = 0;
    int x3= 0;
    int x4 = 0;
    int x5 = 0;
    int x6 = 0;
    int x7= 0;
    int x8 = 0;
    int x9 = 0;


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
    private void check3inarow(){
        if (x1==x2 && x2==x3){
            CharSequence text = "This text will appear";
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast myMessage= Toast.makeText(context, text, duration);
            myMessage.show();
        }
        if (x1==x3 && x3==x7){
            CharSequence text = "This text will appear";
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast myMessage= Toast.makeText(context, text, duration);
            myMessage.show();
        }
    }


    public void click1(View view){
        if(x1 == 0){
            button1Var.setText("O");
            x1=1;

            check3inarow(); //This calls the checker function
        }
        else {
            button1Var.setText("X");
            x1=0;
        }
    }

    public void click2(View view){
        if(x2 == 0){
            button2Var.setText("O");
            x2=1;
            check3inarow();
        }
        else {
            button2Var.setText("X");
            x2=0;
        }

    }
    public void click3(View view){
        if(x3 == 0){
            button3Var.setText("O");
            x3=1;
            check3inarow();
        }
        else {
            button3Var.setText("X");
            x3=0;
        }

    }
    public void click4(View view){
        if(x4 == 0){
            button4Var.setText("O");
            x4=1;
            check3inarow();
        }
        else {
            button4Var.setText("X");
            x4=0;
        }

    }
    public void click5(View view){
        if(x5 == 0){
            button5Var.setText("O");
            x5=1;
            check3inarow();
        }
        else {
            button5Var.setText("X");
            x5=0;
        }

    }
    public void click6(View view){
        if(x6 == 0){
            button6Var.setText("O");
            x6=1;
            check3inarow();
        }
        else {
            button6Var.setText("X");
            x6=0;
        }

    }
    public void click7(View view){
        if(x7 == 0){
            button7Var.setText("O");
            x7=1;
            check3inarow();
        }
        else {
            button7Var.setText("X");
            x7=0;
        }

    }
    public void click8(View view){
        if(x8 == 0){
            button8Var.setText("O");
            x8=1;
            check3inarow();
        }
        else {
            button8Var.setText("X");
            x8=0;
        }

    }
    public void click9(View view){
        if(x9 == 0){
            button9Var.setText("O");
            x9=1;
        }
        else {
            button9Var.setText("X");
            x9=0;
        }

    }

}


