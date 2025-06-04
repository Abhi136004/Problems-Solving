package basic_program;
import java.util.Scanner;

public class StringBulider{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String b= sb.toString();
        if(s.equals(b)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        sc.close();
       



        

    }
}