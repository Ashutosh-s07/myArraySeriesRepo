public class MinimumFlipstoMakeaORbEqualtoc {
    public static int minFlips(int a, int b, int c) {
        int oprn=0;
        while (c>0) {
            if( a%2==1 && b%2==1 && c%2==0 ) oprn += 2;
            else if(( a%2==1 && b%2==0 && c%2==0 ) || ( a%2==0 && b%2==0 && c%2==1 ) || ( a%2==0 && b%2==1 && c%2==0 )) oprn += 1;
            a /= 2; b /= 2; c /= 2; 
        }
        return oprn;
    }
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        System.out.println(minFlips(a, b, c));
    }
}
