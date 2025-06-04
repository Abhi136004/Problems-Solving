package recursion;

public class isSorted {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.println(isSort(arr,0));
    }

    static boolean isSort(int[] nums,int i){
        if(i == nums.length-1){
            return true;
        }

        return (nums[i] < nums[i+1]) && isSort(nums,i+1);
    }
}
