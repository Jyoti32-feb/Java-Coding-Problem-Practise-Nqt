package string;

public class StringProblem {
    public static void main(String[] args) {

        String str = "jyoti@123";

        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters.append(ch);
            }
            else if (Character.isDigit(ch)) {
                digits.append(ch);
            }
            else {
                special.append(ch);
            }
        }

        System.out.println("Letters : " + letters);
        System.out.println("Digits : " + digits);
        System.out.println("Special : " + special);
    }
}