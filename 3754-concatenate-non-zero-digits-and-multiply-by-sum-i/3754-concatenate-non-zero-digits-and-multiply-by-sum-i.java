class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long carry = 1;
        long x = 0;
        while(n > 0){
            if(n%10 != 0){
                sum += n%10;
                x += (n%10) * carry;
                carry *= 10;
            }
            n = n/10;
        }
        return sum*x;
    }
}