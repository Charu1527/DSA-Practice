package assignment;

import java.util.Scanner;
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class Max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        int n3 = sc.nextInt();
        System.out.println("Maximum of 3 no's is " + maximum(n1, n2, n3));
        System.out.print("Minimum of 3 no's is " + minimum(n1, n2, n3));
    }

    static int maximum(int num1, int num2, int num3) {
        int max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        return max;

    }

    static int minimum(int num1, int num2, int num3) {
        int min = num1;
        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }
        return min;

    }
}
