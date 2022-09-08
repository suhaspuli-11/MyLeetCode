class Solution {
    public int findNumbers(int[] nums) {
        int cnt=0;
        for(int val:nums){
            String s=Integer.toString(val);
            if(s.length()%2==0)cnt+=1;
        }
        return cnt;
    }
}