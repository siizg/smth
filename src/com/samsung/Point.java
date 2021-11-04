package com.samsung;

import java.awt.*;

public class Point implements figure {
    double x;
    double y;
    Color color;

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point anotherPoint) {
        this.x = anotherPoint.x;
        this.y = anotherPoint.y;
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void setColor(Color c) {
        this.color = c;
    }

    @Override
    public String toString() {
        return "com.samsung.Point{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color.toString() +
                '}';
    }
    public double distanceXTo(Point anotherPoint) {
        return this.x - anotherPoint.x;
    }
    public double distanceYTo(Point anotherPoint) {
        return this.y - anotherPoint.y;
    }
    public double distanceTo(Point anotherPoint) {
        double dx = this.distanceXTo(anotherPoint);
        double dy = this.distanceYTo(anotherPoint);
        return Math.sqrt(dy * dy + dx * dx);
    }
}
