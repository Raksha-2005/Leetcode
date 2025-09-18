class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==1&&nums[0]==1){
            return 0;
        }
        for(int i=0;i<n-1;i++){
            if(nums[i+1]-nums[i]==1){
                continue;
            }
            else{
                return i+1;
            }
        }
        if(nums[n-1]==n){
            return 0;
        }
        else{
            return n;
        }
        
        
    }
}