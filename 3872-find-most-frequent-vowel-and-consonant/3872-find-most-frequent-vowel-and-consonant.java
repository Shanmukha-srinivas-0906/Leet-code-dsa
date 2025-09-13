class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        for(char ch:s.toCharArray()){
            if(!freq.containsKey(ch)){
                freq.put(ch,1);
            }
            else{
                freq.replace(ch,freq.get(ch)+1);
            }
        }
        int maxVowelFreq = 0;
        int maxConsFreq = 0;
        for(Map.Entry<Character,Integer> entry:freq.entrySet()){
           char ch =  entry.getKey();
           int value = entry.getValue();
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            maxVowelFreq = Math.max(value,maxVowelFreq);
           }
           else{
            maxConsFreq = Math.max(value,maxConsFreq);
           }
        }
        return maxVowelFreq + maxConsFreq;
    }
}