package com.oop.lab1;

public class Student {
    String name;
    int age;
    double mark;

    public Student(String _name, int _age, double _mark){
        name = _name; age = _age; mark = _mark;
    }

    public void setName(String _name){
        name = _name;
    }
    public void setAge(int _age){
        age = _age;
    }
    public void setMark(double _mark){
        mark = _mark;
    }
}
