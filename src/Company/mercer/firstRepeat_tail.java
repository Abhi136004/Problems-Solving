package Company.mercer;

public class firstRepeat_tail {
    public static void main(String[] args) {
        int[] arr = {-1,2,-4,-1,-2,-8};
        int n = arr.length-1;
        int neg = 0;
        int i = n, j = i-1;
        for(i = n; i > 0; i--){
            if(arr[i] <= 0){
                neg++;
                continue;
            }
            for(j = i-1; j >= 0; j--){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
            if(j != -1) {
                break;
            }
        }
        if(neg == n){
            System.out.println(0);
        }
        else if(i == 0){
            System.out.println(arr[n]);
        }
    }
}
