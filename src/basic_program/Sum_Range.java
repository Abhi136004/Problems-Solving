package basic_program;
import java.util.Scanner;
public class Sum_Range {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();
        int sum = 0;

        for(int i = m; i <= n; i++){
            sum += i;
        }
        System.out.printf("The sum between %d and %d is : %d%n" , m , n , sum);
        in.close();
    }
}
