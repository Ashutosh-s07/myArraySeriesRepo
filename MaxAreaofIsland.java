public class MaxAreaofIsland {
    public static int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        int maxArea = 0;
        for( int i=0;i<grid.length;i++){
            for( int j=0;j<grid[0].length;j++){
                if( grid[i][j]==1 )  area = findArea( grid,i,j);
                maxArea = Math.max(maxArea,area);
            }
        }
        return maxArea;
    }

    public static int findArea( int[][] grid, int row, int col ){
        int area = 1;
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};
        grid[row][col] = -1;

        for (int i = 0; i < 4; i++) {
            int newRow=row+drow[i];
            int newCol=col+dcol[i];
            if (newRow >= 0 && newRow < grid.length && newCol >= 0 &&
                newCol < grid[0].length && grid[newRow][newCol] == 1) {
                area += findArea(grid, newRow, newCol);
            }
        }
        return area;
    }
    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};

        System.out.println(maxAreaOfIsland(grid));
    }
}
