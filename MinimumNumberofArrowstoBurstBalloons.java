import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimumNumberofArrowstoBurstBalloons{
    public static int findMinArrowShots(int[][] points) {
        
        int result = 1;
        Arrays.sort(points,(a,b)->Integer.compare(a[1], b[1]));

        //count the np. of sb_Intervals
        int prevLast = points[0][1];
        for( int i=1;i<points.length;i++){
            if(prevLast<points[i][0]){
                result++;
                prevLast = points[i][1];
            }
        }

        return result;
    }
    public static void main(String[] args) {
        // int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        int[][] points = {{1,2},{3,4},{5,6},{7,8}};
        // int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));
    }
}