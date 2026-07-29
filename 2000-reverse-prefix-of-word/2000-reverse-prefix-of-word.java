class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> s = new Stack<>();
        StringBuilder result = new StringBuilder();
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        for (int i = 0; i <= index; i++) {
            s.push(word.charAt(i));
        }
        while (!s.empty()) {
            result.append(s.pop());
        }
        for (int i = index + 1; i < word.length(); i++) {
            result.append(word.charAt(i));
        }
        return result.toString();
    }
}