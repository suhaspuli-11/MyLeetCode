class Solution {
    public boolean isPalindrome(int x) {
        String s1 = Integer.toString(x);
        StringBuilder s2 = new StringBuilder(s1).reverse();
        return (s1.equals(s2.toString()));
    }
}