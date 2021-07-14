package DongTaiGuiHua;

/**
 * 爬楼梯案例
 * 第n层的数量由前两层的数量相加而来，故用动态规划。
 */

public class LC70 {

    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int i1 = 1;
        int i2 = 2;
        for(int i=3;i<=n;i++){
            int temp = i1+i2;
            i1 = i2;
            i2 = temp;
        }
        return i2;
    }
}