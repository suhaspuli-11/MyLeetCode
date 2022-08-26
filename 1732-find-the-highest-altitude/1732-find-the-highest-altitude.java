class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length,max=-105,sum=gain[0];
        for(int i=1;i<n;i++){
            gain[i]+=sum;
            sum=gain[i];
        }
        for(int i=0;i<n;i++)
            max=Math.max(max,gain[i]);
        return Math.max(max,0);
    }
}