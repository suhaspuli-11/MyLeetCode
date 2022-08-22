class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum,lo=0,hi=numbers.length-1;
        while(lo<hi){
            sum=numbers[lo]+numbers[hi];
            if(sum<target)
                lo++;
            else if(sum>target)
                hi--;
            else
                break;
        }
        int [] ans = {lo+1,hi+1};
        return ans;
    }
}