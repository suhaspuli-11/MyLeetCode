class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>(n+1);
        for(int i=1;i<=n;i++)
            arr.add(String.valueOf(i));
        for(int i=3;i<=n;i+=3)
            arr.set(i-1,"Fizz");
        for(int i=5;i<=n;i+=5)
            arr.set(i-1,"Buzz");
        for(int i=15;i<=n;i+=15)
            arr.set(i-1,"FizzBuzz");
        return arr;
    }
}