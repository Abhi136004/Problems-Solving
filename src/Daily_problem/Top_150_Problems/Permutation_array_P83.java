package Daily_problem.Top_150_Problems;
import java.util.ArrayList;
import java.util.Arrays;
public class Permutation_array_P83 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String str = "";
        for(int n : arr){
            str += n;
        }

        ArrayList<String> ans = per(str,"");
       for(String s : ans){
           System.out.print(Arrays.toString(s.toCharArray()));
       }
    }
    static ArrayList<String> per(String str, String ans){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String>  res = new ArrayList<>();
        char ch = str.charAt(0);
        for(int i = 0 ; i <= ans.length(); i++){
            String f = ans.substring(0,i);
            String s = ans.substring(i,ans.length());
            res.addAll(per(str.substring(1),f+ch+s));
        }

        return res;
    }
}
