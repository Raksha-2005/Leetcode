class Solution {
    public int compress(char[] chars) {
        int write = 0; 
        int count = 1;  
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
            } else {
                chars[write++] = chars[i];
                if (count > 1) {
                    String num = Integer.toString(count);
                    for (char c : num.toCharArray()) {
                        chars[write++] = c;
                    }
                }
                count = 1; 
            }
        }
        return write;
    }
}
