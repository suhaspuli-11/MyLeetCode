class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left, temp = 0; i <= right; i++) {
            for (temp = i; temp > 0; temp /= 10)
                if (temp % 10 == 0 || i % (temp % 10) != 0)
                    break;
            if (temp == 0)
                ans.add(i);
        }
        return ans;
    }
}