package important;
import java.util.Arrays;
public class Group_Reverse{
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,25,35,45};
        int d = 2;
        reverse(arr,0,d);
        reverse(arr,d+1,arr.length-1);
        
        System.out.println(Arrays.toString(arr));
    }
    static int[] reverse(int[] arr,int s, int e){
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }
   
}