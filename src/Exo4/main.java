package Exo4;

import java.util.HashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        String a = "hello world";
        System.out.println("Caractères répétés : " + OccurenceCaracter(a));
    }

    public static Map<Character, Integer> OccurenceCaracter(String a) {
        Map<Character, Integer> characterCount = new HashMap<>();

        for (char c : a.toCharArray()) {
            if (characterCount.containsKey(c)) {
                characterCount.put(c, characterCount.get(c) + 1);
            } else {
                characterCount.put(c, 1);
            }
        }

        Map<Character, Integer> caractererepeter = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            if (entry.getValue() > 1) {
                caractererepeter.put(entry.getKey(), entry.getValue());
            }
        }

        return caractererepeter;
    }
}
