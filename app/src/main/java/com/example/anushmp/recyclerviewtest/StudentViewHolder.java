package com.example.anushmp.recyclerviewtest;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        initviews(itemView);
    }

    private void initviews(View itemView) {

        tv1 = itemView.findViewById(R.id.tvname);
        tv2 = itemView.findViewById(R.id.tvage);
        tv3 = itemView.findViewById(R.id.rollno);


    }


    public void setData(studentModel st){

        tv1.setText(st.getName());
        tv2.setText(st.getAge() +"");
        tv3.setText(st.getRollno());

    }


}
