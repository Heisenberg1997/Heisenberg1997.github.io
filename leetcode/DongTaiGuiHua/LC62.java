package DongTaiGuiHua;

/**
 * 状态表转移表 每一个格表示 有多少种到达此处的方法
 *
 * 可以替换dp为循环二维数组 dp[i][j]的状态只和dp[i][j-1] 和dp[i][j]的状态有关 所以只保存两行状态 减少空间复杂度
 * 2为考虑有障碍物
 */
public class LC62 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0]=1;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(j>0 && i>0){
                    dp[i][j] = dp[i-1][j]+dp[i][j-1]+dp[i][j];
                }
                else if (j==0 && i>0){
                    dp[i][j] = dp[i-1][j]+dp[i][j];
                }
                else if (j>0 && i==0){
                    dp[i][j] = dp[i][j-1]+dp[i][j];
                }

            }
        }
        return dp[m-1][n-1];
    }

    public static int uniquePaths2(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] ==1 ||obstacleGrid[m-1][n-1] ==1) return 0;
        int[][] dp = new int[m][n];
        dp[0][0]=1;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(j>0 && i>0){
                    if (obstacleGrid[i-1][j]==0 && obstacleGrid[i][j-1]==0)
                    dp[i][j] = dp[i-1][j]+dp[i][j-1]+dp[i][j];
                    else if (obstacleGrid[i-1][j]!=0 && obstacleGrid[i][j-1]==0){
                        dp[i][j] = dp[i][j-1]+dp[i][j];
                    }
                    else if (obstacleGrid[i-1][j]==0 && obstacleGrid[i][j-1]!=0){
                        dp[i][j] = dp[i-1][j]+dp[i][j];
                    }
                }

                else if (j==0 && i>0){
                    if (obstacleGrid[i-1][j]==0)
                        dp[i][j] = dp[i-1][j]+dp[i][j];
                    else
                        dp[i][j] = 0;
                }
                else if (j>0 && i==0){
                    if (obstacleGrid[i][j-1]==0)
                        dp[i][j] = dp[i][j-1]+dp[i][j];
                    else
                        dp[i][j] = 0;
                }

            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};

        System.out.println("args = " + uniquePaths2(obstacleGrid));
    }
}
