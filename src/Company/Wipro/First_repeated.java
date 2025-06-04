package Company.Wipro;

public class First_repeated {
    public static void main(String[] args) {
        int[] arr = {-2,-1,-2,0,-4,-1,-2,-8};
        System.out.println(repeat(arr));
    }
    static int repeat(int[] arr){
        int neg = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= 0){
                neg++;
                continue;
            }
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
            if(i == arr.length-1){
                return arr[0];
            }
        }
        if(neg == arr.length)
            return  0;

        return 1;
    }


}
