package recursion;
import java.util.ArrayList;
public class permutation {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(per(str,""));
    }
    static ArrayList<String> per(String str, String ans){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> res = new ArrayList<>();
        char ch = str.charAt(0);
        for(int i = 0; i <= ans.length(); i++){
            String first = ans.substring(0,i);
            String second = ans.substring(i,ans.length());
            res.addAll(per(str.substring(1), first + ch + second));
        }
        return res;
    }
}
