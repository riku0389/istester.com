package com.java.test;

abstract class Figure {
    double dim1;
    double dim2;

    public Figure(double a, double b) {
        this.dim1 = a;
        this.dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    @java.lang.Override
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}

class Triangke extends Figure{
    Triangke(double a,double b){
        super(a,b);
    }

    @java.lang.Override
    double area() {
        System.out.println("Inside Area fot Triangke");
        return dim1+dim2/2;
    }
}

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(9,5);
        Triangke t=new Triangke(10,8);
        Figure figref;
        figref=r;
        System.out.println("Area is "+figref.area());

        figref=t;
        System.out.println("Area is "+figref.area());
    }
}
