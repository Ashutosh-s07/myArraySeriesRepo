import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FindthePrefixCommonArrayofTwoArrays {

    public static void findThePrefixCommonArray(int[] A, int[] B) {
        int[] result = new int[A.length];
        int count = 0;
        Queue<Integer> A_que = new LinkedList<>();
        Queue<Integer> B_que = new LinkedList<>();
        A_que.offer(A[0]);
        B_que.offer(B[0]);

        if(A[0]==B[0]) result[0] = 1;
        for( int i=1;i<A.length;i++){
            A_que.offer(A[i]);
            B_que.offer(B[i]);
            count=0;
            for( int s:A_que ){
                if(B_que.contains(s)) count++;
            }
            result[i] = count;
        }
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        int[] A = {2,3,1}, B = {3,1,2};
        // int[] A = {1,3,2,4}, B = {3,1,2,4};
        findThePrefixCommonArray(A, B);
    }
}
