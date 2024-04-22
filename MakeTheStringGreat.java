public class MakeTheStringGreat {
    public static String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for( int i=s.length()-1;i>0;i--){
            Character cr = s.charAt(i);
            if(cr.isUpperCase())
            if(s.charAt(i-1) == cr.toLowerCase(s.charAt(i)) || s.charAt(i-1) == cr.toUpperCase(s.charAt(i)) ){
                System.out.println(s.charAt(i-1));
            }
        }
        return "ash";
    }
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }
}
