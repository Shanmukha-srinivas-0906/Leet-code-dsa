class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0;i<n/2;i++){
            int top = i;
            int bottom = n - i -1;
            for(int j = 0; j<n;j++){
                int temp = matrix[top][j];
                matrix[top][j] = matrix[bottom][j];
                matrix[bottom][j] = temp;
            }
        }
        for(int i =0;i<n;i++){
            for(int j = i+1;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
}