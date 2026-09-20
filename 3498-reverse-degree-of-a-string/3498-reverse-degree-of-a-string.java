class Solution {
    public int reverseDegree(String s) {
        String[] str = s.split("");
        int Product = 0; 
        for(int i=0; i<str.length ; i++){
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                Product += (27 - (ch - 'a' + 1)) * (i + 1);
            } 
        }
        return Product;
    }
}