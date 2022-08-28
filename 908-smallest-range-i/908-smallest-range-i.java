class Solution {
    public int smallestRangeI(int[] nums, int k) {
        if(nums.length==1) return 0;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min) min=nums[i];
            if(nums[i]>max) max=nums[i];
        }
        if(max-min-2*k<0) return 0;
        return max-min-2*k;
    }
}