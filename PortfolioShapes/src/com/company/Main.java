package com.company;

import org.junit.Test;

import java.awt.*;

abstract class Shapes{
    public void Shapes(){
    }
}

class Triangle extends Shapes {
    public void Shapes() {
        int SideA = 25;
        int SideB = 20;
        int SideC = 30;
        int CenterXTri = 2;
        int CenterYTri = 2;
        System.out.println("The Center of the Triangle is at cordinates (2,2)");
        System.out.print("The Circumference of the Triangle is ");
        System.out.println(SideA+SideB+SideC+"m"); //O = a+b+c
        System.out.print("The Area of the Triangle is ");
        System.out.println(SideA*SideB/2+" m^2"); // A=Height * Base /2
        System.out.println();
    }

}

class Circle extends Shapes{
    public void Shapes(){
        int Diameter = 10;
        double Pi = 3.145; //Only using a few decimals to PI
        int Radius = 5;
        int CenterXCir = 5;
        int CenterYCir = 5;
        System.out.println("The Center of the Circle is at cordinates (5,5)");
        System.out.print("The Circumference of the circle is ");
        System.out.println(Diameter*Pi+"m"); // O = D * PI
        System.out.print("The Area of the Circle is ");
        System.out.println(Pi*(Radius*Radius)+" m^2"); // A = Pi * r^2
        System.out.println();

    }
}

class Rectangle extends Shapes{
    public void Shapes(){
        int SideD = 25;
        int SideE = 35;
        int CenterXRec = 8;
        int CenterYRec = 8;
        System.out.println("The Center of the Rectangle is at cordinates (8,8)");
        System.out.print("The Circumference of the Rectangle is ");
        System.out.println(SideD+SideE*2+"m");
        System.out.print("The Area of the Rectangle is ");
        System.out.println(SideD*SideE+" m^2");

    }
}

class DistanceToCenter extends Shapes{

    public void Shapes() {
        int CenterXTri = 2;
        int CenterYTri = 2;
        int CenterXCir = 5;
        int CenterYCir = 5;
        int CenterXRec = 8;
        int CenterYRec = 8;

        System.out.println();
        System.out.print("The distance from Triangle to Circle is ");
        System.out.println(CenterXCir - CenterXTri+"m");
        System.out.print("The distance from Circle to Rectangle is ");
        System.out.println(CenterXRec - CenterXCir+"m");
        System.out.print("The distance from Triangle to Rectangle is ");
        System.out.println(CenterXRec - CenterXTri+"m");

    }
}


public class Main {

    public static void main(String[] args) {
    Triangle b= new Triangle();
    b.Shapes();
    Circle c= new Circle();
    c.Shapes();
    Rectangle d=new Rectangle();
    d.Shapes();
    DistanceToCenter e=new DistanceToCenter();
    e.Shapes();

    }
}
