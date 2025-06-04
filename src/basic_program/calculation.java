package basic_program;
import java.util.Scanner;

public class calculation{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the operator ('+', '-', '*' , '/') : ");
        char operator = in.next().charAt(0);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int result = 0;

        switch(operator){
            case '+':
            result = n1 + n2;
            break;

            case '-':
            result = n1 - n2;
            break;

            case '*':
            result = n1 * n2;
            break;

            case '/':
            result = n1 / n2;
            break;

            default :
            System.out.println("Invalid operator");
            break;
            
        }
        System.out.println(result);

        in.close();
    }
}