class Solution {
    public boolean isPalindrome(int x) {
        // Two pointer method
        String s = Integer.toString(x);
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i += 1;
            j -= 1;
        }
        return true;
    }
}