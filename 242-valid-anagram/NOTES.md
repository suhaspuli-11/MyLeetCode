**METHOD 1**
​
sort the two strings and check if they are equal
​
**METHOD 2**(wrong approach)
​
1. XORing the characters gives zero
2. fails in case of aa and bb
​
**METHOD 3**(wrong approach)
​
```
int ans1=0,ans2=0;
for(int i=0;i<s.length();i++){
ans1 += s.charAt(i);
ans2 += t.charAt(i);
}
```
1. fails in case of "ac" and "bb"
​
**METHOD 4**
1. Hash map
2. populate the hashmap with s and decrement the count of each character of t
​
**METHOD 5**
1. Also hashmap
2. but 2 hashmaps
3. check if both are same