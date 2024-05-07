import java.util.Stack;

public class RomantoInteger {
    public static int romanToInt(String s){

        Stack<Integer> stk = new Stack<>();
        for( int i=0;i<s.length();i++ ){
            if(s.charAt(i)=='I') stk.push(1);
            if(s.charAt(i)=='V') stk.push(5);
            if(s.charAt(i)=='X') stk.push(10);
            if(s.charAt(i)=='L') stk.push(50);
            if(s.charAt(i)=='C') stk.push(100);
            if(s.charAt(i)=='D') stk.push(500);
            if(s.charAt(i)=='M') stk.push(1000);
        }

        int res = stk.peek();
        while (stk.size()>1){
            int dig = stk.pop();
            if( dig>stk.peek()) res = res-stk.peek();
            else res = res+stk.peek();
        }
        return res;
    }
    public static void main(String[] args) {
        // String  s = "MCMXCIV";
        // String  s = "LVIII";
        String  s = "III";
        System.out.println(romanToInt(s));
    }
}
