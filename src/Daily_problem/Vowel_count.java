package Daily_problem;

public class Vowel_count {
    public static void main(String[] args) {
        String str = "engin&eering c;oll45ege is was!57te";
        str = str.toLowerCase();
        str = str.replaceAll(" ","");
        int v = 0,n = 0,c = 0, s = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                n++;
            }
            else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                v++;
            }
            else if(ch >= 'a' && ch <='z'){
                c++;
            }
            else{
                s++;
            }
        }
        System.out.println("Vowels :" + v);
        System.out.println("consonant : " + c);
        System.out.println("numbers : " + n);
        System.out.println("Special symbols : " + s);

    }
}
