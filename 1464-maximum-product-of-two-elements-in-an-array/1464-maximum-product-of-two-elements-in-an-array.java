class Solution {
    public int maxProduct(int[] nums) {
        int bi = 0;
        int secBi = 0;
        for(int n : nums){
            if(n > bi){
                secBi = bi;
                bi = n;
            }
            else{ 
                secBi = Math.max(secBi,n);
            }
        }
        return (bi-1)*(secBi-1);
    }
}