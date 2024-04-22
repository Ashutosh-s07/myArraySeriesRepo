import java.util.Stack;

public class RemoveKDigits {
    public static String removeKdigits(String num, int k) {
        
        if( k==num.length() ) return "0";

        Stack<Character> stk = new Stack<>();
        int i=0;
        while ( i<num.length() ) {
            while ( k>0 && !stk.isEmpty() && stk.peek()>num.charAt(i)) {
                stk.pop();
                k--;
            }
            stk.push(num.charAt(i));
            i++;
        }

        while (k>0) {
            stk.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while ( !stk.isEmpty() ) sb.append(stk.pop());
        sb.reverse();

        // to delete leading 0's
        while (  sb.length()>1 && sb.charAt(0)=='0') sb.deleteCharAt(0);

        return sb.toString();
    }
    public static void main(String[] args) {
        String  num = "1432219";
        int k = 3;
        System.out.println(removeKdigits(num, k));
    }
}
