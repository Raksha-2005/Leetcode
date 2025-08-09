class Solution {
    public String reverseWords(String s) {
        String[] a = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        int n=a.length;
        for(int i=n-1;i>=0;i--){
            res.append(a[i]);
            if(i!=0){
                res.append(" ");
            }
        }
        
        return res.toString().trim();
    }
}