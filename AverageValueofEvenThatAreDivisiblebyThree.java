public class AverageValueofEvenThatAreDivisiblebyThree {
    public static int averageValue(int[] nums) {
        int count = 0, sum = 0;
        for( int num:nums ){
            if( num%2==0  && num%3==0 ){
                sum += num;
                count += 1;
            }
        }
        return count!=0?sum/count:0;
    }
    public static void main(String[] args){
        int[] nums = {1,2,4,7,10};
        System.out.println(averageValue(nums));
    }
}
