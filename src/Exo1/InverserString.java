package Exo1;

import java.util.Stack;

public class InverserString {

    public static String InverserString(String a) {
        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < a.length(); i++) {
            stack.push(a.charAt(i));
        }

        StringBuilder Inverser = new StringBuilder(a.length());
        while (!stack.isEmpty()) {
            Inverser.append(stack.pop());
        }

        return Inverser.toString();
    }
}
