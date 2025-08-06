class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        
        if ((str1 + str2).equals(str2 + str1)) {
            int res = gcd(n, m);
            return str1.substring(0, res);
        } else {
            return "";
        }
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
