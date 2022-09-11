class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        int i=0,n=nums.length;
        for(i=0;i<n;i++){
            if(set.contains(target-nums[i]))break;
            else
                set.add(nums[i]);
        }
        ans[0]=i;
        for(i=0;i<n;i++)
            if(nums[i]==target-nums[ans[0]]&&ans[0]!=i)break;
        ans[1]=i;
        return ans;
    }
}