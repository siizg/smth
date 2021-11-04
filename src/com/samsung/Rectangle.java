package com.samsung;

import com.samsung.Point;
import com.samsung.figure;

import java.awt.*;

public class Rectangle implements figure {
    Point v;
    double edgeX;
    double edgeY;
    Color color;
    public Rectangle(com.samsung.Point v, double edgeX, double edgeY) {
        this.v = v;
        this.edgeX = edgeX;
        this.edgeY = edgeY;
    }

    @Override
    public String toString() {
        return "com.samsung.Rectangle{" +
                "v=" + v +
                ", edgeX=" + edgeX +
                ", edgeY=" + edgeY +
                ", color=" + color.toString()+
                '}';
    }

    @Override
    public void move(double dx, double dy) {
        v.move(dx, dy);
    }

    @Override
    public void setColor(Color c) {
        this.color = c;
    }
    public double getSurface() {
        return edgeX * edgeY;
    }
    public double getPerimeter() {
        return (edgeX + edgeY) * 2;
    }
}
