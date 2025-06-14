import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class practice {
    public static void main(String[] args) {
       int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};
       System.out.println(luckyNumbers(arr));
    }

        static ArrayList<Integer> luckyNumbers(int[][] matrix) {
            int[] row = new int[matrix.length];
            int[] col = new int[matrix[0].length];
            int s = 0;
            for(int[] num : matrix){
                int[] set = minmax(num);
                row[s] = set[0];
                col[set[2]] = Math.max(col[set[2]],set[1]);
                s++;
            }
            for(int i = 0; i < row.length; i++){
                for(int j = 0; j < col.length; j++){
                    if(row[i] == col[j]){
                        return new ArrayList<Integer>(Arrays.asList(row[i]));
                    }
                }
            }
            return new ArrayList<>(Arrays.asList(-1));

        }
        static int[] minmax(int[] arr){
            int[] set = new int[3];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int index = 0;
            for(int i = 0; i < arr.length; i++){
                min = Math.min(min,arr[i]);
                if(arr[i] > max){
                    max = arr[i];
                    index = i;
                }
            }
            set[0] = min;
            set[1] = max;
            set[2] = index;
            return set;
        }
}


