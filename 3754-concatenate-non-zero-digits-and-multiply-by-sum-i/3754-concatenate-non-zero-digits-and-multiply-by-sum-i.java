class Solution {
    public long sumAndMultiply(int n) {
        int temp = n;
        long sum = 0;
        long carry = 1;
        long x = 0;
        while(temp > 0){
            if(temp%10 != 0){
                sum += temp%10;
                x += (temp%10) * carry;
                carry *= 10;
            }
            temp = temp/10;
        }
        return sum*x;
    }
}