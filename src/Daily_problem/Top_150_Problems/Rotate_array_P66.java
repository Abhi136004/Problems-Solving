package Daily_problem.Top_150_Problems;
import java.util.Arrays;
public class Rotate_array_P66 {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        d = d % arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
