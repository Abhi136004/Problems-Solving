package basic_program;
import java.util.Scanner;

public class BiggestDigit{
    public static void main(String[]  args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int max = 0;
        while(num > 0){
            int rem = num % 10;
            if(rem > max){
                max = rem;
            }
            num = num/10;
        }
        System.out.println(max);
        in.close();

    }
}