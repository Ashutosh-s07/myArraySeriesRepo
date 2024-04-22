public class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int count = 0;
        for( int i=0;i<grid.length;i++){
            for( int j=0;j<grid[0].length;j++){
                if( grid[i][j] == 1 ) count += countPeri(grid,i,j,count); 
            }
        }
        return count;
    }

    public static int countPeri( int[][] grid, int row, int col, int count ){
        int perimeter = 0;
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int newr = row + drow[i];
            int newc = col + dcol[i];

            if (newr < 0 || newr >= grid.length || newc < 0 || newc >= grid[0].length || grid[newr][newc] == 0) {
                perimeter++;
            }
        }
        return perimeter;
    }
    public static void main(String[] args) {
        // int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int[][] grid = {{1,0}};
        System.out.println(islandPerimeter(grid));
    }
}
