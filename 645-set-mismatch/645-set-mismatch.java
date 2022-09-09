class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] op = new int[2];
        int n=nums.length;
        int [] ar = new int[n];
        for(int i=0;i<n;i++)
            ar[nums[i]-1]+=1;
        for(int i=0;i<n;i++){
            if(ar[i]>1)
                op[0]=i+1;
            if(ar[i]==0)
                op[1]=i+1;
        }
        return op;
    }
}