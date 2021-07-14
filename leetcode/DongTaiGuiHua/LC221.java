package DongTaiGuiHua;

/**
 * 用dp表示 以此为正方形的右下角 所构成正方形的最大边长
 */
public class LC221 {
    public int maximalSquare(char[][] matrix) {
        if (matrix==null || matrix.length ==0 || matrix[0].length ==0){
            return 0;
        }
        int hang = matrix.length,lie = matrix[0].length;
        int maxnum = 0;
        int[][] dp = new int[hang][lie];

        for (int i=0;i<hang;i++){
            for (int j =0;j<lie;j++){
                if (matrix[i][j] == '1'){
                    if (i==0||j==0){
                        dp[i][j] =1;
                    }
                    else {
                        dp[i][j] = Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1])+1;
                        maxnum=Math.max(dp[i][j],maxnum);
                    }
                }
            }
        }
        int man = maxnum*maxnum;
        return man ;
    }
}
