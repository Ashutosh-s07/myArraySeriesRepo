import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortthePeople {
    public static String[] sortPeople(String[] names, int[] heights) {

        String[] result = new String[names.length];
        HashMap<Integer,String> map = new HashMap<>();

        for( int i=0;i<names.length;i++)
            map.put(heights[i],names[i]);
        
        ArrayList<Integer> sortedKeys = new ArrayList<Integer>(map.keySet());
        Collections.sort(sortedKeys,Collections.reverseOrder());
 
        System.out.println(map);
        System.out.println(sortedKeys);
        int ind = 0;
        for (int i:sortedKeys)
            result[ind++] =  map.get(i);
        
        return result;
    }

    
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"}; 
        int[] heights = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }
}
