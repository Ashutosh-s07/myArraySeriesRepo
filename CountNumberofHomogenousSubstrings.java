public class CountNumberofHomogenousSubstrings {
    public static int countHomogenous(String s) {
        int result = 0, modulo = 1000000007, st=0, end=0;
        while (end<s.length()) {
            char c = s.charAt(st);
            if( c != s.charAt(end) ) st++;
            else {
                result += ((end-st)+1)%modulo;
                end++;  
            }
        }
        return result;

    }
    public static void main(String[] args) {
        String s =  "xy";
        System.out.println(countHomogenous(s));
    }
}
