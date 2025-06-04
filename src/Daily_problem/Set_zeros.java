package Daily_problem;

import java.util.Arrays;

public class Set_zeros {
   public static void main(String[] args){
    int[] arr = {1,0,4,6,0,7,3,0,0,4,4,0};
    int i = 0; 
    int j = arr.length-1;
    while(i < j){
        while( arr[i] != 0){
            i++;
        }
        while(arr[j] == 0){
            j--;
        }
        if(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    System.out.println(Arrays.toString(arr));

   } 
}
