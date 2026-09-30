class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int x = 0,i=0;
        Stack<Character> s = new Stack<>();
        int[] result = new int[seq.length()];
        for(char ch : seq.toCharArray()){
            if(ch == '('){
                s.push(ch);
                if(s.size()%2 != 0 && i<result.length){
                    result[i] = 0; 
                }
                else{
                    result[i] =1;
                }
            }
            else if (ch == ')' && i<result.length){
                s.pop();
                if(s.size()%2 != 0 && i<result.length){
                    result[i] = 1; 
                }
                else{
                    result[i] =0;
                }
            }
            i++;
        }
        return result;
    }
}