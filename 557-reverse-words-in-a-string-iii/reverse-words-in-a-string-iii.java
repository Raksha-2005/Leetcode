class Solution {
    public String reverseWords(String s) {
        String s1[]=s.split(" ");
        for(int i=0;i<s1.length;i++){
            StringBuffer sb=new StringBuffer(s1[i]);
            sb.reverse();
            s1[i]=sb.toString();
        }
       return String.join(" ", s1);
    }
}