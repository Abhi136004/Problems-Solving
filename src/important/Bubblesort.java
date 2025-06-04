package important;
import java.util.Arrays;

public class Bubblesort{
    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1, 45, 557, 54, 5, 5, 4 , 35, 65};

        bubblerecursion(arr, arr.length-1, 0);
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblerecursion(int[] arr, int r, int c){
        if(r == 0){
            return;
        }

        if(r > c){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp; 
            }
             bubblerecursion(arr, r, c+1);
            
        }
        else{
            bubblerecursion(arr, r-1, 0);
        }
    }
    static void bubblesort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 - i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}