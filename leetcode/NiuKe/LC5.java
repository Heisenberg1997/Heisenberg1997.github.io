package NiuKe;

/**
 * 动态规划法
 * 中心扩散法
 */
public class LC5 {
    public static void main(String[] args) {
        System.out.println("longestPalindrome(\"asdffds\") = " + longestPalindrome("aba"));
    }
    public static String longestPalindrome(String s) {
        if (s.length()<=1) return s;
        //中心扩散法
        int index=0;
        int maxnum = 0;
        String maxstr="";
        for (;index<s.length();){
            int left = index;
            int right = index;
            while((right<s.length()-1) &&(s.charAt(right)==s.charAt(right+1))){
                right++;
            }
            index=right+1;
            while ((right<s.length()-1) &&(left>0) &&(s.charAt(right+1))==(s.charAt(left-1))) {
                right++;
                left--;
            }
            if(maxnum<right-left+1){
                maxnum = right-left+1;
                maxstr=s.substring(left,right+1);
            }
        }
        System.out.println("maxnum = " + maxnum);
        return maxstr;

    }
}
