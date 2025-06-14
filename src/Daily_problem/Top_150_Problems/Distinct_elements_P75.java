package Daily_problem.Top_150_Problems;
import java.util.ArrayList;
import java.util.HashSet;

public class Distinct_elements_P75 {
    public static void main(String[] args) {
        int[] arr = {12,10,9,45,2,10,10,45};

//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = 0; i < arr.length; i++){
//            if(list.contains(arr[i])){
//               continue;
//            }
//            else{
//                list.add(arr[i]);
//                System.out.print(arr[i] + "  ");
//            }
//        }

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set);

    }
}
