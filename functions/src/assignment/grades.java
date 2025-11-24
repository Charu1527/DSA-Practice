package assignment;

import java.util.Scanner;
//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
public class grades {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number obtained by the student:");
        int n=sc.nextInt();
        String grad;
        System.out.println(" grade obtained by the student:"+grade(n));
    }
    static String grade(int n){
        String grad="";
        if(91<=n && n<=100){
            grad="AA" ;
        }if(81<=n && n<=90){
            grad="AB";
        }if (71<=n && n<=80){
            grad="BB";
        }if (61<=n && n<=70){
            grad="BC";}
        if (51<=n && n<=60){
            grad="CD";}
        if (41<=n && n<=50){
            grad="DD";}
        if (n<=40){
            grad="FAILED";}
        return grad;
    }
}

