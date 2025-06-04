package recursion;
import java.util.ArrayList;
//by converting it into string and done by using permutation
public class Subset{
    public static void main(String[] args){
        int[] arr = {10,2,3};
        String ans = largestNumber(arr);
        System.out.println(ans);
    }
    static String largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();

        for (int num : nums) {
            sb.append(num);
        }

        String str = sb.toString();
        System.out.println(str);

        ArrayList<String> ans = number("", str);
        System.out.println(ans);
        int max = 0;
        for (int j = 0; j < ans.size(); j++) {
            int val = Integer.valueOf(ans.get(j));

            if (val > max) {
                max = val;
            }
        }
        return String.valueOf(max);
    }

    static ArrayList<String> number(String ans, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);

        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0, i);
            String second = ans.substring(i, ans.length());

            res.addAll(number(first + ch + second, str.substring(1)));
        }
        return res;

    }
}