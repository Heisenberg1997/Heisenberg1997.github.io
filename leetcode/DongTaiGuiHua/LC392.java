package DongTaiGuiHua;

/**
 * 从后往前枚举
 * 相当于构建了一个地图 地图中一共26列 m行 第m行第1列的数表示A出现在t串 m-1 之后的哪个位置
 */
public class LC392 {
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();

        int[][] f = new int[m + 1][26];
        for (int i = 0; i < 26; i++) {
            f[m][i] = m;
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (t.charAt(i) == j + 'a')
                    f[i][j] = i;
                else
                    f[i][j] = f[i + 1][j];
            }
        }

        int add = 0;
        for (int i = 0; i < n; i++) {
            if (f[add][s.charAt(i) - 'a'] == m) {
                return false;
            }
            add = f[add][s.charAt(i) - 'a'] + 1;
        }
        return true;
    }
    public boolean isS(String s,String t){
        int slen = s.length();
        int tlen=t.length();
        int[][] dp = new int[tlen+1][26];
        for (int i =0;i<26;i++){
            dp[tlen][i]=tlen;
        }

        for (int i = tlen-1;i>=0;i--){
            for (int j=0;j<26;j++){
                if (t.charAt(i)==j+'a')
                    dp[i][j]=i;
                else {
                    dp[i][j]=dp[i+1][j];
                }
            }
        }

        int index=0;
        for (int i=0;i<slen;i++){
            if (dp[index][s.charAt(i)-'a']==tlen){
                return false;
            }
            else{
                index = dp[index][s.charAt(i)+'a']+1;
            }
        }
        return true;
    }

}
