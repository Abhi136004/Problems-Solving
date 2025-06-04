package Daily_problem;
import java.util.Arrays;
public class Group_reverse {
    public static void main(String[] args){
        int[] arr = {5,3,8,1,2,4,6,5,4,5,3,2,3,1,6};
        int d = 3;
        int i = 0; 
        int a = i;
        int j = d;

        while(i < arr.length){
            if(i < j && j >= arr.length){
                j--;
            }
            else if(i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; 
                j--;
            }
            else{
                i = a + d+1;
                a = i;
                j =  i + d;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
