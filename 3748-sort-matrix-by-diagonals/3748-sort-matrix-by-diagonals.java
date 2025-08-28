class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for(int i = 0;i<n;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; i+j < n;j++){
                temp.add(grid[i+j][j]);
            }
            temp.sort(Collections.reverseOrder());
            for(int j = 0; i+j<n;j++){
                grid[i+j][j] = temp.get(j);
            }
        }
        for(int j = 1;j<n;j++){
            List<Integer> temp = new ArrayList<>();
            for(int i = 0;j+i<n;i++){
                temp.add(grid[i][j+i]);
            }
            Collections.sort(temp);
            for(int i = 0;j+i<n;i++){
                grid[i][j+i] = temp.get(i);
            }
        }
        return grid;
    }
}