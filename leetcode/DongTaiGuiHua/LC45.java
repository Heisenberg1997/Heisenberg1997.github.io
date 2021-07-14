package DongTaiGuiHua;

class LC45 {
    public int jump(int[] nums) {
        if(nums.length == 1) return 1;  // 一个格子跳啥了还
        int[] step = new int[nums.length], dp = new int[nums.length];
        step[1] = nums[0];  // 第一步可以达到的最大位置，前面已经保证至少 2 格
        for(int i = 1; i < nums.length; ++i) {
            dp[i] = step[dp[i-1]] >= i ? dp[i-1] : dp[i-1]+1;
            // 假如前一个格子所花的步数能达到的最大位置 >= 当前位置，即前一个步数也可以到当前位置
            // 不能到达。不能到达就再走一步！
            if(dp[i]+1 < nums.length)  // 步数可能溢出，但是溢出的数据是没有意义的（一定可以在 n-1 步到达终点）
                step[dp[i]+1] = Math.max(step[dp[i]+1], i+nums[i]);
            // 这里计算的是从当前格子在走一步所能到达的最大距离
            // 假如超过之前存储的最大步数，则更新
        }
        return dp[nums.length-1];
    }
}
