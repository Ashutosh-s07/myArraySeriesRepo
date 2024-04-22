import java.util.*;
public class LargestsubarraywithZerosum {
    public static int maxLen(int arr[], int n){
        int len = 0, sum = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for( int i=0;i<n;i++ ){
            sum += arr[i];
            if( sum == 0 ) len = i+1;
            if( mp.containsKey( sum-0 ))    len= Math.max(len, i-mp.get(sum-0));
            if( !mp.containsKey(sum)) mp.put(sum,i);
        }
        return len;
    }
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10,23};
        int n = 8;
        System.out.println(maxLen(arr, n));
    }
}