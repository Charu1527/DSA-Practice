package assignment;

import java.util.Scanner;
//Write a function that returns the sum of first n natural numbers.
public class Sum_nums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter nth natural number: ");
        int n=sc.nextInt();
        System.out.print("Sum of first "+n+" natural no's is: "+sum(n));
    }
    static int sum(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+i;
        }return sum;
    }
}