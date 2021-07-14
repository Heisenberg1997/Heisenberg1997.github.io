 package DongTaiGuiHua;
import java.util.*;
public class LC22 {

    public List<String> generateParenthesis(int n) {
        LinkedList<LinkedList<String>> res = new LinkedList<>();
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("");
        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("()");
        res.add(ll1);
        res.add(ll2);
        for (int i=2;i<=n;i++){
            LinkedList<String> temp= new LinkedList<>();
            for(int j=0;j<i;j++){
                LinkedList<String> str1 = new LinkedList<>();
                LinkedList<String> str2 = new LinkedList<>();
                str1 = res.get(j);
                str2 = res.get(i-j-1);
                for (String s1 : str1) {
                    for (String s2 : str2) {
                        String ele = "(" + s1 +")" + s2;
                        temp.add(ele);
                    }
                }
            }
            res.add(temp);
        }
        return res.get(n);
    }
}