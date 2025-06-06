package Daily_problem.Top_150_Problems;
import java.util.Arrays;

public class Prod_array_P67 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int p = 1;
        for(int i = 0; i < arr.length; i++){
            left[i] = p;
            p *= arr[i];
        }
        p = 1;
        for(int i = arr.length-1; i >= 0; i--){
            right[i] = p;
            p *= arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = left[i]*right[i];
        }
        System.out.println(Arrays.toString(arr));

    }
}
