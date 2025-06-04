package basic_program;
import java.util.Scanner;

public class Washingmachine{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int weight = in.nextInt();
        char waterlevel = in.next().charAt(0);
        

        
        if(weight >= 0){
            if(weight == 0){
                System.out.println("Time Estimated : 0 Minutes");
            }
    
            else if(weight <= 2000 && waterlevel == 'l'){
                System.out.println("Time Estimated : 25 Minutes");
            }
            else if(weight > 2000 && weight <= 4000 && waterlevel == 'm'){
                System.out.println("Time Estimated : 30 Minutes");
            } 
            else if(weight > 4000 && weight <= 7000 && waterlevel == 'h'){
                System.out.println("Time Estimated : 45 Minutes");
            }
            else{
                System.out.println("WEIGHT OVERLOADED");
            }
        }
        else{
           
            System.out.println("INVALID INTPUT");
           
        }
        in.close();


    }
}