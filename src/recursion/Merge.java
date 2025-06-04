package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i  < n; i++){
            arr[i] = in.nextInt();
        }

        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
        in.close();
    }
    
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] left, int[] right){
        int[] res = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                res[k] = left[i];
                i++;
            }
            else{
                res[k] = right[j];
                j++;
            }
            k++;
            
        }

        while(i < left.length){
            res[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            res[k] = right[j];
            j++;
            k++;
        }
        return res;

    }
}
