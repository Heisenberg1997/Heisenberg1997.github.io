package NiuKe;

/**
 * 将整数与字母进行转换
 *主要点是columnNumber-- ,因为对应关系是从1开始的 而不是从0开始的，如果A对应1，则--，如果A对应2 则-2
 */

public class LC1044 {
    public String convertToTitle(int columnNumber) {
        StringBuilder sbuild = new StringBuilder();
        while(columnNumber >0){
            columnNumber--;
            sbuild.append((char)('A'+columnNumber%26));
            columnNumber /=26;
        }
        return sbuild.reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(" = "+5/2);
    }
}
