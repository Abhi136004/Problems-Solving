package Company.mercer;

public class Sum_nonprime {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,3,4,-7};
        int sum = arr[0] + arr[1];
        for(int i = 0; i < arr.length; i++){
            if((!prime(i))){
                System.out.println(arr[i]);
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
    static boolean prime(int n){
        int count = 0;
        for(int i = 1; i <= n;i++){
            if(n % i == 0){
                count++;
            }
            if(count > 2){
                return false;
            }
        }

        return true;
    }
}
