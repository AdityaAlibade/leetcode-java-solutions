class Solution {
    public int totalNumbers(int[] digits) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < digits.length; i++) {
            if (map.containsKey(digits[i])) {
                map.put(digits[i], map.get(digits[i]) + 1);
            } else {
                map.put(digits[i], 1);
            }
        }

        int count = 0;
        for (int k = 0; k <= 8; k += 2) {
            if (!map.containsKey(k)) {
                continue;
            }
            map.put(k, map.get(k) - 1);
            for (int i = 1; i <= 9; i++) {
                if (!map.containsKey(i) || map.get(i) == 0) {
                    continue;
                }
                map.put(i, map.get(i) - 1);
                for (int j = 0; j <= 9; j++) {
                    if (map.containsKey(j) && map.get(j) > 0) {
                        count++;
                    }
                }
                map.put(i, map.get(i) + 1);
            }
            map.put(k, map.get(k) + 1);
        }
        return count;
    }
}