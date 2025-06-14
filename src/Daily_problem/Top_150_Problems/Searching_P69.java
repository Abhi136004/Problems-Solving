package Daily_problem.Top_150_Problems;
import java.util.ArrayList;
public class Searching_P69 {
    public static void main(String[] args) {
        int[] arr = {10,20,10,30,14,40,60,10};
        int search = 10;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == search){
                list.add(arr[i]);
                count += 1;
                list.add(count);
            }
            else{
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }

}
