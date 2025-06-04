package recursion;
public class substring{
    public static void main(String[] args){
        String s = "sak";

        subseq(" ", s);

        
    }
    static void subseq(String ans , String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        
        char ch = str.charAt(0);
        
        subseq(ans + ch, str.substring(1));
        subseq(ans, str.substring(1));
        
    }
}