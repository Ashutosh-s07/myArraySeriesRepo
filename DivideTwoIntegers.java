public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {

        if( dividend<=Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        long quotient = 0;
        quotient = dividend/divisor;
        if( quotient>Integer.MAX_VALUE) return Integer.MAX_VALUE; 
        else if( quotient<Integer.MIN_VALUE) return Integer.MIN_VALUE; 
        return (int)quotient;
    }
    public static void main(String[] args) {
        int dividend = -2147483648, divisor = -1;
        System.out.println(divide(dividend, divisor));   
    }
}
