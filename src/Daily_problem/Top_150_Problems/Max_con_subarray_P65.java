package Daily_problem.Top_150_Problems;

public class Max_con_subarray_P65 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max = Integer.MIN_VALUE;
       /*  for(int i = 0; i < arr.length; i++){
            int sum  = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                if(sum > max){
                    max = sum;
                }
            }
        }*/

        //kaden's algorithm
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            max = Math.max(sum,max);
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
