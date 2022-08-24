class Solution {
    public int hammingDistance(int x, int y) {
        int n=x^y,cnt=0;
        //System.out.println(Integer.toBinaryString(n));
        while(n>0){
            n &= (n-1);
            cnt++;
        }
        return cnt;
    }
}