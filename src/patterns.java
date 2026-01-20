import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = input.nextInt();
        pattern3(n);
    }


    static void pattern1(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {

            int totalColsInRow;
            if (row <= n) {
                totalColsInRow = row;          // 1st half
            } else {
                totalColsInRow = 2 * n - row;  // 2nd half
            }

            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    static void pattern2(int n) {
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }




    static void pattern3(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {

            int totalColsInRow;
            if (row <= n) {
                totalColsInRow = row;          // 1st half
            } else {
                totalColsInRow = 2 * n - row;  // 2nd half
            }

            int noofspace= n-totalColsInRow;
            for(int s=0;s<noofspace;s++){
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
