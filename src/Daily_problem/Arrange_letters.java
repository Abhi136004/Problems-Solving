package Daily_problem;

import java.util.Arrays;
public class Arrange_letters {
    public static void main(String[] args) {
        String str = "are you ready to join with hakunamatata".toLowerCase();
        String[] res = str.split(" ");
        for(int i = 0; i < res.length; i++){
            char[] ch = res[i].toCharArray();
            Arrays.sort(ch);
            res[i] = String.valueOf(ch);
        }

        Arrays.sort(res);
        String ans = String.join(" ",res);
        System.out.println(ans);
    }
}
