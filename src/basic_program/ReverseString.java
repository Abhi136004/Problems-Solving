package basic_program;
public class ReverseString{
    public static void main(String[] args){
        String s1 = "abcd";

        String res = "";

        for(int i = s1.length()-1; i >= 0; i--){
            res += s1.charAt(i);
            
        }
        System.out.println(res);
    }
}