package com.oop.lab1;

import java.util.ArrayList;

public class University {
    private String name;
    private int found_year;
    private ArrayList<Student> student_list = new ArrayList<Student>(0);

    public University(String _name, int _found_year){
        name = _name; found_year = _found_year;
    }
    public void addStudent(Student _stud){
        student_list.add(_stud);
    }
    public double average(){
        double sum = 0.f;
        for(int i = 0; i < student_list.size(); i++)
            sum += student_list.get(i).getMark();
        return sum/student_list.size();
    }

    public String getName(){
        return name;
    }
    public int getFound_year(){
        return found_year;
    }

    public ArrayList<Student> getStudent_list() {
        return student_list;
    }
}
