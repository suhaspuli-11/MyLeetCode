class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        TreeSet<Integer> ts=new TreeSet<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
                ts.add(nums[i]);
        }
        if(ts.size()<3)
            return nums[nums.length-1];
        int count=1;
        int thirdMax=0;
        for(int i:ts)
        {
            if(count==3)
            {
                thirdMax=i;
                break;
            }
            else
                count++;
        }
        return thirdMax;
    }
}