package DongTaiGuiHua;

public class LC309 {
    public int maxProfit(int[] prices) {
        int[][] dp =new int[prices.length+1][3];
        dp[0][0]=0;
        dp[0][1]=0;
        dp[0][2]=-prices[0];

        dp[1][0]=0;
        dp[1][1]=-prices[0];
        dp[1][2]=-prices[1];

        if (prices.length<=1){
            return 0;
        }
        for (int i=2;i<prices.length;i++){
            dp[i][0] = Math.max(dp[i-1][0],Math.max(dp[i-1][1]+prices[i],dp[i-1][2]+prices[i]));
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][2]);
            dp[i][2] = -prices[i-1];
        }
        return dp[prices.length-1][0];
    }

    public int maxProfit2(int[] prices) {
        if (prices.length<=1){
            return 0;
        }
        int[][] dp =new int[prices.length+1][3];
        dp[0][0]=0;
        dp[0][1]=0;
        dp[0][2]=-prices[0];

        for (int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]);
            dp[i][1] = dp[i-1][2]+prices[i];
            dp[i][2] =Math.max(dp[i-1][2],dp[i-1][0]-prices[i]);
        }
        return Math.max(dp[prices.length-1][1],dp[prices.length-1][0]);
    }


}
