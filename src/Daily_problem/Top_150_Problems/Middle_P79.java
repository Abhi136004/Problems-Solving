package Daily_problem.Top_150_Problems;

public class Middle_P79 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int mid = Math.abs(arr.length/2);
        if(arr.length % 2 == 0){
            System.out.println(arr[mid-1] + " " + arr[mid]);
        }
        else{
            System.out.println(arr[mid]);
        }
    }
}
