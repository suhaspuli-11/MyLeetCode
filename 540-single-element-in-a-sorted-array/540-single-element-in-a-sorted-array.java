class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length<3)return nums[0];
        int lo=0,hi=nums.length-1,mid=0;
        while(lo<=hi){
            mid=lo+(hi-lo)/2;
            if(mid==0||mid==nums.length-1||(nums[mid-1]!=nums[mid]&&nums[mid]!=nums[mid+1])) break;
            if(mid%2==0){
                if(nums[mid]==nums[mid+1]) lo=mid+2;
                else hi=mid-2;
            }
            else{
                if(nums[mid]==nums[mid-1]) lo=mid+1;
                else hi=mid-1;
            }
        }
        return nums[mid];
    }
}