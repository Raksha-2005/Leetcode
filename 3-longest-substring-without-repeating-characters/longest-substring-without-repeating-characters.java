class Solution {
    public int lengthOfLongestSubstring(String s) {
        		        int n = s.length();
		        int maxLen = 0;
		        int start = 0;  
		        int[] lastIndex = new int[256]; 
		        for (int i = 0; i < 256; i++) {
		            lastIndex[i] = -1;
		        }
		        for (int end = 0; end < n; end++) {
		            char current = s.charAt(end); 
		            if (lastIndex[current] >= start) {
		                start = lastIndex[current] + 1;
		            } 
		            lastIndex[current] = end;
		            int windowLen = end - start + 1;
		            if (windowLen > maxLen) {
		                maxLen = windowLen;
		            }
		        }
		        return maxLen;
        
    }
}