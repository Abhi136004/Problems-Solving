package important;
import java.util.Scanner;

public class LeftRigth{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(leftRightDifference(arr));
        in.close();
    }
    static int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
 
        for(int i = 0; i < nums.length; i++){
         int leftvalue = Leftsum(nums,i);
         int rightvalue = Rightsum(nums,i);
         ans[i] = Math.abs(leftvalue - rightvalue);
        } 
        return ans;
     }
     static int Leftsum(int[] nums, int n){
         int sum = 0;
         if(n == 0){
             return 0;
         }
 
         for(int i = 0; i < n; i++){
             sum += nums[i];
         }
         return sum;
     } static int Rightsum(int[] nums, int n){
         int sum = 0;
         if(n == nums.length - 1){
             return 0;
         }
 
         for(int i = n+1; i < nums.length;i++){
             sum += nums[i];
         }
         return sum;
     }
}