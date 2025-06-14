package Daily_problem.Top_150_Problems;
import java.util.Arrays;
public class Reverse_arr_P72 {
    public static void main(String[] args) {
        int[] arr = {4,5,2};
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
