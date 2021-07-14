package DongTaiGuiHua;

public class LC55 {
    public boolean canJump(int[] nums) {
        int maxnum =nums[0];
        for (int i=0;i<nums.length;i++){
            if (maxnum<0)
                return false;
            maxnum = Math.max(maxnum,nums[i]);
            maxnum--;
        }
        return false;
    }
}
