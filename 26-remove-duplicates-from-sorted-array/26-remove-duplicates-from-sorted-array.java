class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1,n=nums.length;
        for(i=1;i<n;i++)
            if(nums[i]!=nums[i-1])
                nums[j++]=nums[i];
        return j;
    }
}