class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row[]=new int[grid.length];
        int col[]=new int[grid[0].length];
        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(grid[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }

     for(int i=0;i<row.length;i++){
       for(int j=0;j<col.length;j++){
         grid[i][j]=row[i]+col[j]-(col.length-row[i])-(row.length-col[j]);
          }
      }
        return grid;
    }
}