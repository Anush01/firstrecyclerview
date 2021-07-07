package com.example.anushmp.recyclerviewtest;

public class studentModel {

    private String name;
    private int age;
    private String rollno;

    public studentModel(String name, int age, String rollno) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRollno() {
        return rollno;
    }
}
