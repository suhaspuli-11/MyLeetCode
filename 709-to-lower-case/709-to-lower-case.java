class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(Character.isUpperCase(ch))
                sb.setCharAt(i,(char)(ch^32));
        }
        return sb.toString();
    }
}