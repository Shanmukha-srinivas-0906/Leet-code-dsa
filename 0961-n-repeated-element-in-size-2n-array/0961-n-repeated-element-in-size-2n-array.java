class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int x : nums){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        for(int k : freq.keySet()){
            if(freq.get(k) > 1){
                return k;
            }
        }
        throw null;
    
    }
}