class Solution {
    public int xorOperation(int n, int start) {
        int max=start;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int y=start+2*i;
            arr[i]=y;
        }
        int a=arr[0];
        for(int i=1;i<n;i++){
           a^=arr[i];
        }
        return a;
    }
}