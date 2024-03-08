package Day_6;

import java.util.Stack;

public class Reverse_String2 {
    public static void main(String[] args) {
        String s = "Hello.World.Hey.This";
        String s2 = "";
        Stack<String> stack = new Stack<String>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '.') {
                s2 += s.charAt(i);
            } else {
                stack.push(s2);
                stack.push(".");
                s2 = "";
            }
        }
        stack.push(s2);
        s2 = "";

        while (!stack.isEmpty()) {
            s2 += stack.pop();
        }

        System.out.println(s2);
    }
}
