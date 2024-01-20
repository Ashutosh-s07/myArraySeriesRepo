import java.util.ArrayList;
import java.util.*;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> res = new ArrayList<>();
        if(intervals.length == 0 || intervals == null) return res.toArray(new int[0][]);

        int starti = newInterval[0];
        int endi = newInterval[1];

        int start = intervals[0][0];
        int end = intervals[0][1];
        for( int[] i: intervals){
            if( i[0]<start && i[1]<end ) res.add(new int[]{start,end});
            else if( i[1]>start && i[0]<end ) start = i[0];
            else if( i[1]>start && i[0]==end ) {
                end = i[1];
                res.add(new int[]{ start,end });
            }
            else if( i[1]>start && i[0]>end ) start = i[0];
        }
        res.add(new int[] {start,end});
        return res.toArray(new int[0][1]);

    }
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        int[][] result = insert(intervals,newInterval);
        for( int[] i:result) System.out.println(Arrays.toString(i));


    }
}
