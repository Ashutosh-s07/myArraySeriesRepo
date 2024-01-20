import java.util.Arrays;

public class Test {
    public static void countZeroOneTwo(int arr[],int size){
        
        int count_0 = 0, count_1 = 0, count_2 = 0;
        for( int i=0;i<size;i++){
            if( arr[i]==0 ) count_0++;
            if( arr[i]==1 ) count_1++;
            if( arr[i]==2 ) count_2++;
        }
        for( int i=0;i<count_0;i++) arr[i]=0;
        for( int i=count_0;i<count_1;i++) arr[i]=1;
        for( int i=count_1+count_0;i<size;i++) arr[i]=2;

        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
            int[] arr = {0,2,1,2,0};
            countZeroOneTwo(arr, 5); 
    }
}  

