public class MaximumNestingDepthoftheParentheses {
    public static int maxDepth(String s) {
        int result = 0, solu = 0;
        for( int i=0;i<s.length();i++ ){
            if(s.charAt(i)=='(') result++;
            else if(s.charAt(i)==')') result--;
            solu = Math.max(result, solu);
        }
        return solu; 
    }
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
        
    }
}
