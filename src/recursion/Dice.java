package recursion;
import java.util.ArrayList;
public class Dice {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(die("",n));
    }
    static ArrayList<String> die(String ans, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
       }
        ArrayList<String> res = new ArrayList<>();
        for(int i = 1; i <= target; i++){
            res.addAll(die(ans+i, target-i));
        }
        return res;
    }
}
