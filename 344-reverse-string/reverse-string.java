class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        for(int a=0;a<s.length;a++){
            while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
            }
        }
        
    }
}