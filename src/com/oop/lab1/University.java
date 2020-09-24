package com.oop.lab1;

import java.util.ArrayList;

public class University {
    private String name;
    private int found_year;
    private ArrayList<Student> student_list = new ArrayList<Student>(0);

    public University(String _name, int _found_year){
        this.name = _name; this.found_year = _found_year;
    }
    public void addStudent(Student _stud){
        this.student_list.add(_stud);
    }
    public double average(){
        double sum = 0.f;
        for (Student student : this.student_list) sum += student.getMark();
        return sum/this.student_list.size();
    }

    public String getName(){
        return this.name;
    }
    public int getFound_year(){
        return this.found_year;
    }

    public ArrayList<Student> getStudent_list() {
        return this.student_list;
    }
}
