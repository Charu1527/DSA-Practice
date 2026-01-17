import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = input.nextInt();
        pattern1(n);
    }

    static void pattern1(int n) {
//        1st half of the code
        for(int row=1;row<=n/2;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
//        2nd half of the code
        for(int row=n/2;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
