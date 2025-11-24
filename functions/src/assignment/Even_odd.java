package assignment;

import java.util.Scanner;
//Define a program to find out whether a given number is even or odd.
public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int no = sc.nextInt();
        System.out.print("Entered no is an even number :"+eve_odd(no));}
    static boolean eve_odd(int n) {
        return (n % 2 == 0);
    }
}
