package NiuKe;
//查找最长公共前缀
public class NC55_gonggongqianzui {
    public static void main(String[] args) {
        //longestCommonPrefix();
    }
    public static String longestCommonPrefix (String[] strs) {
        int minlenght=99999;
        String index ="";
        for (String str : strs) {
            if(str.length()<minlenght){
                minlenght=str.length();
                index = str;
            }
        }
        int i;
        loop:for ( i = 0; i < index.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i)!=index.charAt(i))
                    break loop;
            }
        }
        return index.substring(0,i);

    }

}
