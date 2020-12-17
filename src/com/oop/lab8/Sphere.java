package com.oop.lab8;

public class Sphere extends GeometricBody {
    float r;

    Sphere(float _r) {
        r = _r;

    }

    float getSurface() {
        return 4 * (float)Math.PI * r * r;
    }

    float getVolume() {
        return 4/3.0F * (float)Math.PI * r * r * r;
    }
}
