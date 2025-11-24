package assignment;

import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade point of subject " + i + ": ");
            double gp = sc.nextDouble();

            System.out.print("Enter credits of subject " + i + ": ");
            int credit = sc.nextInt();

            totalPoints += gp * credit;
            totalCredits += credit;
        }

        double cgpa = totalPoints / totalCredits;

        System.out.println("Your CGPA is: " + cgpa);
    }
}