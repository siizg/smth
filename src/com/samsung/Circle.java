package com.samsung;

import java.awt.*;

public class Circle implements figure {
    Point center;
    double radius;
    Color color;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "com.samsung.Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", color=" + color.toString() +
                '}';
    }

    @Override
    public void move(double dx, double dy) {
        this.center.move(dx, dy);
    }

    @Override
    public void setColor(Color c) {
        this.color = c;
    }
    public double getDiameter() {
        return this.radius * 2;
    }
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }
    public double getSurface() {
        return this.radius * Math.PI * this.radius;
    }
}
