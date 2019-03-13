package com.example.simplecalculatorv01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView topOutput;
    TextView midOutput;
    TextView answerOutput;
    int firstAddend;
    int secondAddend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topOutput = findViewById(R.id.tv_top_num_output);
        midOutput = findViewById(R.id.tv_mid_num_output);
        answerOutput = findViewById(R.id.tv_answer_output);

        ImageButton num1 = findViewById(R.id.ib_num1);
        ImageButton num2 = findViewById(R.id.ib_num2);
        ImageButton num3 = findViewById(R.id.ib_num3);
        ImageButton num4 = findViewById(R.id.ib_num4);
        ImageButton num5 = findViewById(R.id.ib_num5);
        ImageButton num6 = findViewById(R.id.ib_num6);

        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
    } // end of onCreate

    public void onClick(View v) {
        if(v.getId() == R.id.ib_num1) {
            Log.i("num", "you clicked number 1");
            topOutput.setText("1");
            firstAddend = 1;
        }
        else if(v.getId() == R.id.ib_num2) {
            Log.i("num", "you clicked number 2");
            topOutput.setText("2");
            firstAddend = 2;
        }
        else if(v.getId() == R.id.ib_num3) {
            Log.i("num", "you clicked number 3");
            topOutput.setText("3");
            firstAddend = 3;
        }
        else if(v.getId() == R.id.ib_num4) {
            Log.i("num", "you clicked number 4");
            midOutput.setText("4");
            secondAddend = 4;
        }
        else if(v.getId() == R.id.ib_num5) {
            Log.i("num", "you clicked number 5");
            midOutput.setText("5");
            secondAddend = 5;
        }
        else if(v.getId() == R.id.ib_num6) {
            Log.i("num", "you clicked number 6");
            midOutput.setText("6");
            secondAddend = 6;
        }
        int sum = firstAddend + secondAddend;
        answerOutput.setText(""+ sum);
    }

}// end of class
