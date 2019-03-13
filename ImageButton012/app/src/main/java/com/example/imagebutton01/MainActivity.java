package com.example.imagebutton01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton stopSignButton = findViewById(R.id.ib_stopSign);
        ImageButton rightArrowButton = findViewById(R.id.ib_rightArrow);
        ImageButton quoraLogoButton = findViewById(R.id.ib_quoraLogo);
        stopSignButton.setOnClickListener(this);
        rightArrowButton.setOnClickListener(this);
        quoraLogoButton.setOnClickListener(this);

    } // end of onCreate
    public void onClick(View view) {
        if(view.getId() == R.id.ib_stopSign) {
            Toast.makeText(this, "You clicked on a stop sign", Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.ib_rightArrow) {
            Toast.makeText(this, "You clicked on a right arrow", Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.ib_quoraLogo) {
            Toast.makeText(this, "You clicked on a quora logo", Toast.LENGTH_SHORT).show();
        }
    }
} // end of class
