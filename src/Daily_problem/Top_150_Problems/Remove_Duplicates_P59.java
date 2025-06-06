package Daily_problem.Top_150_Problems;
import java.util.ArrayList;
public class Remove_Duplicates_P59 {
    public static void main (String[] args){
        int[] arr = {1,2,2,3,4,4,5,6};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < arr.length; i++){
            if(!(list.contains(arr[i]))){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
