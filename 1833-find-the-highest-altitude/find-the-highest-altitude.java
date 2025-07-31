class Solution {
    public int largestAltitude(int[] gain) {
        int cur=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            cur=cur+gain[i];
            max=Math.max(cur,max);
        }
        return max;
        
    }
}