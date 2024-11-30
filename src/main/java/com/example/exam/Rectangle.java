package com.example.exam;

public class Rectangle {
    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void scale(double scaleFactor) {
        this.width *= scaleFactor;
        this.height *= scaleFactor;
    }

    @Override
    public String toString() {
        return String.format("Rectangle(top-left=(%.2f, %.2f), width=%.2f, height=%.2f)", x, y, width, height);
    }
}
