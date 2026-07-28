class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (!st.isEmpty()) {
                    result.append('(');
                }
                st.push('(');
            } else {
                st.pop();
                if (!st.isEmpty()) {
                    result.append(')');
                }
            }
        }
        return result.toString();
    }
}