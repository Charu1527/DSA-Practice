package lectures;

public class OrderAgnostic_BS {
    public static void main(String[] args) {
        int[] arr={-7,-5,-2,0,2,4,5,8,17,76,89};
        int target=5;
        System.out.println(Orderagnostic_BS(arr,target));
    }

    static int Orderagnostic_BS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else if(target>arr[mid]){
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else if(target<arr[mid]){
                    start=mid+1;}
                }
            }
        return -1;
    }

}
