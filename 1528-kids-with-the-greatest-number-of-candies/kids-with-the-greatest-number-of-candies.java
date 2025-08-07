class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ob=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            int c=candies[i]+extraCandies;
            if(c>=max){
                ob.add(true);
            }
            else{
                ob.add(false);
            }
        }
        return ob;
        
    }
}