class Solution {
    public int addDigits(int n) {
        while(Integer.toString(n).length()>1){
            int sum=0,temp=n;
            while(temp>0){
                sum += temp%10;
                temp /= 10;
            }
            n=sum;
        }
        return n;
    }
}