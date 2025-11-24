package assignment;

import java.util.Scanner;

public class cs_cylinder {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder:");
        double r=in.nextDouble();
        System.out.print("Enter the height of the cylinder:");
        double h=in.nextDouble();
        double cs_area=2*3.14*r*h;
        System.out.print("The curved surface area of the cylinder is "+cs_area);

    }

}
