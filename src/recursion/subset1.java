package recursion;

import java.util.ArrayList;
//without converting it into string
public class subset1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = subset(arr);
        System.out.println(ans);
    }
    static ArrayList<ArrayList<Integer>> subset(int[] arr){

        ArrayList<ArrayList<Integer>> out = new ArrayList<>();
        out.add(new ArrayList<Integer>());


        for(int num : arr){
            int n = out.size();

            for(int j = 0; j < n; j++){
                ArrayList<Integer> in = new ArrayList<>(out.get(j));
                in.add(num);
                out.add(in);
            }
        }
        return out;
    }
}
