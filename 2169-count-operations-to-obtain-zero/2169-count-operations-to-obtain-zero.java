class Solution {
    public int countOperations(int num1, int num2) {
        int count=0;
        while(num1>0&&num2>0){
            count += num1/num2;
            int temp = num1;
            num1 = num2;
            num2 = temp%num2;
        }
        return count;
    }
}