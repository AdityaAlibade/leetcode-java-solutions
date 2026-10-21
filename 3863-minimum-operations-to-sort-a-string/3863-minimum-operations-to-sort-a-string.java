class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean sorted = true;
        int min_c = s.charAt(0), max_c = s.charAt(0);
        for(int i =0; i<n ; i++){
            char c = s.charAt(i);
            if(c < min_c)min_c = c;
            if(c > max_c)max_c = c;
            if(i>0 && s.charAt(i-1)>c) sorted = false;
        }
        if(sorted) return 0;
        if(n == 2) return -1;
        if(s.charAt(0) == min_c || s.charAt(n-1) == max_c) return 1;
        for(int i = 1 ; i < n-1 ; i++){
            if(s.charAt(i)==min_c || s.charAt(i)==max_c) return 2;
        }
        return 3;
    }
}
