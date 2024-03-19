import java.math.BigInteger;

public class TrailingZeroesinFactorial {
    public static void main(String[] args) {
        int n = 2147;
        // BigInteger factorial = calculateFactorial(n);
        // System.out.println(factorial);
        System.out.println(calculateFactorial(n));
    }

    public static int calculateFactorial(int n) {
        
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        int count = 0;
        while (result.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            count++;
            result = result.divide(BigInteger.TEN);
        }

        // ----------------------------------------
        // Optimized: O(log(n))

        int sol = 0;
        while (n>0) {
            sol += n/5;
            n /= 5;   
        }
        return sol;

    }
}
