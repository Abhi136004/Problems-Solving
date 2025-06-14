package Daily_problem.Top_150_Problems;

public class Max_subArray_Sum_P70 {
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        //brute force
        int max = Integer.MIN_VALUE;
//        int s = 0;
//        int e = 0;
//        for(int i = 0 ; i < arr.length; i++){
//            int sum = 0;
//            for(int j = i ; j< arr.length; j++){
//                sum += arr[j];
//                if(sum > max){
//                    max = sum;
//                    s = i;
//                    e = j;
//                }
//            }
//        }
//        for(int i = s; i <= e; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();


        //optimal Kadane's algorithm

        int sum = 0;
        int r = 0;
        int l = 0;
        while(r < arr.length){
            sum += arr[r];
            if(sum < 0){
                sum = 0;
                l = r+1;
            }
            if(sum > max){
                max = sum;
            }
            r++;
        }
        for(int i = l; i < r; i++){
           System.out.print(arr[i] + " ");
        }
        System.out.println(max);
    }
}
