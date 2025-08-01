class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str.append(ch);

            }
        }
        String str1=str.toString();
        String rev=str.reverse().toString();
        return str1.equals(rev);

        
    }
}