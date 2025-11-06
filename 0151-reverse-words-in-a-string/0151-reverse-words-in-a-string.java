class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String[] words=s.trim().split("\\s+");
        int n = words.length;
        for(int i = 0;i<n;i++){
            ans += words[n-i-1];
            if(i!=n-1) ans += " ";
        } 
        return ans;
    }
}