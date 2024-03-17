import java.util.Arrays;

public class MaximizeHappinessofSelectedChildren {
    public static long maximumHappinessSum(int[] happiness, int k) {
        long result = 0, ne = 1;
        // Arrays.sort(happiness);
        int ind = happiness.length-1;
        for (int i=0;i<k;i++ ) {
            if( happiness[ind]>0 ) {
                result += happiness[ind];
                System.out.println(result);
            }
            if( ind> 0 && happiness[ind-1]>0 ){
                happiness[ind-1] -= ne;
                ne -= -1;
                System.out.println(Arrays.toString(happiness));
            }
            ind--;
        }
        return result;

    }
    public static void main(String[] args) {
        // int[] happiness = {1,2,3};
        // int[] happiness = {1,1,1,1};
        // int[] happiness = {2,3,4,5};
        int[] happiness = {2,83,62};
        int k = 3;
        System.out.println(maximumHappinessSum(happiness, k));

    }
}
