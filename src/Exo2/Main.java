package Exo2;

// Main.java
public class Main {

    public static void main(String[] args) {
        String a = "{98(3)<5>89}";
        System.out.println("Les parenthèses et accolades sont équilibrées : " + VerifiedString.StringBalancer(a));
    }
}
