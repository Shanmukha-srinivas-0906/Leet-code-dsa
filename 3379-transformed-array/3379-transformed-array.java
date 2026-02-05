class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int idx = 0;
        for(int i =0;i<n;i++){
            if(nums[i] > 0){
                idx = (i + nums[i]) % n;
                result[i] = nums[idx];
            }
            else if(nums[i]<0){
                idx = (i + nums[i] % n + n) % n;
                result[i] = nums[idx];
            }
            else{
                result[i] = nums[i];
            }
        }
        return result;

    }
}