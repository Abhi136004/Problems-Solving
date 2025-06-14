package Daily_problem.Top_150_Problems;

public class Leader_P80 {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        int max =Integer.MIN_VALUE;
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] > max){
                System.out.println(arr[i]);
                max = arr[i];
            }
        }
    }
}
