package Exo2;

// BalancedBrackets.java
import java.util.Stack;

public class VerifiedString {

    public static boolean StringBalancer(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            // on stock le caractère ouvrant, et on ajout dans le stack (pile)
            if (c == '(' || c == '<' || c == '[') {
                stack.push(c);
                // on fait parreil mais pour les caractère fermante
            } else if (c == ')' || c == '>' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                // Si le caractère fermant ne correspond pas au caractère ouvrant correspondant,
                if ((c == ')' && top != '(') || (c == '>' && top != '<') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
