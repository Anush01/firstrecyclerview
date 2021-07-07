package com.example.anushmp.recyclerviewtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    @NonNull

    public ArrayList<studentModel> studentlist;

    public StudentAdapter(ArrayList<studentModel> studentlist){

        this.studentlist = studentlist;
    }

    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new StudentViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {

        studentModel sv = studentlist.get(position);
        holder.setData(sv);

    }

    @Override
    public int getItemCount() {
        return studentlist.size();
    }
}
