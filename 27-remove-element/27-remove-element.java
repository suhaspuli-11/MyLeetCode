class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=0,n=nums.length;
        for(i=0;i<n;i++)
            if(nums[i]!=val)
                nums[j++]=nums[i];
        return j;
    }
}