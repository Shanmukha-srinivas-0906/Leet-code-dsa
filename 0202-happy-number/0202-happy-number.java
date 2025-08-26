class Solution {
    public boolean isHappy(int n) {
        Set<Integer> res = new HashSet<>();
        while(!res.contains(n)){
            res.add(n);
            n = number(n);
            if(n==1) return true;
        }
        return false;
    }

        public int number(int n){
            int ans = 0;
            while(n>0){
                int rem = n%10;
                ans += rem*rem;
                n = n/10;
            }
            return ans;
        }       
    
}