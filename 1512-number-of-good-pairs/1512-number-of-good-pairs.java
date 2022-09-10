class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans=0;
        for(int val:nums)
            map.put(val,map.getOrDefault(val,0)+1);
        for(int n:map.values())
            if(n>1)
                ans+=(n*(n-1))/2;
        return ans;
    }
}