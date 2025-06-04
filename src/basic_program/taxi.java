package basic_program;
import java.util.Scanner;
public class taxi {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Taxi Number : ");
        String t_no = in.nextLine();
        System.out.print("Enter distance travelled : ");
        int d = in.nextInt();
        System.out.println("Taxi N0 : " + t_no);
        System.out.println("Distance covered : " + d);

        int Amount = 0;
        if(d > 0){
            if(d <= 5){
                Amount = 100;
            }
            else if(d <= 15){
                Amount = 100 + ((d - 10) * 10);
            }    
            else if(d <= 25){
                Amount = 100 + (10 * 10) + ((d - 15)*8);
            }   
            else{
                Amount = 100 + (10 * 10) + (10 * 8) + ((d - 25)*5);
            }
        }
        System.out.println(Amount);
        in.close();

    }
}
