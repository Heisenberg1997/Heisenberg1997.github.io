package DongTaiGuiHua;

/**
 * 二叉搜索树 左边节点 < 中间节点 < 右边节点
 * 构建多少二叉树 根据不同根植 左边任选几个数可以构成一个子树 右边任选几个数可以构成一个子树 然后两个相乘
 */
public class NC9695 {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i=2;i<=n;i++){
            for (int j=1;j<=i;j++){
                dp[i]=dp[i]+dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }


}
