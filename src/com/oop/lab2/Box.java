package com.oop.lab2;

public class Box {
    private double height, width, depth;

    public Box(){
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }
    public Box(double _val){
        this.height = _val;
        this.width = _val;
        this.depth = _val;
    }
    public Box(double _height, double _width, double _depth){
        this.height = _height;
        this.width = _width;
        this.depth = _depth;
    }

    public double getSurf(){
        return 2.f * (  this.height * this.width +
                        this.width  * this.depth +
                        this.depth  * this.height  );
    }

    public double getVolume(){
        return this.height * this.width * this.depth;
    }
}
