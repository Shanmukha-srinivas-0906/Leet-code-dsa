class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        for(int i =0 ;i<n;i++){
            int minNum = nums[i];
            int maxNum = nums[i];
            for(int j=0;j<i;j++){
                maxNum = Math.max(maxNum,nums[j]);
            }
            for(int j=i;j<n;j++){
                minNum = Math.min(minNum,nums[j]);
            }
            if((maxNum - minNum) <= k){
                return i;
            }
        }
         return -1;
    }
}