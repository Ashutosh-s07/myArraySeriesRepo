public class MinimumAdditiontoMakeIntegerBeautiful {

    public static long makeIntegerBeautiful(long n, int target) {
        if( sumnum(n)<= target ) return 0;
        long result = 0;
        while (sumnum(n)>target) {
            long last_bit = n%10==0?0:10-(n%10);
            result = result*10+(last_bit);
            n += last_bit;
            n /= 10;
        }
        return reverse(result);
    }
    public static long sumnum( long n){
        long num = 0;
        while (n>0) {
            long rem = n%10;
            num += rem;
            n /= 10;
        }
        return num;
    }
    public static long reverse( long n){
        long num = 0;
        while (n>0) {
            long rem = n%10;
            num = num*10+rem;
            n /= 10;
        }
        return num;
    }
    public static void main(String[] args) {
        int n = 165, target = 10;
        System.out.println(makeIntegerBeautiful(n, target));
    }
}