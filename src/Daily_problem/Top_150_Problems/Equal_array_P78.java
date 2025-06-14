package Daily_problem.Top_150_Problems;
import java.util.Arrays;
public class Equal_array_P78 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,5,0,4};
        int[] arr2 = {2,4,5,0,1};
        boolean flag = true;
        if(arr1.length != arr2.length){
            flag = false;
        }
        if(flag){
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){

                    break;
                }
            }
        }
        System.out.println(flag);
    }
}
