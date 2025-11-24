package assignment;

import java.util.Scanner;

public class Area_pllgm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of l1:");
        double d1 = input.nextInt();
        System.out.print("Enter the length l2:");
        double d2 = input.nextInt();
        double areapg=d1*d2;
        System.out.print("Area of parallelogram is "+areapg);
    }
}
