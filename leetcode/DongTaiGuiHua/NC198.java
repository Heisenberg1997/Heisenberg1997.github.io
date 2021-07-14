package DongTaiGuiHua;

/**
 * dp的意思是到每家时所能获得的最大的钱 每家分为偷和不偷两种
 * 如何不报警 在每家只能有一个选择
 */
public class NC198 {
    public static int rob(int[] nums) {
        int hushu = nums.length;
        int[] dp = new int[hushu+1];
        dp[0]=0;
        dp[1]= nums[0];
        for (int i=2;i<=hushu;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }
        return dp[hushu];
    }
    public static int rob2(int[] nums) {
        int[] qiang1 = new int[nums.length-1];
        int[] qiangwei = new int[nums.length-1];
        for (int i=0;i<nums.length-1;i++){
            qiangwei[i] = nums[i];
            System.out.println("nums[i] = " + nums[i]);
        }
        for (int i=1;i<nums.length;i++){
            qiang1[i-1] = nums[i];
            System.out.println("qiang1[i] = " + qiang1[i-1]);
        }
        return Math.max(rob(qiangwei),rob(qiang1));
    }

    public static void main(String[] args) {
        int[] a = {2,3,2};
        System.out.println("a = " + rob2(a));
    }
}
