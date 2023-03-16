import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String a = "AABBCCdEEf";
        System.out.println("Caractères non répétés : " + OccurenceCaracter(a));
    }

    public static String OccurenceCaracter(String a) {
        Map<Character, Integer> caracterCountMap = new HashMap<>();

        // Nous comptons les occurrences de chaque caractère a l'entrer
        for (char c : a.toCharArray()) {
            caracterCountMap.put(c, caracterCountMap.getOrDefault(c, 0) + 1);
        }

        // Nous construisons la chaîne de caractères non répétés
        StringBuilder Caracterenonrepeter = new StringBuilder();
        for (char c : a.toCharArray()) {
            if (caracterCountMap.get(c) == 1) {
                Caracterenonrepeter.append(c);
            }
        }

        return Caracterenonrepeter.toString();
    }
}
