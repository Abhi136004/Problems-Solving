package recursion;
public class Phonepad{
    public static void main(String[] args){
        String str = "12";
        pad("", str);
    }
    static void pad(String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return ;
        }

        int digit = str.charAt(0) - '0';

        for(int i = (digit - 1) * 3; i < digit *3; i++){
            char ch = (char)('a' + i);

            pad(ans + ch, str.substring(1));
        }

    }
}