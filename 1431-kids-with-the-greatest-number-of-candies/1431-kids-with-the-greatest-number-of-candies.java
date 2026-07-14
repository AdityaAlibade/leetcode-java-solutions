class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] copy = candies.clone();
        List<Boolean> result = new ArrayList<>();
        boolean flag;

        for (int i=0 ; i<copy.length ; i++){
            copy[i] += extraCandies ;
        }

        for (int i=0 ; i<copy.length ; i++){
            flag = true ;
            for (int j=0 ; j<candies.length ; j++){
                if ( copy[i] < candies[j]){
                    flag = false ;
                    break;
                }
            }
            result.add(flag);
        }
        return result ;
    }
}