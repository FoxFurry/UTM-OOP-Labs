package com.oop.lab1;

public class Monitor {
    public static class Resolution{
        int x, y;
    }
    public static class Dimension{
        int a, b;
    }
    private String color;
    private Resolution res = new Resolution();
    private Dimension dim = new Dimension();

    public Monitor(int res_x, int res_y, int dim_a, int dim_b){
        res.x = res_x; res.y = res_y;
        dim.a = dim_a; dim.b = dim_b;
    }
    public void setRes(int _x, int _y){
        res.x = _x; res.y = _y;
    }
    public void setDim(int _a, int _b){
        dim.a = _a; dim.b = _b;
    }
    public void setColor(String _color){
        color = _color;
    }

    public Dimension getDim() {
        return dim;
    }
    public Resolution getRes() {
        return res;
    }
    public String getColor() {
        return color;
    }
}
