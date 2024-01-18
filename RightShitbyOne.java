import java.util.Arrays;

public class RightShitbyOne {
    public static void main(String[] args) {
        int[] arr = { 10,20,30,40,50,60};
        int k = 2;
        while( k>0){
            shiftk(arr,k);
            k--;

        }
       
        System.out.println(Arrays.toString(arr));
    }
    public static void shiftk( int[] arr, int k){

        int temp = arr[arr.length-1];
       
        for( int i=arr.length-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
       
        arr[0] = temp;
    
    }
}
