

import java.util.ArrayList;
import java.util.*;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> res = new ArrayList<>();
        if(intervals.length == 0 || intervals == null) return new int[][]{newInterval};
        
        List<int[]> duplicate = new ArrayList<>();
        for( int[]ar:intervals ) duplicate.add(ar);
        duplicate.add(newInterval);
        Collections.sort(duplicate,(a,b)->a[0]-b[0]);
        
        int start = duplicate.get(0)[0];
        int end = duplicate.get(0)[1];
        for( int[] i: duplicate){
            if( end>=i[0] ) end = Math.max(end,i[1]);
            else{
                res.add(new int[]{start,end});
                start = i[0];
                end = i[1];
            } 
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
