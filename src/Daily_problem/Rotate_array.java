package Daily_problem;
import java.util.ArrayList;
public class Rotate_array {
    public static void main(String[] args){
        int[] arr = {10,5,20,30,1,4,25};
        int k = 3;
        rotate(arr,k-1,arr.length);
        rotate(arr,0,k-1);
        System.out.println(ans);

    }
    static ArrayList<Integer> ans = new ArrayList<>();
    static void rotate(int[] arr,int s, int e){
        for(int i = s; i < e; i++){
            ans.add(arr[i]);
        }
    }
}
