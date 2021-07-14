package NiuKe;

public class NC17zuichanghuiwen {


    //思路 递归加二分查找
    // 暴力破解法
    // 中心扩散法
    // 动态规划法
    public int getLongestPalindrome(String A, int n) {
        //xunhuan();
        int maxnum =-1;
        for (int i = 0; i < A.length(); i++) {
            for (int j=i+1;j<A.length();j++){
                String str = A.substring(i,j);
                if (judge(str))
                    maxnum=Math.max(str.length(),maxnum);

            }
        }
        return maxnum;
    }

    public int zhongxinkuosanfa(String A,int n){
        if (n<2)
            return n;
        int left=0;
        int right=0;
        int maxnum =-1;
        for (int i = 0; i < n; ) {
            left=i;
            right=i;
            while ((right<n-1) && A.charAt(right)==A.charAt(right+1))
                right++;
            i=right+1;
            while((right<n-1) && (left>0) && (A.charAt(right+1)==A.charAt(left-1))){
                left--;
                right++;
            }
            maxnum = Math.max(maxnum,(right-left+1));

        }
        return maxnum;
    }


    public int zhongxinkuosan(String A, int n) {
        //边界条件判断
        if (n < 2)
            return A.length();
        //maxLen表示最长回文串的长度
        int maxLen = 0;
        for (int i = 0; i < n; ) {
            //如果剩余子串长度小于目前查找到的最长回文子串的长度，直接终止循环
            // （因为即使他是回文子串，也不是最长的，所以直接终止循环，不再判断）
            if (n - i <= maxLen / 2)
                break;
            int left = i;
            int right = i;
            while (right < n - 1 && A.charAt(right + 1) == A.charAt(right))
                ++right; //过滤掉重复的 从重复的元素开始向两面扩展
            //下次在判断的时候从重复的下一个字符开始判断
            i = right + 1;
            //然后往两边判断，找出回文子串的长度
            while (right < n - 1 && left > 0 && A.charAt(right + 1) == A.charAt(left - 1)) {
                ++right;
                --left;
            }
            //保留最长的
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
            }
        }
        //截取回文子串
        return maxLen;
    }

    public int dongtaihuiha(String A,int n){
        //边界条件判断
        if (n < 2)
            return A.length();
        //start表示最长回文串开始的位置，
        //maxLen表示最长回文串的长度
        int maxLen = 1;
        boolean[][] dp = new boolean[n][n];
        for (int right = 1; right < n; right++) {
            for (int left = 0; left < right; left++) {
                //如果两种字符不相同，肯定不能构成回文子串
                if (A.charAt(left) != A.charAt(right))
                    continue;
                //下面是s.charAt(left)和s.charAt(right)两个
                //字符相同情况下的判断
                //如果只有一个字符，肯定是回文子串
                if (right - left <= 2) {
                    //类似于"aa"和"aba"，也是回文子串
                    dp[left][right] = true;
                } else {
                    //类似于"a******a"，要判断他是否是回文子串，只需要
                    //判断"******"是否是回文子串即可
                    dp[left][right] = dp[left + 1][right - 1];
                }
                //如果字符串从left到right是回文子串，只需要保存最长的即可
                if (dp[left][right] && right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                }
            }
        }
        //最长的回文子串
        return maxLen;
    }





    public static int xunhuan(int left,int right,int len,String str,int n){
        for (;right<n;left++,right++){
            boolean ishiuwen = judge(str.substring(left,right+1));
            if (ishiuwen){
                return right-left+1;
            }
        }
        //if ()

        return -1;


    }



    public static boolean judge (String str) {
        // write code here
        for (int i = 0; i < (str.length()+1)/2; i++) {
            int start =str.charAt(i);
            int end = str.charAt(str.length()-1-i);
            if (start!=end)
                return false;
        }
        return true;

    }
}
