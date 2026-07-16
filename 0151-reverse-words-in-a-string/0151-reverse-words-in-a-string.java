class Solution {
    public String reverseWords(String s) {
        String[] word = s.split("\\s+");
        String[] reverse = new String[word.length];
        String result = "";

        for ( int i = 0 ; i < word.length ; i++){
            reverse[i] = word[word.length - 1 - i];
        }
        for ( int i = 0 ; i < reverse.length ; i++){
            result += reverse[i];
            if ( i != reverse.length-1 ){
                result += " ";
            }
        }
        return result.trim();
    }  
}