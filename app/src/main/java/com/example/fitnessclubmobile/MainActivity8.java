package com.example.fitnessclubmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity8 extends AppCompatActivity {

    public static final  String LOG_TAG="CodeLab";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    public void launchActivitySix(View view) {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }

    public void launchActivityFour(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void launchActivityFive(View view) {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    public void launchActivitySeven(View view) {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
    public void Facebook(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/"));
//        if (intent.resolveActivity(getPackageManager()) != null) {
        startActivity(intent);
//        }

    }

    public void goHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}