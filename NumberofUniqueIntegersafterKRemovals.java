import java.util.*;
public class NumberofUniqueIntegersafterKRemovals {
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for( int i:arr )
            map.put(i,map.getOrDefault(i,0)+1);
        
      
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue().compareTo(b.getValue()));
        pq.addAll(map.entrySet());
        
        while ( k>0 ) {
            int a = pq.peek().getValue();
            k -= a;
            if( k>=0 ) pq.poll().getValue();
        }
        return pq.size();

    }
    public static void main(String[] args) {
        int[] arr = {4,3,1,1,3,3,2};
        int k = 3;
        System.out.println(findLeastNumOfUniqueInts(arr, k));
    }
}
