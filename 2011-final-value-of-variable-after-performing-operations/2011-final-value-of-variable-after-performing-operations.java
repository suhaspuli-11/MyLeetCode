class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int inc=0;
        for(int i=0;i<operations.length;i++)
            if(operations[i].equals("++X")||operations[i].equals("X++"))
                inc += 1;
        return 2*inc-operations.length;
    }
}