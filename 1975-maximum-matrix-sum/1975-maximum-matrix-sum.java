class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int neg = 0;
        long sum = 0;
        for(int[] row : matrix){
            for(int num : row){
                sum += Math.abs(num);
                if(num < 0){
                    neg++;
                }
                min = Math.min(min,Math.abs(num));
            }
        }
        if(neg %2 != 0){
            sum -= 2*min;
        }
        return sum;
    }
}