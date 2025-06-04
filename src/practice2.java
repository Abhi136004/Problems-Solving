import java.util.Arrays;
public class practice2 {
    public static void main(String[] args){
        int[] arr = {2,2};
        int target = 2;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != target){
                continue;
            }
            ans[0] = i;
            int j;
            for(j = i+1; j < nums.length; j++){
                if(nums[j]!=nums[j-1]){
                    ans[1] = j-1;
                    return ans;
                }
                if(j == nums.length-1){
                    ans[1] = j;
                    return ans;
                }
            }
            if(j-1 == i){
                ans[1] = i;
                return ans;
            }

        }
        return new int[] {-1,-1};

    }
}
