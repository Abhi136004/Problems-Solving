package Daily_problem.Top_150_Problems;
import java.util.Arrays;
public class Re_arrange_P58 {
    public static void main(String[] args){
        int[] arr = {1,3,5,2,8,7,4,6};

        Arrays.sort(arr);
        arr = arrange(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] arrange(int[] arr){
        int[] ans = new int[arr.length];

        int i = 0;
        int j = arr.length-1;
        for(int k = 0; k < ans.length; k+=2){
            ans[k] = arr[i];
            if(i < j){
                ans[k+1] = arr[j];
            }

            i++;
            j--;
        }
        return ans;
    }

}
