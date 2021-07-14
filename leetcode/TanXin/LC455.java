package TanXin;

import java.util.Arrays;

class LC455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int childnum =g.length;
        int allnum =0;
        int cooknum = s.length;
        int j=0;
        for (int i=0;i<childnum &&j<cooknum;i++){
            while(j<cooknum && g[i]>s[j]){
                j++;
            }
            if (j<cooknum) {
                allnum++;
                j++;
            }
        }
        return allnum;
    }
}
