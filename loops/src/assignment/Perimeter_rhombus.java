package assignment;

import java.util.Scanner;

public class Perimeter_rhombus {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side=input.nextDouble();
        double perimeter=4*side ;
        System.out.println("Perimeter is "+perimeter);
    }
}
