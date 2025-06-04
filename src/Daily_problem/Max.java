package Daily_problem;

public class Max {
    public static void main(String[] args){
        int[] arr = {23,45,82,27,66,12,78,13,71,86};
        MaxIntArray(arr,arr.length);
       } 
       static void MaxIntArray(int[] arr, int n){
            int max = Integer.MIN_VALUE;
            int index = 0;
            for(int i = 0 ; i < n; i++){
                if(arr[i] > max){
                    max = arr[i];
                    index = i;
                }
            }
            System.out.println(max);
            System.out.println(index);
       }
    
}
