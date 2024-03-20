package Day_7;

import java.util.Stack;

public class ParanthesisCheck {

    public Boolean openCheck() {
        return true;
    }

    public static void main(String[] args) {
        String s = "[({[([{}])]})}";
        Stack<Character> stack = new Stack<>();
        char ch1 = ' ', ch = ' ';
        boolean flag = false, start = false;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                start = true;
            }
            if (start != true && (ch == ')' || ch == '}' || ch == ']'))
                break;
            if (!stack.empty())
                if (ch == ')' || ch == '}' || ch == ']') {
                    ch1 = stack.pop();
                    // System.out.print(ch + " " + ch1 + " ");
                    if ((ch1 == '(' && ch == ')') || (ch1 == '{' && ch == '}') || (ch1 == '[' && ch == ']')) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
        }
        if (!stack.empty()) {
            flag = false;
        }
        System.out.println(flag);
    }
}
