class Solution {
    public static int largest(int[] arr) {
        // code here
        int n=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(n<=arr[i]){
                n=arr[i];
            }
        }
    return n;
    }
}
