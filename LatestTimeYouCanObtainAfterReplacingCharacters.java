public class LatestTimeYouCanObtainAfterReplacingCharacters {
    public static String findLatestTime(String s) {
        char[] time = s.toCharArray();
        if( time[0]=='?' && time[0]=='?' ){
            time[0]='1';
            time[1]='1';
        }
        if( time[0]=='?' && time[1]<='9' ){
            time[0]='0';
        }
        if( time[0]=='?' && (time[1]=='0' || time[1]=='1') ){
            time[0]='1';
        }
        time[1] = (time[1] == '?' ) ? ((time[0]=='0')?'9':'1') : time[1];
        time[3] = (time[3] == '?') ? '5' : time[3];
        time[4] = (time[4] == '?') ? '9' : time[4];
        return new String(time);
    }
    public static void main(String[] args) {
        String  s = "?3:12";
        System.out.println(findLatestTime(s));        
    }
}
