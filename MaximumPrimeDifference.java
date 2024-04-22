import java.util.*;

public class MaximumPrimeDifference {

    public static int maximumPrimeDifference(int[] nums) {
    
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                primes.add(i);
            }
        }

        System.out.println(primes);
        // int maxDistance = 0;
        // for (int j = 1; j < primes.size(); j++) {
        //     int distance = primes.get(j) - primes.get(j - 1);
        //     maxDistance = Math.max(maxDistance, distance);
        // }

        return Math.abs(primes.get(0)-primes.get(primes.size()-1));
        
    }
    
    public static void main(String[] args) {
        int[] nums = {4,2,9,5,3};
        System.out.println(maximumPrimeDifference(nums));
    }
    
    // Helper function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
