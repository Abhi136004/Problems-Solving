package Company.mercer;

public class Word_encryption {
    public static void main(String[] args) {
        String str = "xyzabcde";
        String ans = "";
        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a'){
                ans += "z";
            }
            else{
                int n = (int) ch;
                char c = (char) (n-1);

                ans += c +"";
            }
        }
        System.out.println(ans);
    }
}
