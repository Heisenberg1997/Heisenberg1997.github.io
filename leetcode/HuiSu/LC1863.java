package HuiSu;

class LC1863 {
    int xor = 0;
    int res = 0;
    public int subsetXORSum(int[] nums) {
        dfs(nums, 0);
        return res;
    }
    void dfs(int[] nums, int count){
        if(count == nums.length){
            res += xor;
            return;
        }
        dfs(nums, count+1);
        xor ^= nums[count];
        dfs(nums, count+1);
    }
}
