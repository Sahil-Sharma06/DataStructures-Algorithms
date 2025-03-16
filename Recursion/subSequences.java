public class subSequences {
    public static void main(String[] args) {
        String s = "abc";
        subSeq(" ",s);
    }

    static void subSeq(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.print(processed+" ");
            return;
        }

        char ch = unprocessed.charAt(0);

        subSeq(processed+ch,unprocessed.substring(1));
        subSeq(processed,unprocessed.substring(1));
    }
}
