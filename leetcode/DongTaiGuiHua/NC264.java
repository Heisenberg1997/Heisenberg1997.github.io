package DongTaiGuiHua;
/**
 *
 */

import java.util.ArrayList;

public class NC264 {
    public static int nthUglyNumber(int n) {

        ArrayList<Integer> al = new ArrayList<>();//用来存放是不是丑数
        int begin = 5;
        al.add(0);
        al.add(1);
        al.add(1);
        al.add(1);
        al.add(1);
        al.add(1);
        if (n <= begin) {
            return n;
        } else {
            int i=0;
            for ( i= 6; ; i++) {
                if (begin == n)
                    break;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0 && al.get(i/j) == 1 && al.get(j) == 1) {
                        al.add(1);
                        //System.out.println("i = " + i);
                        begin++;
                        break;
                    }
                    if (j <= Math.sqrt(i) && (j + 1) > Math.sqrt(i))
                        //System.out.println("iIIIII = " + i);
                        al.add(0);
                }
            }
            return i-1;

        }
    }
    public int nthUglyNumber2(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        int p2 = 1, p3 = 1, p5 = 1;
        for (int i = 2; i <= n; i++) {
            int num2 = dp[p2] * 2, num3 = dp[p3] * 3, num5 = dp[p5] * 5;
            dp[i] = Math.min(Math.min(num2, num3), num5);
            if (dp[i] == num2) {
                p2++;
            }
            if (dp[i] == num3) {
                p3++;
            }
            if (dp[i] == num5) {
                p5++;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println("nthUglyNumber(10) = " + nthUglyNumber(11));
    }
}
