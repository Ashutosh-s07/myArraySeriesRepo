import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MinimumOperationstoExceedThresholdValueII{
    public static int minOperations(int[] nums, int k) {
        
        PriorityQueue<Long> prq = new PriorityQueue<>();
        for (int num : nums)   {
            long x = num;            
            prq.offer(x);
        }
        int count = 0;
        while (prq.peek() < k) {
            
            if (prq.size() < 2) break;             
            long x = prq.poll();
            long y = prq.poll();
            long sum = (Math.min(x,y)*2)+Math.max(x,y);
            prq.offer(sum);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1000000000,999999999,1000000000,999999999,1000000000,999999999}; 
        // int[] nums = {999999999,999999999,999999999}; 
        int k = 1000000000;
        // int[] nums = {1,1,2,4,9}; 
        System.out.println(minOperations(nums, k));
    }
}