class Solution {
    public int findMin(int[] nums) {
        int i=0;
        for(i=0;i<nums.length-1;i++)
            if(nums[i]>nums[i+1]) return nums[i+1];
        if(i==nums.length-1)
            return nums[0];
        return nums[i+1];
    }
}