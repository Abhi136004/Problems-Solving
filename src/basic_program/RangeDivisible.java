package basic_program;
import java.util.Scanner;
import java.util.Arrays;

public class RangeDivisible{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String[] res = new String[n];

        for(int i = 0; i < res.length; i++){
            int num = i+1;
            if(num % 3 == 0 && num % 5 == 0){
                res[i] = "FizzBuzz";
            }

            else if(num % 3 == 0){
                res[i] = "Fizz";
            }

            else if(num % 5 == 0){
                res[i] = "Buzz";
            }
            else{
                res[i] = Integer.toString(i+1);
            }

        }
        System.out.println(Arrays.toString(res));
        
        in.close();
    }
}