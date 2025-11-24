package lectures;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] acc={{1, 2, 3},{3, 9, 1}};
        int max=maximumWealth(acc);
        System.out.println(max);

    }
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int account=0;account<accounts[person].length;account++) {
                sum += accounts[person][account];
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}

