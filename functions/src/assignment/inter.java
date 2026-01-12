package assignment;

import java.util.Scanner;

public class inter {
    public static void main(String[] args) {
        int arr[]={9,7,4,9,8,5,3,4};
        int target=5;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == target){
                System.out.println("element found"+i);
            }else{
                System.out.println("element not found");
            }
        }
    }
}
