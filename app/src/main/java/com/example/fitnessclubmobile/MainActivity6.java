package com.example.fitnessclubmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {
    private ArrayList<String> mWordList;
    private RecyclerView mRecyclerView;
    private CustomAdapter mAdapter;
    public static final  String LOG_TAG="CodeLab";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        mWordList=new ArrayList<>();
        mWordList.add("Field 1");
        mWordList.add("Field 2");
        mWordList.add("Field 3");
        mWordList.add("Field 4");
        mWordList.add("Field 5");mWordList.add("Field 6");mWordList.add("Field 7");mWordList.add("Field 8");mWordList.add("Field 9");mWordList.add("Field 10");mWordList.add("Field 11");mWordList.add("Field 12");mWordList.add("Field 13");mWordList.add("Field 14");mWordList.add("Field 15");
        mRecyclerView=findViewById(R.id.recyclerview);
        mAdapter=new CustomAdapter(mWordList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
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
    public void Facebook(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/"));
//        if (intent.resolveActivity(getPackageManager()) != null) {
        startActivity(intent);
//        }

    }
    public void settings(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void goHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void goExercise(View view) {
        Intent intent = new Intent(this, Exercise.class);
        startActivity(intent);
    }
}