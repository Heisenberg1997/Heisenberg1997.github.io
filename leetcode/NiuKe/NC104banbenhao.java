package NiuKe;
import java.util.*;

/**
 * 比较版本号大小，直接对string进行split得到结果进行比较
 */
public class NC104banbenhao {
    public int compare (String version1, String version2) {
        // write code here
        String[] str1=version1.split("\\.");
        String[] str2=version2.split("\\.");
        int i=0;
        for(;i<Math.min(str1.length,str2.length);i++){
            if(Integer.parseInt(str1[i])==Integer.parseInt(str2[i])) continue;
            return Integer.parseInt(str1[i])>Integer.parseInt(str2[i])?1:-1;
        }
        while(i<str1.length){
            if(Integer.parseInt(str1[i])>0) return 1;
            i++;
        }
        while(i<str2.length){
            if(Integer.parseInt(str2[i])>0) return -1;
            i++;
        }
        return 0;
    }

    public int compare1(String str1,String str2){
        String[] str1s=str1.split("\\.");
        String[] str2s=str2.split("\\.");
        int i=0;
        for (;i<Math.min(str1s.length,str2s.length);i++){
            if (Integer.parseInt(str1s[i])>Integer.parseInt(str2s[i])) return 1;
            else if(Integer.parseInt(str1s[i])<Integer.parseInt(str2s[i])) return -1;
        }
        while(i< str1s.length){
            if (Integer.parseInt(str1s[i]) >0){
                return 1;
            }
            i++;
        }
        while(i< str2s.length){
            if (Integer.parseInt(str2s[i]) >0){
                return -1;
            }
            i++;
        }
        return 0;

    }
}
