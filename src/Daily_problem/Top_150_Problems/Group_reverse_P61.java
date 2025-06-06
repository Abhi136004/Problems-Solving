package Daily_problem.Top_150_Problems;
import java.util.Arrays;

public class Group_reverse_P61 {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,15,25,35};
        int d = 2;
        reverse(arr,0,d);
        reverse(arr,d+1,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr, int s, int e){
        int i = s;
        int j = e;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
