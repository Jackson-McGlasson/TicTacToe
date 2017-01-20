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
    int x1 =-1;
    int x2 =-2;
    int x3 =3;
    int x4 =4;
    int x5 =5;
    int x6 =6;
    int x7 =7;
    int x8 =8;
    int x9 =9;


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
            CharSequence text = "Three in a row!";
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast myMessage= Toast.makeText(context, text, duration);
            myMessage.show();
        }
        if (x4==x5 && x6==x7){
            CharSequence text = "Three in a row!";
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast myMessage= Toast.makeText(context, text, duration);
            myMessage.show();
        }
        if (x7==x8 && x8==x9){
            CharSequence text = "Three in a row!";
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast myMessage= Toast.makeText(context, text, duration);
            myMessage.show();
        }
        if (x1==x4 && x4==x7){
            CharSequence text = "Three in a row!";
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast myMessage= Toast.makeText(context, text, duration);
            myMessage.show();
        }
        if (x2==x5 && x5==x8){
            CharSequence text = "Three in a row!";
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast myMessage= Toast.makeText(context, text, duration);
            myMessage.show();
        }
        if (x3==x6 && x6==x9){
            CharSequence text = "Three in a row!";
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast myMessage= Toast.makeText(context, text, duration);
            myMessage.show();
        }
        if (x1==x5 && x5==x9){
            CharSequence text = "Three in a row!";
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast myMessage= Toast.makeText(context, text, duration);
            myMessage.show();
        }
        if (x3==x5 && x5==x7){
            CharSequence text = "Three in a row!";
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast myMessage= Toast.makeText(context, text, duration);
            myMessage.show();
        }
    }


    public void click1(View view){

        if(x1 == 2){
            button1Var.setText("O");
            x1=1;

            check3inarow(); //This calls the checker function
        }
        else{
            button1Var.setText("X");
            x1=2;
            check3inarow(); //This calls the checker function
        }
    }

    public void click2(View view){
        if(x2 == 2){
            button2Var.setText("O");
            x2=1;
            check3inarow();
        }
        else {
            button2Var.setText("X");
            x2=2;
        }

    }
    public void click3(View view){
        if(x3 == 2){
            button3Var.setText("O");
            x3=1;
            check3inarow();
        }
        else {
            button3Var.setText("X");
            x3=2;
            check3inarow(); //This calls the checker function
        }

    }
    public void click4(View view){
        if(x4 == 2){
            button4Var.setText("O");
            x4=1;
            check3inarow();
        }
        else {
            button4Var.setText("X");
            x4=2;
            check3inarow(); //This calls the checker function
        }

    }
    public void click5(View view){
        if(x5 == 2){
            button5Var.setText("O");
            x5=1;
            check3inarow();
        }
        else {
            button5Var.setText("X");
            x5=2;
            check3inarow(); //This calls the checker function
        }

    }
    public void click6(View view){
        if(x6 == 2){
            button6Var.setText("O");
            x6=1;
            check3inarow();
        }
        else {
            button6Var.setText("X");
            x6=2;
            check3inarow(); //This calls the checker function
        }

    }
    public void click7(View view){
        if(x7 == 2){
            button7Var.setText("O");
            x7=1;
            check3inarow();
        }
        else {
            button7Var.setText("X");
            x7=2;
            check3inarow(); //This calls the checker function
        }

    }
    public void click8(View view){
        if(x8 == 2){
            button8Var.setText("O");
            x8=1;
            check3inarow();
        }
        else {
            button8Var.setText("X");
            x8=2;
            check3inarow(); //This calls the checker function
        }

    }
    public void click9(View view){
        if(x9 == 2){
            button9Var.setText("O");
            x9=1;
        }
        else{
            button9Var.setText("X");
            x9=2;
            check3inarow(); //This calls the checker function
        }

    }

}


