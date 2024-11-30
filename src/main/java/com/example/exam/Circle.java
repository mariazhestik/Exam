package com.example.exam;

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void scale(double scaleFactor) {
        this.radius *= scaleFactor;
    }

    @Override
    public String toString() {
        return String.format("Circle(center=(%.2f, %.2f), radius=%.2f)", x, y, radius);
    }
}
