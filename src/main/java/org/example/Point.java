package org.example;

public class Point {

    private double x;
    private double y;


    public Point(){
        x=0;
        y=0;
    }


    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }


    public double distance(Point p){
        double dist = Math.sqrt( Math.pow((this.x-p.getX()),2)+Math.pow((this.y-p.getY()),2));
        return dist;
    }



    public double getX() {
        return x;
    }


    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }


    public void setY(double y) {
        this.y = y;
    }


    public void setPoint(double new_x, double new_y){
        this.x = new_x;
        this.y = new_y;
    }


    public void shiftX(double dist){
        this.x+=dist;
    }


    public void shiftY(double dist){
        this.y+=dist;
    }


    public void rotate(double radian){
        this.x = (x*(Math.cos(radian)))-(y*(Math.sin(radian)));
        this.y = (x*(Math.sin(radian)))+(y*(Math.cos(radian)));
    }


    @Override
    public String toString() {
        return "com.csc205.project1.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
