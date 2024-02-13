public class DifferenceBetweenElementSumandDigitSumofanArray {
    public static int differenceOfSum(int[] nums) {
        int element_sum = 0;
        int digit_sum = 0;

        for( int i:nums ){
            element_sum += i;
            digit_sum += i<10?i:sum(i);
        }
        return Math.abs(element_sum-digit_sum);
    }

    public static int sum(int i){
        int s = 0;
        while( i>0 ){
            int rem = i%10;
            s += rem;
            i /= 10;
        }
        return s;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(differenceOfSum(nums));
    }
}
