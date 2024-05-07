import java.util.*;
import java.util.Scanner;

public class Solution {
    
    // public static int saveThePrisoner(int n, int m, int s) {
        // s -= 1;
        // while (m!=0) {
        //     s++;
        //     m--;
        //     if( s>n ) s=1;
        // }
        // return s;


        //   --s; --m;
        //   s += m;
        //   s %= n;
        //   s++;
        //   return s;
    // }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0)
        {
            
            // int n = input.nextInt(), m = input.nextInt(), s = input.nextInt()-1;
            // while(m != 0){
                //     m--;
                //     if(++s > n) s = 1;
                // }
            
                
            int n = input.nextInt(), m = input.nextInt(), s = input.nextInt();
             --s; --m;
             s += m;
             s %= n;
             s++;

            System.out.println(s);
        }
    }
}