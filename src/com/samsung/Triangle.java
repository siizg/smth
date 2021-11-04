package com.samsung;

import com.samsung.Point;
import com.samsung.figure;

import java.awt.*;

public class Triangle implements figure {
    com.samsung.Point a;
    com.samsung.Point b;
    com.samsung.Point c;
    Color color;

    public Triangle(com.samsung.Point a, Point b, com.samsung.Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "com.samsung.Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", color=" + color.toString() +
                '}';
    }

    @Override
    public void move(double dx, double dy) {
        this.a.move(dx, dy);
        this.b.move(dx, dy);
        this.c.move(dx, dy);
    }

    @Override
    public void setColor(Color c) {
        this.color = c;
    }

    public double getSurface() {
        double ac = a.distanceTo(c);
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double p = (ab + bc + ac)/2;
        return Math.sqrt(p * (p - ac)* (p - ab) * (p - bc));
    }

    public double getPerimeter() {
        double ac = a.distanceTo(c);
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        return ac + ab + bc;
    }
    public boolean isIsoceles() {
        double ac = a.distanceTo(c);
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        if(ac == bc || ab == ac || ab == bc) return true;
        return false;
    }
    public boolean estEquilateral() {
        double ac = a.distanceTo(c);
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        if(ac == ab && ab == bc) return true;
        return false;
    }
    public boolean isRectangle() {
        double ac = a.distanceTo(c);
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        if(ac * ac == ab * ab + bc * bc ) return true;
        else if(ab * ab == ac * ac + bc * bc) return true;
        else if(bc * bc == ac * ac + ab * ab) return true;
        return false;
    }
}
