package org.example;

import java.util.*;

class shape {
    int stype;
    double a;
    double p;
    double l;
    double b;
    double s1;
    double s2;
    double r;
    double pi = 3.14;

    public shape(int type, double length, double breadth, double side1, double side2, double radius) {
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
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length:");
        double length = s.nextFloat();
        System.out.println("Enter the breadth:");
        double breadth = s.nextFloat();
        System.out.println("Enter the side1:");
        double side1 = s.nextFloat();
        System.out.println("Enter the side2:");
        double side2 = s.nextFloat();
        System.out.println("Enter the radius:");
        double radius = s.nextFloat();

        System.out.println("choose one from below.");
        System.out.println("1.Rectangle\n2.Triangle\n3.Circle");
        System.out.println("Enter the shape type:");
        int type = s.nextInt();
        shape sh = new shape(type, length, breadth, side1, side2, radius);
        System.out.println("The perimeter of the given shape is:" + sh.perimeter());
        System.out.println("The area of the given shape is:" + sh.area());
        s.close();
    }

}
