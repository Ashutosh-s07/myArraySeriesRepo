import java.util.*;
public class MinimumWeights {

    public static int findMinimumWeights(int[] available_weights,int target){
        
        int result = 0,  n = available_weights.length-1;

        for( int i=n;i>=0;i--){
            while( target>=available_weights[i] ){
                target -= available_weights[i];
                result++;    
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] available_weights = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int target = 93;
        System.out.println(findMinimumWeights(available_weights,target));
    }
}
