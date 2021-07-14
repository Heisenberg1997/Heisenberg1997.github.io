package NiuKe;

import java.util.Stack;

public class NC52_kuohaoxulie {
    public static void main(String[] args) {

    }
    public static boolean isValid(String s){
        Stack<Character> stacka = new Stack<>();
        for(char a :s.toCharArray()){
            if (a=='(')
                stacka.push(')');
            else if(a=='[')
                stacka.push(']');
            else if(a=='{')
                stacka.push('}');
            else if (stacka.isEmpty() || stacka.pop()!=a)
                return false;
        }
        return stacka.isEmpty();
    }
}
