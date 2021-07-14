package NiuKe;

import java.util.HashMap;


/**
 * 查找无重复的最长子串  滑动窗口法
 * 长度最小的子数组
 * 最大连续1的个数
 */

class LC3 {
    public int lengthOfLongestSubstring(String s) {
       if (s.length()==0) return 0;
       int maxnum =0;
       int left=0;
       HashMap<Character,Integer> hm = new HashMap<>();
       for (int i=0;i<s.length();i++){
           if (hm.containsKey(s.charAt(i))){
               left=Math.max(left,hm.get(s.charAt(i))+1);
           }
           hm.put(s.charAt(i),i);
           maxnum = Math.max(maxnum,i-left+1);
       }
       return maxnum;

    }


    public int changduzuixia(int s, int[] nums){
        if (nums.length<=0)return 0;
        int right=0;
        int minlength=0;
        int sum = nums[0];
        for (int i =0;i<nums.length;i++){
            while(sum<s){
                if (right+1<nums.length){
                    right++;
                    sum = sum+nums[right];}
                else {
                    break;
                }
            }
            if (sum>s){
                minlength = minlength>(right-i+1)?(right-i+1):minlength;
            }
            sum -=nums[i];

        }
        return minlength;

    }

        public int longestOnes(int[] A, int K) {
            int N = A.length;
            int res = 0;
            int left = 0, right = 0;
            int zeros = 0;
            while (right < N) {
                if (A[right] == 0)
                    zeros ++;
                while (zeros > K) {
                    if (A[left++] == 0)//移动直接跳过了0 移动到了下一个位置
                        zeros --;
                }
                res = Math.max(res, right - left + 1);
                right ++;
            }
            return res;
        }
}

