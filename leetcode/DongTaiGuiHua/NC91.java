package DongTaiGuiHua;

/**
 *注意dp[0]=1; 空字符串可以有 11 种解码方法，解码出一个空字符串。同时，由于在大部分语言中，字符串的下标是从 00 而不是 11 开始的，因此在代码的编写过程中，我们需要将所有字符串的下标减去 11，与使用的语言保持一致。
 * 遇到0的情况包括进了19 21 这种情况内部
 */
public class NC91 {
    public static int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0]=1;
        for (int i=1;i<=n;i++){
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }

            if (i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {

        System.out.println("args = " + numDecodings("112031011"));
    }
}


