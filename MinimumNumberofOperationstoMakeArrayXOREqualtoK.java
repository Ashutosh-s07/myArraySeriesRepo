public class MinimumNumberofOperationstoMakeArrayXOREqualtoK {
    public static int minOperations(int[] nums, int k) {
        int xor = 0, oprn = 0;
        for( int a:nums ) xor = xor^a;
        
        while (xor>0 || k>0) {
            if( xor%2 != k%2 ) oprn += 1;
            xor /= 2;
            k /= 2;
        }
        return oprn;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,3,4}; 
        int k = 1;
        System.out.println(minOperations(nums, k));
    }
}
