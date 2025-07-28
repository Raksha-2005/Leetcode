class Solution {
    public boolean isPalindrome(int x) {
          int r=0;
          int s=x; 
          while(x>0){
            r=r*10+x%10;
            x=x/10;
          }
          if(s==r){
            return true;
          }
          else{
            return false;
          }
    }
}