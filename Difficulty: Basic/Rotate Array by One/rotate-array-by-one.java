class Solution {
    public void rotate(int[] arr) {
         int[] temp=new int[arr.length];
         for(int i=0;i<arr.length;i++){
             temp[(i+1)%arr.length]=arr[i];
         }
         for(int i=0;i<arr.length;i++){
             arr[i]=temp[i];
         }
    }
}