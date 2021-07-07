package com.example.anushmp.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private ArrayList<studentModel> studentlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initviews();
        buildstudentlist();
        setrecyclerview();
    }

    private void setrecyclerview() {

        StudentAdapter sta = new StudentAdapter(studentlist);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setAdapter(sta);
        rv.setLayoutManager(llm);

    }

    private void buildstudentlist() {


        studentModel student1 = new studentModel("Anush",20,"XX1XX");
        studentlist.add(student1);

        for(int i = 0; i<20; i++){

            studentModel student2 = new studentModel("Bill" + i,55,"9992B");
            studentlist.add(student2);
        }

    }

    private void initviews() {

        rv = findViewById(R.id.rvrecyclerview);


    }


}