package important;
import java.util.Arrays;
public class SingleElement{
    public static void main(String[] args){
        int[] arr = {2,2,1,3,3,1,4};
        System.out.println(single(arr));
    }
    static int single(int[] arr){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i+=2){
            
            if(arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
}