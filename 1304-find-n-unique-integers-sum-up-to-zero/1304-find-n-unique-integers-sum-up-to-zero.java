class Solution {
    public int[] sumZero(int n) {
        int [] ans = new int[n];
        if(n==1)
            return ans;
        ans[0]=(1-n);
        for(int i=1;i<n;i++)
            ans[i]=ans[i-1]+2;
        return ans;
    }
}