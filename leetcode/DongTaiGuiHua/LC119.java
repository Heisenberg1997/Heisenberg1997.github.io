package DongTaiGuiHua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 杨辉三角
 */
public class LC119 {
    public static  List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        List<List<Integer>> temp = new ArrayList<List<Integer>>();

        if (rowIndex==0){
            res.add(1);
            return res;
        }
        if (rowIndex ==1){
            res.add(1);
            res.add(1);
            return res;
        }
        else{

        for (int i=2;i<=rowIndex;i++){
            for (int j = 0;j<=i;j++){
                if ((j==0) ||(j==i))
                    res.add(1);
                else {
                    res.add(temp.get(i-1).get(j)+temp.get(i-1).get(j-1));
                }
            }


        }

    }
        return temp.get(rowIndex);
}
    public List<Integer> getRow1(int rowIndex) {
        Integer[] dp = new Integer[rowIndex + 1];
        Arrays.fill(dp,1);
        for(int i = 2;i < dp.length;i++){
            for(int j = i - 1;j > 0;j--)
                dp[j] = dp[j] + dp[j - 1];
        }
        List<Integer> res = Arrays.asList(dp);
        return res;



}
    public static void main(String[] args) {
        System.out.println("args = " + getRow(3));
    }
}
