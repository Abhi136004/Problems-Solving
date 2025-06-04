package Daily_problem;
import java.util.Arrays;

public class Range_number_array {
   public static void main(String[] args){
    int[] arr = {10,5,20,20,30,1,4,25};
    int[] ans = new int[arr.length];

    for(int i = 0; i < arr.length; i++){
        int count = 1;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] < arr[i]){
                count++;
            }
        }
        ans[i] = count;
    }
    System.out.println(Arrays.toString(ans));
   } 
}
