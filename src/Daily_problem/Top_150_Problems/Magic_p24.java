package Daily_problem.Top_150_Problems;

public class Magic_p24 {
    public static void main(String[] args) {
        int n = 1234;
        int temp = n;
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            sum += rem;
            n /= 10;

            if(n == 0){
                if(sum < 9 && sum == 1){
                    System.out.println(temp + " is a magic number");
                }
                else if(sum < 9){
                    System.out.println(temp + " is not a magic number");
                }
                else{
                    n = sum;
                    sum  = 0;
                }
            }
        }
    }
}
