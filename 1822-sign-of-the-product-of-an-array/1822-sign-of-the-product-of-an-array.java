class Solution {
    public int arraySign(int[] nums) {
        int pos=0,neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)
                neg += 1;
            else if(nums[i]==0)
                return 0;
        }
        if(neg%2==0)
            return 1;
        return -1;
    }
}