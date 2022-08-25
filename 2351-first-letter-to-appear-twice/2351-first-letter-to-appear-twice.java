class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        int l=s.length();
        for(int i=0;i<l;i++){
            if(set.contains(s.charAt(i))) return s.charAt(i);
            set.add(s.charAt(i));
        }
        return s.charAt(0);
    }
}