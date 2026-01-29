import java.util.Scanner;

public class isOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println(Odd(n));
    }

    static boolean Odd(int n){
        return(n & 1)==1;
    }
}
