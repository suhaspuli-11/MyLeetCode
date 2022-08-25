class Solution {
    public int maximum69Number (int num) {
        int[] arr=new int[4];
        int temp=num,ans=0,i=3;
        while(temp>0){
            arr[i--]=temp%10;
            temp/=10;
        }
        for(i=0;i<4;i++){
            if(arr[i]==6){
                arr[i]=9;
                break;
            }
        }
        for(i=0;i<4;i++)
            ans = ans*10+arr[i];
        return ans;
    }
}