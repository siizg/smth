package com.samsung;

import com.samsung.Point;
import com.samsung.figure;

import java.awt.*;

public class Square implements figure {
    Point v;
    double edge;
    Color color;
    public Square(com.samsung.Point v, double edge) {
        this.edge = edge;
        this.v = v;
    }

    @Override
    public void move(double dx, double dy) {
        this.v.move(dx, dy);
    }

    @Override
    public void setColor(Color c) {
        this.color = c;
    }
    public double getSurface() {
        return this.edge * this.edge;
    }
    public double getPerimeter() {
        return this.edge * 4;
    }

    @Override
    public String toString() {
        return "com.samsung.Square{" +
                "v=" + v +
                ", edge=" + edge +
                ", color=" + color.toString() +
                '}';
    }
}
