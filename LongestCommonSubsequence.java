public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        
        String large = text1.length()>=text2.length()?text1:text2;
        String small = text1.length()<text2.length()?text1:text2;
        int count = 0;
        System.out.println(small);
        System.out.println(large);
        for( char c : small.toCharArray() ){
            String s = String.valueOf(c);
            if( large.contains(s)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String text1 = "ezupkr", text2 = "ubmrapg";
        System.out.println(longestCommonSubsequence(text1, text2));
    }
}
