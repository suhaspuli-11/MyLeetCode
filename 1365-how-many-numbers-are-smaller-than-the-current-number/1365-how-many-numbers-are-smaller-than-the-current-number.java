class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        for(int val:nums)
            temp.add(val);
        int [] ans = new int[nums.length];
        Collections.sort(temp);
        for(int i=0;i<nums.length;i++)
            ans[i]=temp.indexOf(nums[i]);
        return ans;
    }
}