package com.example.fitnessclubmobile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>
{
    private ArrayList<String> localDataset;
    public  CustomAdapter(ArrayList<String> dataSet)
    {
        localDataset=dataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup viewGroup, int viewType) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_list_item,viewGroup,false);
        return new ViewHolder(view);
    }
    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private  final TextView textView;
        public  ViewHolder(View view)
        {
            super(view);
            textView=(TextView) view.findViewById(R.id.textview);
        }
        public  TextView getTextView()
        {
            return textView;
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.getTextView().setText(localDataset.get(position));

    }

    @Override
    public int getItemCount() {
        return localDataset.size();
    }
}
