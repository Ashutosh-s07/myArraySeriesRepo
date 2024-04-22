import java.util.ArrayList;
import java.util.Arrays;

public class RestoretheArrayFromAdjacentPairs {
    public static int[] restoreArray(int[][] adjacentPairs) {
        ArrayList<Integer> alist = new ArrayList<>();
        for( int i=0;i<adjacentPairs.length;i++){
            for(int j=0;j<adjacentPairs[0].length;j++){
                if(!alist.contains(adjacentPairs[i][j])) alist.add(adjacentPairs[i][j]);
            }
        }
        // System.out.println(alist);
        int[] result = new int[alist.size()];
        for (int i = 0; i < alist.size(); i++)    result[i] = alist.get(i);
        return result;
    }
    public static void main(String[] args) {
        int[][] adjacentPairs = {{100000,-100000}};
        System.out.println(Arrays.toString(restoreArray(adjacentPairs)));
        
    }
}
