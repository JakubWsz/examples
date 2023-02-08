package org.example.classes;

public class Triangle extends Shape{
    @Override
    double calculateField(double x, double y) {
        return (x*y)/2;
    }
}
