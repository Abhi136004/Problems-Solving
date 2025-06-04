package important;
import java.util.Scanner;

public class StringPalindrome{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        

        String str1 = str.replaceAll("[^a-zA-z]" , "");
        String str2 = str1.toLowerCase();

        
        if(palindrome(str2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        in.close();
    }
    public static boolean palindrome(String str){

        if(str.length() == 0){
            return true;
        }

        int i = 0; 
        int j = str.length()-1;

        while( i <= j){
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