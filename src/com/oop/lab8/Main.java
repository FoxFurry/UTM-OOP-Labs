package com.oop.lab8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cub body1 = new Cub(4);
        Parallelepiped body2 = new Parallelepiped(2,2,8);
        Sphere body3 = new Sphere(666);

        ArrayList<GeometricBody> bodies = new ArrayList<>();
        bodies.add(body1);
        bodies.add(body2);
        bodies.add(body3);


        System.out.println(GeometricBodyController.getBiggestVolume(bodies));
        System.out.println(GeometricBodyController.getBiggestSurface(bodies));


    }
}
