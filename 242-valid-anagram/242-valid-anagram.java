class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        int len = s.length();
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<len;i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)) return false;
            else
                map.put(ch, map.get(ch) - 1);
        }
        for ( Integer value: map.values())
        if ( value != 0) return false;
        return true;
    }
}