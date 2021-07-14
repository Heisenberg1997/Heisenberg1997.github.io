package NiuKe;

/**
 * 反转字符串
 */
public class NC103fanzhuanzifuchuan {
    public static void main(String[] args) {
        System.out.println("solve(\"asdfgh\") = " + solve2("asdfgh"));
    }

    /**
     * 使用stringbuilder中的reverse方法
     * @param str
     * @return
     */
    public static  String solve (String str) {
        // write code here
        StringBuilder strB=  new StringBuilder(str);
        strB.reverse();
        String aa = strB.toString();
        return aa;
    }
    /**
     * 使用循环
     */
    public static String solve2(String str){
        int length = str.length();
        String res="" ;
        for (int i = length-1; i >= 0; i--) {
            res=res+str.charAt(i);

        }
        return  res;
    }


}
