public class Linear {
    public static void main(String[] args) {
        int[] nums = {34,7,9,78,45,89,23,3};
        int target = 78;
        int val=linearsearch(nums,target);
        System.out.println("found at index no:"+val);
    }

    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
