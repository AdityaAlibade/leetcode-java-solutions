class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> str = new Stack<>();
        str.push(-1);
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                str.push(i);
            } 
            else {
                str.pop();
                if (str.empty()) {
                    str.push(i);
                } 
                else {
                    max = Math.max(max, i - str.peek());
                }
            }
        }
        return max;
    }
}