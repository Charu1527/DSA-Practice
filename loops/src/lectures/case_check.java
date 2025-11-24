package lectures;

import java.util.Scanner;

public class case_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        char ch=sc.next().trim().charAt(0);

        if (ch>='a'&& ch<='z' ){
            System.out.println("LOWERCASE");
        }else{
            System.out.println("UPPERCASE");
        }
    }
}
