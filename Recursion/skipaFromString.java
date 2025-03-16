public class skipaFromString {
    public static void main(String[] args) {
        String s = "baccdah";
        skipA(" ", s);
        System.out.println(skipAWithReturn(s));
    }

    static void skipA(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a') skipA(processed,unprocessed.substring(1));
        else skipA(processed + ch , unprocessed.substring(1));
    }

    static String skipAWithReturn(String unprocessed){
        if(unprocessed.isEmpty()){
           return "";
        }

        char ch = unprocessed.charAt(0);

        if(ch == 'a')  return skipAWithReturn(unprocessed.substring(1));
        else return ch + skipAWithReturn( unprocessed.substring(1));
    }
}
