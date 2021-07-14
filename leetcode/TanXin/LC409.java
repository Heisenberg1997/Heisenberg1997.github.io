package TanXin;

public class LC409 {
    public int longestPalindrome(String s) {
        char[] dp = new char[128];
        int maxnum = 0;
        for (int i=0;i<s.length();i++){
            dp[s.charAt(i)-'A']++;
        }
        for (int i=0;i<dp.length;i++){
            maxnum += dp[i]/2*2;
            if (dp[i]%2==1 && maxnum%2==0){
                maxnum++;
            }
        }
        return maxnum;
    }
}
