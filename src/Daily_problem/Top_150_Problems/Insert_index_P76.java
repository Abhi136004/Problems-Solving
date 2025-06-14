package Daily_problem.Top_150_Problems;
import java.util.Arrays;
public class Insert_index_P76 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int pos = 3;
        int element = 50;

        int[] ans = new int[arr.length+1];
        int i = 0;
        int j = 0;
        while(i < ans.length){
            if(i == (pos-1)){
                ans[i] = element;
                ans[i+1] = arr[j];
                i++;
            }
            else{
                ans[i] = arr[j];
            }
            i++;
            j++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
