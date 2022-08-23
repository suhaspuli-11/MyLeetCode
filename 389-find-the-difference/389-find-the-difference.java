class Solution {
    public char findTheDifference(String s, String t) {
        int s1=0,s2=0;
        for(int i=0;i<s.length();i++)
            s1 += s.charAt(i);
        System.out.println(s1);
        for(int i=0;i<t.length();i++)
            s2 += t.charAt(i);
        System.out.println(s2);
        int ans=s2-s1;
        return (char)ans;
    }
}