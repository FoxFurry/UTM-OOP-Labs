package com.oop.lab8;

public class Parallelepiped extends GeometricBody {
    float a, b, c;

    Parallelepiped(float _a, float _b, float _c) {
        a = _a;
        b = _b;
        c = _c;
    }

    float getSurface() {
        return (a * b + b * c + c * a) * 2;
    }

    float getVolume() {
        return a * b * c;
    }
}
