package com.example.palmdigital.toast04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Today is Thursday", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "December 13, 2018", Toast.LENGTH_LONG).show();

    }
}
