class Solution {
    public int findLucky(int[] arr) {
        int max=-2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==map.get(arr[i]))
                max=Math.max(max,map.get(arr[i]));
        }
        return Math.max(max,-1);
    }
}