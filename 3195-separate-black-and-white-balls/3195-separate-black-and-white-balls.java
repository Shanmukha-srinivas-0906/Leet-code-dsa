class Solution {
    public long minimumSteps(String s) {
        int white = 0;
        long total = 0;
        for(int current = 0;current<s.length();current++){
            if(s.charAt(current)=='0'){
                total += current - white;
                white++;
            }
        }
        return total;

    }
}