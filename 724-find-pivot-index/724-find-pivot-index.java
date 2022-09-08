class Solution {
    public int pivotIndex(int[] nums) {
        int l=0,s=0,size=nums.length;
        for(int i=0;i<size;i++)
            s+=nums[i];
        for(int i=0;i<size;i++){
            if(2*l==s-nums[i])
                return i;
            l+=nums[i];
        }
        return -1;
    }
}