package DongTaiGuiHua;

public class LCP07 {
    public int numWays(int n, int[][] relation, int k) {
        int[][] dp = new int[k+1][n];
        dp[0][0]=1;
        for (int i=0;i<k;i++){
            for (int[] ints : relation) {
                int a1=ints[0];
                int a2=ints[1];
                dp[i+1][a2] = dp[i+1][a2]+dp[i][a1];
            }
        }
        return dp[k][n-1];
    }
}
