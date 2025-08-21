class Solution {
    public boolean canWinNim(int n) {
        int n1=n%4;
        if(n1==0){
            return false;
        }
        else{
            return true;
        }
    }
}