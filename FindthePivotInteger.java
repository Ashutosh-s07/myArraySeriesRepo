public class FindthePivotInteger {
    public static int pivotInteger(int n) {
        int result = 1;
        int total = n*(n+1)/2;
        for( int i=0;i<n;i++){
            result ++;
            sum += result;
            if( total==result) return result;
            total -= result;
        }
        return -1;

    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(pivotInteger(n));
    }
}
