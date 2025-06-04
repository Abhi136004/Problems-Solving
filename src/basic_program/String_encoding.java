package basic_program;

public class String_encoding {
    public static void main(String[] args) {
        String str = "aaaabbbbcccd";
        String ans = "";
        int i = 0, j = i;
        while(i < str.length() ){
            if(j < str.length() && (str.charAt(i) == str.charAt(j))){
                j++;
            }
            else{
                int value = j - i;
                String v = String.valueOf(value);
                ans = ans +  str.charAt(i) + v;
                i = j;
            }
        }
        System.out.println(ans);
    }
}
