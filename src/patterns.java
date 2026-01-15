import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = input.nextInt();
        pattern1(n);
    }

    static void pattern1(int n) {
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
