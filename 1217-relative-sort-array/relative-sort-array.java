class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] freq = new int[1001];

        // Count frequency of arr1
        for (int x : arr1) {
            freq[x]++;
        }

        int[] ans = new int[arr1.length];
        int index = 0;

        // Put arr2 elements first
        for (int x : arr2) {

            while (freq[x] > 0) {
                ans[index++] = x;
                freq[x]--;
            }
        }

        // Put remaining elements in ascending order
        for (int x = 0; x < freq.length; x++) {

            while (freq[x] > 0) {
                ans[index++] = x;
                freq[x]--;
            }
        }

        return ans;
    }
}