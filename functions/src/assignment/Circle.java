package assignment;

import java.util.Scanner;
//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double r=sc.nextDouble();
        System.out.println("Circumference of the circle of radius r="+r+" is "+circumference(r));
        System.out.print("Area of the circle of radius r="+r+" is "+Area(r));
    }
    static Double circumference(Double radius){
        double circ=2*Math.PI*radius;
        return circ;
    }
    static Double Area(Double radius){
        double area=Math.PI*radius*radius;
        return area;
    }
}

