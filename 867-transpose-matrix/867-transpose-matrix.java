class Solution {
    public int[][] transpose(int[][] matrix) {
        int [][] tmatrix = new int[matrix[0].length][matrix.length];
        for(int j=0;j<matrix[0].length;j++)
            for(int i=0;i<matrix.length;i++)
                tmatrix[j][i] = matrix[i][j];
        return tmatrix;
    }
}