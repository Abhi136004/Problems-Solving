package important;
import java.util.Scanner;

public class GoodPairs{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Goodpairs(arr));
        in.close();
    }
    public static int Goodpairs(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}