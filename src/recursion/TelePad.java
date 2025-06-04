package recursion;
import java.util.ArrayList;
public class TelePad {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 9;
        String s1 = String.valueOf(n1);
        String s2 = String.valueOf(n2);
        System.out.println(pad("",(s1+s2)));
    }
    static ArrayList<String> pad(String ans, String str){
        if(str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> res = new ArrayList<>();
        int digits = str.charAt(0)-'0';
        int start = (digits-2)*3;
        int end = start+3;
        if(digits == 7 || digits == 9){
            if(digits == 9){
                start +=1;
                end = start + 4;
            }
            end = start + 4;
        }
        if(digits == 8){
            start += 1;
            end += 1;
        }
        for(int i = start; i < end; i++){
            char ch = (char)('a'+ i);
            res.addAll(pad(ans+ch,str.substring(1)));
        }
        return res;
    }
}
