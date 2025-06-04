package Daily_problem.Top_150_Problems;
import java.util.Arrays;
public class Missing_P56 {
    public static void main(String[] args) {
        int[] arr = {3,7,1,2,8,4,5};
//        int max = arr[0];
//        int sum = 0;
//        for(int i = 0 ; i < arr.length; i++){
//            sum += arr[i];
//            max = (max < arr[i]) ? arr[i] : max;
//        }
//        int total = max * (max+1)/2 ;
//        System.out.println(total - sum);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i <= arr.length; i++){
            if(i+1 != arr[i]){
                System.out.println(i+1);
                break;
            }
        }
    }
}
