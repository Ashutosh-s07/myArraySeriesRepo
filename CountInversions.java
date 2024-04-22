import java.util.ArrayList;

public class CountInversions {
    

    public static long numberOfInversions(long[] a, int n) {
        // Count the number of pairs:
        return mergeSort(a, 0, n - 1);
    }


    public static void main(String[] args) {
        long[] a = {52244275, 123047899, 493394237, 922363607, 378906890, 188674257, 222477309, 902683641, 860884025, 339100162};
        int n = 10;
        long cnt = numberOfInversions(a, n);
        System.out.println("The number of inversions are: " + cnt);
    }
}
