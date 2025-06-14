package Daily_problem.Top_150_Problems;

public class TwoSum_P82 {
    public static void main(String[] args) {
        int[] arr = {1,-1,2,-2,1};
        int target = -2;
        int i = 0;
         int j = i+1;
         boolean flag = false;
        while(j < arr.length){
            if(arr[i]+arr[j] == target){
                flag = true;
                System.out.println(i + "  " + j);
                break;
            }
            j++;
            if(j == arr.length){
                i++;
                j=i+1;
            }
        }
       if(!flag){
           System.out.println("-1  -1");
       }
    }
}
