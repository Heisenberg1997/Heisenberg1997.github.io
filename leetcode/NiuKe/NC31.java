package NiuKe;

public class NC31 {
    public static void main(String[] args) {

    }
    public static int FirstNotRepeatingChar(String str) {
        char[] strs = str.toCharArray();
        int index = -1;
        for (int i = 0; i < strs.length; i++) {
            int i1;
            for ( i1= 0; i1 < strs.length; i1++) {
                if (i==i1)
                    continue;
                if (strs[i] ==strs[i1])
                    break;

            }
            if (i1==strs.length)
                return i;

        }
        return -1;

    }

}
