import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Day16 {


    public static void main(String[] args) {

        String str="{}()[]";
        boolean flag=isValid(str);
        System.out.println(flag);
    }
    //括号生成--每天刷一道leetcode算法系列！
    /*本题是一个典型的栈的应用。
    首先s的长度必须为偶数，如果为奇数，直接返回false即可。
    记c = s.charAt(i)，如果c为括号的左半边（即c == '(' || c == '[' || c == '{'），
    此时直接入栈即可。此处其实还可以进行下剪枝，那就是stack.size() < s.length() - i。
    因为不满足这个条件的话，右边全是右括号也无法匹配。
    如果c为右半边，栈不为空，且栈顶字符正好和c匹配，
    此时，弹出栈顶元素即可，否则直接返回false。*/

    public static boolean isValid(String s) {
        assert s != null;
        if (s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c == '(' || c == '[' || c == '{') && stack.size() < s.length() - i) {
                stack.push(c);
                continue;
            }
            if (!stack.empty() && c == map.get(stack.pop())) {
                continue;
            }
            return false;
        }
        return stack.empty();
    }

}
