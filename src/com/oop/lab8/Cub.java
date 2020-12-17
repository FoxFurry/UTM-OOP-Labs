package com.oop.lab8;

public class Cub extends GeometricBody {
    float a;

    Cub(float _a) {
        a = _a;
    }

    float getSurface() {
        return 6*(a * a);
    }

    float getVolume() {
        return a * a * a;
    }
}
