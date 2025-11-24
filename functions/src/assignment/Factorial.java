package assignment;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    //Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is  "+factorial(n));

    }
    static BigInteger factorial(int n){
        BigInteger fact=BigInteger.ONE;
        for (int i=1;i<=n;i++){
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
