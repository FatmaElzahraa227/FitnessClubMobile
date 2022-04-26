package com.example.fitnessclubmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }


    public void launchActivityFour(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void launchActivityEight(View view) {
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }

    public void launchActivityFive(View view) {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
}