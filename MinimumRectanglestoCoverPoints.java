import java.util.*;

public class MinimumRectanglestoCoverPoints {
    public static int minRectanglesToCoverPoints(int[][] points, int w) {

        long result = 0;
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int st = points[0][0];
        
        for( int[] a:points ){
            if( a[0]-st > w ){
                result++;
                st = a[0];
            }
        }
        return (int)result+1;

    }
    public static void main(String[] args) {
        // int[][] points = {{0,0},{1,1},{2,2},{3,3},{4,4},{5,5},{6,6}}; 
        int[][] points = {{2,3},{1,2}}; 
        int w = 0;
        System.out.println(minRectanglesToCoverPoints(points, w));
    }
}
