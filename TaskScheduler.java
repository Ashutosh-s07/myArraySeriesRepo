import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskScheduler {
    public static int leastInterval(char[] tasks, int n) {
        
        Map<Character, Integer> counts = new HashMap();
        for(char t: tasks) 
            counts.put(t, counts.getOrDefault(t, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue(counts.size(), Collections.reverseOrder());
        pq.addAll(counts.values());

        // System.out.println(pq);
        // System.out.println(counts);

        int result = 0;
        while(!pq.isEmpty()){
            int time = 0;
            List<Integer> tmp = new ArrayList();
            for(int i = 0; i < n+1; ++i){
                if(!pq.isEmpty()){
                    tmp.add(pq.remove() - 1);
                    time++;
                }
            }
            for(int t: tmp)
                if(t > 0) pq.add(t);
            result += pq.isEmpty() ? time : n+1;
        }
        return result;
    }
    public static void main(String[] args) {
        char[] tasks = {'A','C','A','B','D','B'}; 
        int n = 2;
        System.out.println(leastInterval(tasks,n));
    }
}
