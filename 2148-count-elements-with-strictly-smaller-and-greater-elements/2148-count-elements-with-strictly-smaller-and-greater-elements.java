class Solution {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE,minCount=0,maxCount=0;
        for (int i = 0; i < nums.length; ++i) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        for (int i = 0; i < nums.length; ++i) {
            if(nums[i]==min) minCount += 1;
            if(nums[i]==max) maxCount += 1;
        }
        return min == max ? 0 : nums.length - minCount - maxCount;
    }
}