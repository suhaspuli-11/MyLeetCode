class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            String s = Integer.toString(i);
            char [] ch = s.toCharArray();
            for(int j=0;j<s.length();j++){
                if(ch[j]=='0'||(i%Character.getNumericValue(ch[j])!=0))
                    break;
                if(j==s.length()-1)
                    ans.add(i);
            }
        }
        return ans;
    }
}