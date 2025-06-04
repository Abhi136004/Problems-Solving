package Daily_problem;

public class First_repeated_Last {
    public static void main(String[] args){
        int[] arr = {-1,0,0,-3,-2,-9};
        int n = 6;
        boolean flag = false;
        int a = 1;
        for(int i = n-1; i > 0; i--){
            if(arr[i] <= 0){
                a++;
                continue;
            }
            for(int j = i-1; j >= 0; j--){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == true){
                System.out.println(arr[i]);
                break;
            }
        }
        if(a == n){
            System.out.println(0);
        }
        else if(flag == false){
            System.out.println(arr[n-1]);
        }
    }
}
