package DongTaiGuiHua;

/**
 * 动态规划法建立递归方程 一定要想着回到dp上
 */
public class LC279 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1]=1;
        for (int i=1;i<=n;i++){
            int minnum =100000;
            for (int j=1;j<=Math.sqrt(i);j++){
                minnum=Math.min(minnum,dp[i-j*j]);
            }
            dp[i]=minnum+1;
        }
        return dp[n];
    }
}
