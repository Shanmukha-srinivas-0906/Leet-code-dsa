class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        double maxDiagonal = 0;
        for(int i = 0;i<dimensions.length;i++){
            double d = Math.sqrt((dimensions[i][0]*dimensions[i][0])+dimensions[i][1]*dimensions[i][1]);
            int area = dimensions[i][0] * dimensions[i][1];
            if(d>maxDiagonal){
                maxDiagonal = d;
                maxArea = area;
            }else if(d==maxDiagonal){
                maxArea = Math.max(area,maxArea);
            }
        }
        return maxArea;
    }
}