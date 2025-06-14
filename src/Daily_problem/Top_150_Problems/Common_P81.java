package Daily_problem.Top_150_Problems;
import java.util.ArrayList;
import java.util.Arrays;
public class Common_P81 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,1,3,1};
        int[] arr2 = {3,1,3,4,1};
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int n : arr2){
            list2.add(n);
        }
        for(int i = 0; i < arr1.length; i++){
            if(list2.contains(arr1[i])){
                System.out.println(arr1[i]);
                list2.set(list2.indexOf(arr1[i]),-1);
            }
        }

    }
}
