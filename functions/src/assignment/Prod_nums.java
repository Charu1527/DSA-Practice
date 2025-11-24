package assignment;

import java.util.Scanner;

//Define a method that returns the product of two numbers entered by user.
public class Prod_nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = in.nextInt();
        System.out.print("Product of 2 numbers is "+prod(n1,n2));

    }
    static int prod(int n1, int n2) {
        int product=n1*n2;
        return product;
    }
}
