class Solution {
    Boolean[][] memo;
    public boolean checkValidString(String s) {
        memo = new Boolean[s.length()][s.length()+1];
        return solve(s,0,0);
    }
    public boolean solve(String s,int index,int bal){
        if(bal < 0){
            return false;
        }
        if(index == s.length()){
            return bal == 0;
        }
        if (memo[index][bal] != null) {
            return memo[index][bal];
        }
        char c = s.charAt(index);
        boolean result;
        if ( c == '('){
            return solve(s,index+1,bal+1);
        }
        else if( c == ')'){
            return solve(s,index+1,bal-1);
        }
        else{
            boolean asOpen = solve(s,index+1,bal+1);
            boolean asClose = solve(s,index+1,bal-1);
            boolean asNot = solve(s,index+1,bal);
            result = asOpen||asClose||asNot;
        }
        memo[index][bal] = result;
        return result;
    }
}