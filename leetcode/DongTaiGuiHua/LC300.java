package DongTaiGuiHua;

/**
 * dp 代表当前长度所内的最大子串长度
 * 没遇见一个数 开始和前面所有数组合 如果当前数大 则组合成新串
 * 循环 直到
 */
public class LC300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length+1];
        dp[0]=1;
        int maxnum = 1;
        for (int i=1;i<nums.length;i++){
            dp[i] =1;
            for (int j=0;j<i;j++){
                if (nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            maxnum = maxnum>dp[i]?maxnum:dp[i];

        }
        return maxnum;

    }
    public int lengthOfLIS2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }

}
