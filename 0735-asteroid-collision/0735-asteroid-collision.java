class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            int current = asteroids[i];
            if (current > 0) {
                s.push(current);
            } else {
                while (!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(current)) {
                    s.pop();
                }
                if (s.isEmpty() || s.peek() < 0) {
                    s.push(current);
                } else if (s.peek() == Math.abs(current)) {
                    s.pop();
                }
            }
        }
        int[] result = new int[s.size()];
        for (int i = 0; i < s.size(); i++) {
            result[i] = s.get(i);
        }
        return result;
    }
}