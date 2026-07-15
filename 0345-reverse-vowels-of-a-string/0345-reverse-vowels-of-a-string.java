import java.util.*;

class Solution {
    public String reverseVowels(String s) {

        String[] str = s.split("");
        ArrayList<String> vowels = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("A") || str[i].equals("E") || str[i].equals("I") ||
                str[i].equals("O") || str[i].equals("U") ||
                str[i].equals("a") || str[i].equals("e") || str[i].equals("i") ||
                str[i].equals("o") || str[i].equals("u")) {

                vowels.add(str[i]);
            }
        }

        Collections.reverse(vowels);

        int j = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("A") || str[i].equals("E") || str[i].equals("I") ||
                str[i].equals("O") || str[i].equals("U") ||
                str[i].equals("a") || str[i].equals("e") || str[i].equals("i") ||
                str[i].equals("o") || str[i].equals("u")) {

                str[i] = vowels.get(j++);
            }
        }

        String result = "";
        for (int i = 0; i < str.length; i++) {
            result += str[i];
        }

        return result;
    }
}