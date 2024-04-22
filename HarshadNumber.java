public class HarshadNumber {
    
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0, original = x;
        while (x>0) {
            int rem = x%10;
            sum += rem;
            x /= 10;
        }
        return original%sum==0?sum:-1;
    }
    public static void main(String[] args) {
        int x = 23;
        System.out.println(sumOfTheDigitsOfHarshadNumber(x));

    }
}
