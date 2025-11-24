package lectures;
//This code is used to find the n-th Fibonacci number.
import java.util.Scanner;

public class fibo {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the index no: ");
        int n=in.nextInt();
        int a=0;
        int b=1;
        int count=2;

        while(count<=n){
            int temp=b;
            b=a+b;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
