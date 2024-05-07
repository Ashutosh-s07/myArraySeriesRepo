import java.util.*;

public class MaximalScoreAfterApplyingKOperations {

    public static long maxKelements(int[] nums, int k) {
        PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        for( int a:nums ) maxHeap.add((long)a);
        while (k-->0) {
            long num = maxHeap.poll();
            sum += num;
            long to_add = (long)Math.ceil((double)num/3);
            // to_add += (to_add%10)!=0?1:0;
            System.out.println(to_add);
            maxHeap.add(to_add); 
        }
        return sum;
    }
    public static void main(String[] args) {
        // int[] nums = {10,10,10,10,10};
        int[] nums = {1,10,3,3,3};
        int k = 3;
        System.out.println(maxKelements(nums, k));
    }
}
