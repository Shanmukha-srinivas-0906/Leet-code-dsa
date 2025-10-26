class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int x = 1;
        int y=n/7;
        // while(y>0 ){
        //     sum += (7)*(x + 3);
        //     x++;
        //     y--;      
        // }
        while(n>7){
            sum+=7*(x+3);
            x++;
            n-=7;
        }
        // int last = n%7;
        // System.out.println(sum);
        // sum += (last/2)*(2*x+(last-1));
        
        sum +=(int)( (n/2.0)*(2*x+(n-1)));
        return sum;
    }
}