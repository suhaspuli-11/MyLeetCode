class Solution {
    public boolean isThree(int n) {
        int count=0;
        if(n<4)
            return false;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                count += 1;
            if(count>2)
                return false;
        }
        count += 1;
        if(count==3)
            return true;
        return false;
    }
}