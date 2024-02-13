import java.util.ArrayList;
import java.util.Arrays;

public class DifferenceBetweenOnesandZerosinRowandColumn {

    public static int[][] onesMinusZeros(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int count_zeroesRow = 0, count_zeroesCol = 0;

        int[][] result = new int[m][n];
        ArrayList<Integer> zeroesRow = new ArrayList<>();
        ArrayList<Integer> zeroesCol = new ArrayList<>();

        for( int i=0;i<m;i++ ){
            count_zeroesRow = 0;
            for( int j=0;j<n;j++ ){
                if( grid[i][j]==0) count_zeroesRow++;                
            }
            zeroesRow.add(count_zeroesRow);
        }
        for( int i=0;i<n;i++ ){
            count_zeroesCol = 0;
            for( int j=0;j<m;j++ ){
                if( grid[j][i]==0) count_zeroesCol++;                
            }
            zeroesCol.add(count_zeroesCol);
        }

        for( int i=0;i<m;i++ ){
            for( int j=0;j<n;j++ ){
                int onesRow0 = m - zeroesRow.get(i);
                int onesCol0 = n - zeroesCol.get(j);
                int zerosRow0 = zeroesRow.get(i);
                int zerosCol0 = zeroesCol.get(j);
                result[i][j] = onesRow0 + onesCol0 - zerosRow0 - zerosCol0;
            }
        }
        return result;
        
    }
    public static void main(String[] args) {
        // int[][] grid = {{0,1,1},{1,0,1},{0,0,1}};
        int[][] grid = {{1,1,1},{1,1,1}};
        int[][] sol = onesMinusZeros(grid);
        for( int[] i:sol ) System.out.println(Arrays.toString(i)); 
    }
    
}