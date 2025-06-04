package recursion;
import java.util.ArrayList;
public class PalindromeRecursion{
    public static void main(String[] args){
        String str = "abbac";
        palrecursion("",str);
    }
    static void pal(String str){
        ArrayList<Character> characters = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();

        for(char ch : str.toCharArray()){
            int index = characters.indexOf(ch);

            if(index != -1){
                count.set(index, count.get(index) + 1);
            }
            else{
                characters.add(ch);
                count.add(1);
            }
        }
        System.out.println(characters);
        System.out.println(count);

        int oddcount = 0;
        for(int i : count){
            if(i % 2 != 0){
                oddcount += 1;
            }
        }
        if(oddcount > 1){
            System.out.println("Cannot form palindrome");
        }
        else{
            System.out.println("Palindrome can be formed");
        }
    }

    
    static void palrecursion(String ans, String str){
        if(str.isEmpty()){
            ispal(ans);
            return;
        }

        char ch = str.charAt(0);
        for(int i = 0; i <= ans.length(); i++){
           String left = ans.substring(0,i);
           String right = ans.substring(i,ans.length());

           palrecursion(left + ch + right , str.substring(1));
        }
    }
    static void ispal(String str){
        int i = 0;
        int j = str.length()-1;
        boolean p = true;
        while(i <= j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else{
                p = false;
                break;
            }
            
        }
        if(p == true){
            System.out.println(str);
        }
    }
}