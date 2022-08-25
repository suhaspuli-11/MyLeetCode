class Solution {
    public int minBitFlips(int start, int goal) {
        int n=start^goal;
        int cnt=0;
        while(n>0){
            n &= (n-1);
            cnt += 1;
        }
        return cnt;
    }
}