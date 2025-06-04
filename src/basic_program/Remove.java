package basic_program;
import java.util.Arrays;

public class Remove{
    public static void main(String[] args){
       int[] arr = {1,10,10,2};
       int target = 10;
        int[] ans = remove(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] remove(int[] arr, int target){
        int[] ans = new int[arr.length];
        int i = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != target){
                ans[i] = arr[j];
                i++;
            }
        }
        return ans;
    }
}