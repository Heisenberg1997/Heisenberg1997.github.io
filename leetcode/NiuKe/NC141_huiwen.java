package NiuKe;

public class NC141_huiwen {
    public static void main(String[] args) {
        System.out.println("args = " + judge("adsa"));
    }
    public static boolean judge (String str) {
        // write code here
        for (int i = 0; i < (str.length()+1)/2; i++) {
            int start =str.charAt(i);
            int end = str.charAt(str.length()-1-i);
            if (start!=end)
                return false;
        }
        return true;

    }
}
