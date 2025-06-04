package basic_program;
import java.lang.Math;
public class SteppingNumber {
    public static void main(String[] args){
        int a = 1231, i = 0;
        String str = a +"";

        while(i < str.length() - 1){
            if(Math.abs(str.charAt(i) - str.charAt(i+1)) != 1){
                break;
            }
            i++;
        }
        if(i == str.length()-1){
            System.out.println("Stepping number");
        }
        else{
            System.out.println("Not Stepping Number");
        }


    }
}
