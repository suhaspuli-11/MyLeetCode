class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length()-1,i=0;
        while(n>-1){
            if(s.charAt(n--)!=' ') i+=1;
            else
                if(i>0) return i;
        }
        return i;
    }
}