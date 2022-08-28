class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink=0,emp=0;
        while(emp>numExchange||numBottles>0){
            drink+=numBottles;
            emp+=numBottles;
            numBottles=0;
            numBottles += emp/numExchange;
            emp%=numExchange;
        }
        return drink;
    }
}