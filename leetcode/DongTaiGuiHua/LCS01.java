package DongTaiGuiHua;


class LCS01 {
    public int maxSubArray(int[] nums) {
        int maxnum = nums[0];
        int former=nums[0];
        int cur = nums[0];
        for (int i=1;i<nums.length;i++){
            cur=nums[i];
            if (former>0) cur=cur+former;
            if (maxnum<cur) maxnum=cur;
            former = cur;
        }
        return maxnum;
    }
}
