package oil.stone.lv;

/*
 *   力扣20
 *   有效括号
 *   方法: 栈
 *        遍历字符串,
 *        左括号时推入,
 *        右括号时弹出栈顶元素,进行比对
 *   author: Oil
 *   Date: 2020.1.1
 * */


import java.util.Stack;

public class ValidBracket {

    public static boolean isValid(String s) {
        if(s == "")
            return true;
        Stack<Character> leftStack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if( (c == '(' || c == '[' || c == '{')) {
                leftStack.push(c);
                continue;
            }


            if( (c == ')' || c == ']' || c == '}') && leftStack.empty())
                return false;

            if( (c == ')' && leftStack.pop() == '(')  ||
                (c == ']' && leftStack.pop() == '[')  ||
                (c == '}' && leftStack.pop() == '{') )
            {
                continue;
            }
            else
                return false;
        }
        if(leftStack.empty())
            return true;
        else
            return false;


    }

    public static void main(String[] args){
        String test = "()[]{]";
        System.out.println(isValid(test));

    }
}
