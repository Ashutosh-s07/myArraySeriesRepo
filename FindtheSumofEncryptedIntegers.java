public class FindtheSumofEncryptedIntegers {
    public static int sumOfEncryptedInt(int[] nums) {
        int result = 0;
        for( int i=0;i<nums.length;i++){
            result += encrypt(nums[i]);
        }
        return result;
    }

    public static int encrypt(int x){
        int maxii = 0, count  = 0, result = 0;
        while(x>0){
            int rem  = x%10;
            x/=10;
            maxii = Math.max(maxii, rem);
            count++;
        }
        while (count>0) {
            result = result*10+maxii;
            count--;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {10,21,31};
        // System.out.println(encrypt(24856));
        System.out.println(sumOfEncryptedInt(nums));
    }
}
