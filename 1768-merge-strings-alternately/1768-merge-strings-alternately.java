class Solution {
    public String mergeAlternately(String word1, String word2) {
        String[] str1 = word1.split("");
        String[] str2 = word2.split("");

        int min = Math.min(str1.length,str2.length);
        String result = "";
        
        for(int i=0 ;i< min ;i++){
            result += str1[i];
            result += str2[i];
        } 
        for(int i=min ;i< str1.length ;i++){
            result += str1[i];
        } 
        for(int i=min ;i< str2.length ;i++){
            result += str2[i];
        } 
        return result;
    }
}