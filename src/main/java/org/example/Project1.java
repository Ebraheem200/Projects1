package org.example;

/**
 * Driver class used to test com.csc205.project1.Point implementation for Project 1.
 *
 * Professor Ray Hedgecock
 * Student Ebraheem
 * @version 1.1
 */
public class Project1 {

    public static void main(String[] args) {

        System.out.println("Project 1 : com.csc205.project1.Point Tester\n");

        Point a = new Point(3.0, 1.0);
        Point b = new Point();
        b.setPoint(6.0, 5.0);

        System.out.println("com.csc205.project1.Point 1: " + a);
        System.out.println("com.csc205.project1.Point 2: " + b);

        System.out.println("\nDistance: " + a.distance(b));

        double rotation = Math.PI / 2.0;
        a.rotate(rotation);
        System.out.println("\nRotated a " + rotation + ": " + a);

        Point b2 = new Point(b.getX(), b.getY());
        b.shiftX(4);
        b.shiftY(-2);
        System.out.println("Shifted b " + b.distance(b2) + " away from original position: " + b);

    }
}
