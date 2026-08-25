class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];//XOR is used means 0^1=1,1^1=0
        }
        return ans;
    }
}