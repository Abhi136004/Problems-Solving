package important;
import java.util.ArrayList;
import java.util.Collections;

public class LeaderNumber {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        System.out.println(leader(arr));
    }

    static ArrayList<Integer> leader(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (j == nums.length - 1) {
                    list.add(nums[i]);
                    break;
                }

                if (nums[i] < nums[j + 1]) {
                    break;
                }
            }
        }
        return list;
    }

    // or
    static ArrayList<Integer> leaders(int nums[]) {
       
        ArrayList<Integer> list = new ArrayList<>();

        int curr = nums[nums.length - 1];
        list.add(curr);
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= curr) {
                curr = nums[i];
                list.add(curr);
            }
        }
        Collections.reverse(list);

        return list;
    }

}