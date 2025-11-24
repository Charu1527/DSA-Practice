//search for a no in the given range
import java.util.Scanner;

public class Search_Range {
    public static void main(String[] args) {
        int[] arr={23,56,4,89,3,9,56,45};
        Scanner sc = new Scanner(System.in);
        System.out.print("No to be searched:");
        int target = sc.nextInt();
        System.out.println(linearsearch(arr,target,1,4));
    }


    static int linearsearch(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <=end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

