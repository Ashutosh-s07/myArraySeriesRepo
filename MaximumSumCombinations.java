import java.util.*;
import java.util.PriorityQueue;

public class MaximumSumCombinations {
public static int[] solve(int[] A, int[] B, int C) {
    Arrays.sort(A);
    reverse(A);
    Arrays.sort(B);
    reverse(B);

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for (int a : A) {
        for (int b : B) {
            int num = a + b;
            System.out.println(pq);
            if (pq.size() < C)     pq.add(num);
            else if (num > pq.peek())     pq.add(num);
            else     break;
            if (pq.size() > C)     pq.poll();
        }
    }

    int[] res = new int[C];
    for (int i = C - 1; i >= 0; i--)     res[i] = pq.poll();
    return res;
}

    // Method to reverse the given array
private static void reverse(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
    public static void main(String[] args) {
        int[]  A = {1, 4, 2, 3}, B = {2, 5, 1, 6};
        int C = 4;
        System.out.println(Arrays.toString(solve(A, B, C)));
    }
}
