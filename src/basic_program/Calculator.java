package basic_program;
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       while(true){
            System.out.println("Choose the option: \\n 1) Addition(+) \\n 2) Subtraction(-) \\n 3) Multiplication(*) \\n 4) Division(/)");
            char option = in.next().charAt(0);

            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int res = 0;

            switch(option){
                case '+':
                res = n1 + n2;
                break;

                case '-':
                res = n1 - n2;
                break;

                case '*':
                res = n1 * n2;
                break;

                case '/':
                res = n1 / n2;
                break;

                default :
                System.out.println("Invalid operator");
                break;
            }
            System.out.println(res);
            System.out.println("Do u want to continue :");
            in.nextLine();
            String con = in.nextLine();
            if(!con.equalsIgnoreCase("yes")){
                break;
            }
        
        }
        in.close();

    }
}