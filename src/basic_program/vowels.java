package basic_program;
import java.util.Scanner;

public class vowels{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String lower = str.toLowerCase();
        
        for(int i = 0; i < str.length(); i++){
            char ch = lower.charAt(i);
            
            switch(ch){
                case 'a':
                System.out.print(ch + " ");
                break;
                case 'e':
                System.out.print(ch + " ");
                break;
                case 'i':
                System.out.print(ch + " ");
                break;
                case 'o':
                System.out.print(ch + " ");
                break;
                case 'u':
                System.out.print(ch + " ");
                break;
                

            }
        }
        in.close();

        

    }
}