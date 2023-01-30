package org.example;
import java.util.logging.*;
import java.util.*;

class Shape {
    int stype;
    double a;
    double p;
    double l;
    double b;
    double s1;
    double s2;
    double r;
    double pi = 3.14;

    public Shape(int type, double length, double breadth, double side1, double side2, double radius) {
        stype = type;
        l = length;
        b = breadth;
        s1 = side1;
        s2 = side2;
        r = radius;
    }

    double perimeter() {
        if (stype == 1) {
            p = 2 * (l + b);
        }
        if (stype == 2) {
            p = b + s1 + s2;
        }
        if (stype == 3) {
            p = 2 * pi * r;
        }
        return p;
    }

    double area() {
        if (stype == 1) {
            a = l * b;
        }
        if (stype == 2) {
            a = (b * l) / 2;
        }
        if (stype == 3) {
            a = pi * r * r;
        }
        return a;
    }

    public static void main(String[] args) {
        static Logger l=Logger.getLogger("com.api.jar");

        Scanner s = new Scanner(System.in);
        l.info("Enter the length:");
        double length = s.nextFloat();
        l.info("Enter the breadth:");
        double breadth = s.nextFloat();
        l.info("Enter the side1:");
        double side1 = s.nextFloat();
        l.info("Enter the side2:");
        double side2 = s.nextFloat();
        l.info("Enter the radius:");
        double radius = s.nextFloat();

        l.info("choose one from below.");
        l.info("1.Rectangle\n2.Triangle\n3.Circle");
        l.info("Enter the shape type:");
        int type = s.nextInt();
        Shape sh = new Shape(type, length, breadth, side1, side2, radius);
        l.log(Level.INFO, () -> "The perimeter of the given shape is:" +sh.perimeter());
        l.log(Level.INFO, () -> "The area of the given shape is:" +sh.area());
        s.close();
    }

}
