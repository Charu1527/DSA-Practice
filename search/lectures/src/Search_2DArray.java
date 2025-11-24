import java.util.Arrays;

public class Search_2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {56,67,89},
                {54,90,23,78},
                {78,34,51,28,45}
        };
        int target=34;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
