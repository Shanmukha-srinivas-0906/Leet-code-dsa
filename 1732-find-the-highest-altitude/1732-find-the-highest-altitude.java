class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int large_sum = 0;
        for (int i : gain){
            sum += i;
            large_sum = Math.max(sum,large_sum);
        }
        return large_sum;
    }
}