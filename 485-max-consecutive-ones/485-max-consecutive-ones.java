class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                ans=0;
            else{
                ans += 1;
                if(ans>max)
                    max = ans;
            }
        }
        return max;
    }
}