package basic_program;
import java.util.Scanner;
public class Age_Calculation{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the current date with month and year : ");
        int current_date = in.nextInt();
        int current_month  = in.nextInt();
        int current_year = in.nextInt();

        System.out.println("Enter your Date 0f Birth  : ");
        int DOB_date = in.nextInt();
        int DOB_month  = in.nextInt();
        int DOB_year = in.nextInt();
        
        int year = 0;
        int month = 0;
        
        if(current_date > DOB_date && current_month > DOB_month){
            year = current_year - DOB_year;
            month = current_month - DOB_month;
        }
        else{
            year = current_year - DOB_year - 1;
            month = (12 - DOB_month) + current_month;
        }

        

        System.out.println("Your Age is : " + year + " Years " + month + " Months");
        in.close();

    }
}