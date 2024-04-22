import java.util.*;

public class SmallestNumberinInfiniteSet {

    int SMALLEST;
    PriorityQueue<Integer> minHeap;
    public void SmallestInfiniteSet() {
        SMALLEST = 1;
        minHeap = new PriorityQueue<>();
    }
    
    public int popSmallest() {
        if(minHeap.isEmpty()){
            return SMALLEST++;
        }
        return minHeap.poll();
    }
    
    public void addBack(int num) {
        if(num >= SMALLEST || minHeap.contains(num)) {
            return;
        }
        minHeap.add(num);
    }
}
