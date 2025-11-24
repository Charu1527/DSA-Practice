package assignment;

import java.util.Scanner;

public class Sub_sum {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the no: ");
        int num=in.nextInt();
        int sum=0;
        int prod=1;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            prod*=rem;
            num=num/10;
        }
        System.out.print("The sum is "+sum+"  ");
        int diff=prod-sum;
        System.out.println("The product is "+prod);
        System.out.println("The difference is "+diff);
    }
}