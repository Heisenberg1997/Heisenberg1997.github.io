package NiuKe;

/**
 * 在一个字符串中查找子串，注意与最长回文串对比
 * 暴力破解法
 * 动态规划法 主要是dp
 *
 */

/**
 * 算法核心是构造出一个dp数组二维数组 dp = new int[M][256];，数组行数代表者匹配到了第几个阶段（字符串有多少字母就有多少个阶段），列数代表着下一个遇见的是什么，行数列数对应的数子代表着：目前这个状态，遇见下一个字母时，状态转移到哪里
 * 核心是利用历史的信息去解决现在遇见的问题  核心：X = dp[X][pat.charAt(j)]; 用来更新影子状态，构建dp时当字符串无法匹配时，使用这个来判断当前状态
 * 要求pat有多一些的重复字符串，单独的字母少一些
 * 参考文章 https://zhuanlan.zhihu.com/p/83334559
 * 影子状态记录的是除了从这个循环开始的串 他之间的串能到达那个位置
 */



public class NC149kmp {
    private int[][] dp;
    private String pat;

    public NC149kmp(String pat) {
        this.pat = pat;
        int M = pat.length();
        // dp[状态][字符] = 下个状态
        dp = new int[M][256];
        // base case
        dp[0][pat.charAt(0)] = 1;
        // 影子状态 X 初始为 0
        int X = 0;
        for (int j = 1; j < M; j++) {
            for (int c = 0; c < 256; c++)
                dp[j][c] = dp[X][c];
            dp[j][pat.charAt(j)] = j + 1;
            // 更新影子状态
            X = dp[X][pat.charAt(j)];
        }
    }

    public int search(String txt) {
        int M = pat.length();
        int N = txt.length();
        // pat 的初始态为 0
        int j = 0;
        for (int i = 0; i < N; i++) {
            // 计算 pat 的下一个状态
            j = dp[j][txt.charAt(i)];
            // 到达终止态，返回结果
            if (j == M) return i - M + 1;
        }
        // 没到达终止态，匹配失败
        return -1;
    }

    public static void main(String[] args) {


    }
}

