import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementinanArray {
    public static int findKthLargest(int[] nums, int k) {
    
        PriorityQueue<Integer> hp = new PriorityQueue<>();
        for( int i=0;i<nums.length;i++ ){
            hp.add(nums[i]);
            if( hp.size() >k ) hp.poll();
        }
        return hp.peek();
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6}; 
        int k = 4;
        System.out.println(findKthLargest(nums,k));
    }
}
