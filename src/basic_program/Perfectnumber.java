package basic_program;
import java.util.Scanner;

public class Perfectnumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = perfectnumber(n);

        if(sum == n){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        in.close();

    }

    static int perfectnumber(int n){
        int sum = 0;

        for(int i = 1; i <= (n/2); i++){
            if(n % i == 0){
                sum += i;
            }
        }
           
            
        return sum;
    }
    
}