class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int max = 0;
        for(int i=0;i<m;i++){
            int s = 0;
            for(int j=0;j<n;j++)
                s = s + accounts[i][j];
            max = Math.max(s,max);
        }
        return max;
    }
}