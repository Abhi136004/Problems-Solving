package Daily_problem.Top_150_Problems;

import java.util.Arrays;

public class Delete_index_P77 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int pos = 2;

        int[] ans = new int[arr.length-1];
        int i = 0;
        int j = 0;
        while(i < arr.length){
            if(i == (pos-1)){
                i++;
            }
            else{
                ans[j] = arr[i];
                i++;
                j++;
            }


        }
        System.out.println(Arrays.toString(ans));
    }
}
