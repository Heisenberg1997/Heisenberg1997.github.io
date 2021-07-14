package NiuKe;

/**
 * N字变换
 */
public class NC6 {
    public String convert(String s, int numRows) {
        int strlen = s.length();
        if (numRows ==1){
            return s;
        }
        if (s.length()<=2){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int contains=2+(numRows-2)*2;
        for (int i = 0; i <numRows ; i++) {
            int index = i;
            int index1 = i;
            int index2 = contains-i;
            if (i==0 || i==numRows-1){
                while(index<s.length()){
                    sb.append(s.charAt(index));
                    index = index+contains;
                }
            }
            else {
                while(index1<s.length() || index2<s.length()){
                    if (index1<s.length())
                        sb.append(s.charAt(index1));
                    if (index2<s.length())
                        sb.append(s.charAt(index2));
                    index1 =index1+contains;
                    index2=index2+contains;
                }
            }
        }
        String str = sb.toString();
        return str;
    }
}
