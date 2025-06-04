package basic_program;
import java.util.Scanner;
import java.lang.String;

public class Palindrome{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str = str1.toLowerCase();
        System.out.println(str);

        if(ispalindrome(str)){
            System.out.println(str + " is a palindrome");
        }
        else{
            System.out.println(str + " is not a palindrome");
        }
        in.close();
        
       
    }
    static boolean ispalindrome(String str){
       
        int i = 0;
        int j = str.length() - 1;

        while(i < j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        } 
        return true;
        
    }
}