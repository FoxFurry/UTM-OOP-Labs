package com.oop.lab2;

import java.util.ArrayList;

public class Queue {
    private int size;
    private int max_size;
    private ArrayList<Object> array;

    public Queue(){
        this.max_size = -1;
        this.size = 0;
        this.array = new ArrayList<Object>(0);
    }

    public Queue(int _max_size){
        max_size = Math.max(_max_size, 1);
        this.max_size = _max_size;
        this.size = 0;
        this.array = new ArrayList<Object>(0);
    }

    public boolean push(Object _val){
        if(this.max_size!=-1 && this.array.size()==max_size){
            return false;
        }
        else
            this.array.add(_val);
        return true;
    }

    public Object pop(){
        if(this.array.size()==0){
            return null;
        }
        Object ret_val = this.array.get(0);
        this.array.remove(0);
        return ret_val;
    }
}
