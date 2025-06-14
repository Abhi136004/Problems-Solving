package Daily_problem.Top_150_Problems;

import java.util.Arrays;

public class Transpose_P84 {
    public static void main(String[] args) {
        int[][] arr = {{2,4,-1},{-10,5,11},{18,-7,6}};
        int[][] ans = new int[arr[0].length][arr.length];
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length;j++){
                ans[i][j] = arr[j][i];
            }
        }
        for(int[] array : ans){
            System.out.println(Arrays.toString(array));
        }


    }
}
