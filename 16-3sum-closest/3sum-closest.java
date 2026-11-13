class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //SAME AS 3SUM bas isme we have to compare the values of 
        int n=nums.length;
        Arrays.sort(nums);
        int closest=nums[0] + nums[1] + nums[2];

        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i] + nums[left] + nums[right];
                if(Math.abs(target - sum) < Math.abs(target - closest)) {//diff btw target and sum
                closest = sum;
                }
                if(sum>target){
                    right--;
                }else if(sum<target){
                    left++;
                }else{
                    return target;
                }
            }
        }
        return closest;
    }
}