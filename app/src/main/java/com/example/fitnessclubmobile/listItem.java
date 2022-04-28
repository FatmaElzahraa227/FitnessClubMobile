package com.example.fitnessclubmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class listItem extends AppCompatActivity {
    private ArrayList<String> mWordList;
    private RecyclerView mRecyclerView;
    private CustomAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);
        mWordList=new ArrayList<>();
        mWordList.add("Text1");
        mWordList.add("Text2");
        mWordList.add("Text3");
        mRecyclerView=findViewById(R.id.recyclerview);
        mAdapter=new CustomAdapter(mWordList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}