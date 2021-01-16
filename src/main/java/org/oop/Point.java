package org.oop;


import static java.lang.Math.*;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point to) {
        Point from = this;
        double xDistance = getXDistance(from, to);
        double yDistance = getYDistance(from, to);
        return sqrt(pow(xDistance, 2) + pow(yDistance, 2));
    }

    public double direction(Point to) {
        Point from = this;
        double xDistance = getXDistance(from, to);
        double yDistance = getYDistance(from, to);
        return atan2(yDistance, xDistance);
    }

    private double getXDistance(Point from, Point to) {
        return to.x - from.x;
    }

    private double getYDistance(Point from, Point to) {
        return to.y - from.y;
    }
}
