class Solution {
    public int[] plusOne(int[] digits) {
        // String number = Arrays.stream(digits).mapToObj(String::valueOf).collect(Collectors.joining());
        // int[] res = String.valueOf(new BigInteger(number)+1).chars().map(c -> c - '0').toArray();
        // return res;
        for(int i = digits.length-1; i>=0;i--){
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int[digits.length + 1];
        digits[0]=1;
        return digits;
    }
}