package Company.mercer;

public class Alphabet_shift {
    public static void main(String[] args) {
        String str = "ABCDXy";
        String[] res = str.split(" ");
        for(int i = 0; i < res.length; i++){
            int n = res[i].length();
            String ans = "";
            for(int j = 0; j < n; j++){
                int len = (int) res[i].charAt(j);
                if((len+n) > 'Z' && (len+n) < 'a'){
                    ans += "Z";
                }
                else if ((len+n) > 'z'){
                    ans += "z";

                }
                else{
                    char ch = (char) (len + n);
                    ans += ch + "";
                }

            }
            res[i] = ans;
        }
        System.out.println(String.join(" ",res));
    }
}
