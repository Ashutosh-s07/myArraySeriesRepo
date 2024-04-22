public class ScoreofaString {
    public static int scoreOfString(String s) {
        int result = 0;
        for( int i=0;i<s.length()-1;i++){
            result += Math.abs((s.charAt(i)-'a')-(s.charAt(i+1)-'a'));
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "zaz";
        System.out.println(scoreOfString(s));
    }
}
