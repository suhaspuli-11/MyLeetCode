class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0;
        for(i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i]))
                break;
            else
                map.put(nums[i],i);
        }
        int [] ans = {i,map.get(target-nums[i])};
        return ans;
    }
}