package DongTaiGuiHua;

/**
 * 只买卖一次maxProfit1
 * 多次买卖maxProfit2
 *
 */
public class LC121 {

    public static int maxProfit1(int[] prices) {
        int len = prices.length;
        if (len<2)
            return 0;
        int[][] dp = new int[len][2];
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for (int i=1;i<len;i++){
            dp[i][0]=Math.max(dp[i-1][0],prices[i]+dp[i-1][1]);
            dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
        }
        return dp[len-1][0];

    }
    public static int maxProfit2(int[] prices) {
        int len = prices.length;
        if (len<2)
            return 0;
        int[][] dp = new int[len][2];
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for (int i=1;i<len;i++){
            dp[i][0]=Math.max(dp[i-1][0],prices[i]+dp[i-1][1]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[len-1][0];

    }

    public static void main(String[] args) {
        int[] print = {7,1,5,3,6,4};
        System.out.println(" = " + maxProfit1(print));
    }
}
