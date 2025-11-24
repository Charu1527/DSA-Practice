//find min element in the array
import java.util.Arrays;
import java.util.Scanner;

public class Min_element {
    public static void main(String[] args) {
        int[] arr={23,56,4,89,2,9,56,45};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }


}
