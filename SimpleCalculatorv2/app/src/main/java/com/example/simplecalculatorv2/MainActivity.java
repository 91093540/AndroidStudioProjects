package com.example.simplecalculatorv2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView topOutput;
    TextView midOutput;
    TextView answer;
    int firstNum;
    int secondNum;
    ImageButton plus;
    ImageButton minus;
    boolean select = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topOutput = findViewById(R.id.tv_top_output);
        midOutput = findViewById(R.id.tv_mid_output);
        answer = findViewById(R.id.tv_answer);

        ImageButton num0 = findViewById(R.id.ib_num0);
        ImageButton num1 = findViewById(R.id.ib_num1);
        ImageButton num2 = findViewById(R.id.ib_num2);
        ImageButton num3 = findViewById(R.id.ib_num3);
        ImageButton num4 = findViewById(R.id.ib_num4);
        ImageButton num5 = findViewById(R.id.ib_num5);
        ImageButton num6 = findViewById(R.id.ib_num6);
        ImageButton num7 = findViewById(R.id.ib_num7);
        ImageButton num8 = findViewById(R.id.ib_num8);
        ImageButton num9 = findViewById(R.id.ib_num9);
        plus = findViewById(R.id.ib_plus);
        minus = findViewById(R.id.ib_minus);
        ImageButton num00 = findViewById(R.id.ib_num00);
        ImageButton num01 = findViewById(R.id.ib_num01);
        ImageButton num02 = findViewById(R.id.ib_num02);
        ImageButton num03 = findViewById(R.id.ib_num03);
        ImageButton num04 = findViewById(R.id.ib_num04);
        ImageButton num05 = findViewById(R.id.ib_num05);
        ImageButton num06 = findViewById(R.id.ib_num06);
        ImageButton num07 = findViewById(R.id.ib_num07);
        ImageButton num08 = findViewById(R.id.ib_num08);
        ImageButton num09 = findViewById(R.id.ib_num09);

        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        num00.setOnClickListener(this);
        num01.setOnClickListener(this);
        num02.setOnClickListener(this);
        num03.setOnClickListener(this);
        num04.setOnClickListener(this);
        num05.setOnClickListener(this);
        num06.setOnClickListener(this);
        num07.setOnClickListener(this);
        num08.setOnClickListener(this);
        num09.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
    }
    public void onClick(View v) {
        if(v.getId() == R.id.ib_num0) {
            topOutput.setText("0");
            firstNum = 0;
        }
        else if(v.getId() == R.id.ib_num1) {
            topOutput.setText("1");
            firstNum = 1;
        }
        else if(v.getId() == R.id.ib_num2) {
            topOutput.setText("2");
            firstNum = 2;
        }
        else if(v.getId() == R.id.ib_num3) {
            topOutput.setText("3");
            firstNum = 3;
        }
        else if(v.getId() == R.id.ib_num4) {
            topOutput.setText("4");
            firstNum = 4;
        }
        else if(v.getId() == R.id.ib_num5) {
            topOutput.setText("5");
            firstNum = 5;
        }
        else if(v.getId() == R.id.ib_num6) {
            topOutput.setText("6");
            firstNum = 6;
        }
        else if(v.getId() == R.id.ib_num7) {
            topOutput.setText("7");
            firstNum = 7;
        }
        else if(v.getId() == R.id.ib_num8) {
            topOutput.setText("8");
            firstNum = 8;
        }
        else if(v.getId() == R.id.ib_num9) {
            topOutput.setText("9");
            firstNum = 9;
        }
        else if(v.getId() == R.id.ib_num00) {
            midOutput.setText("0");
            secondNum = 0;
        }
        else if(v.getId() == R.id.ib_num01) {
            midOutput.setText("1");
            secondNum = 1;
        }
        else if(v.getId() == R.id.ib_num02) {
            midOutput.setText("2");
            secondNum = 2;
        }
        else if(v.getId() == R.id.ib_num03) {
            midOutput.setText("3");
            secondNum = 3;
        }
        else if(v.getId() == R.id.ib_num04) {
            midOutput.setText("4");
            secondNum = 4;
        }
        else if(v.getId() == R.id.ib_num05) {
            midOutput.setText("5");
            secondNum = 5;
        }
        else if(v.getId() == R.id.ib_num06) {
            midOutput.setText("6");
            secondNum = 6;
        }
        else if(v.getId() == R.id.ib_num07) {
            midOutput.setText("7");
            secondNum = 7;
        }
        else if(v.getId() == R.id.ib_num08) {
            midOutput.setText("8");
            secondNum = 8;
        }
        else if(v.getId() == R.id.ib_num09) {
            midOutput.setText("9");
            secondNum = 9;
        }
        else if(v.getId() == R.id.ib_plus) {
            plus.setBackgroundColor(Color.rgb(3, 37, 91));
            minus.setBackgroundColor(Color.LTGRAY);
            select = true;
        }
        else if(v.getId() == R.id.ib_minus) {
            minus.setBackgroundColor(Color.rgb(3, 37, 91));
            plus.setBackgroundColor(Color.LTGRAY);
            select = false;
        }
        if(select == true) {
            answer.setText(firstNum + secondNum + "");
        }
        if (select == false){
            answer.setText(firstNum - secondNum + "");
        }

    }
}
