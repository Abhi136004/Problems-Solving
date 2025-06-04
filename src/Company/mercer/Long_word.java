package Company.mercer;

public class Long_word {
    public static void main(String[] args) {
        String str = "internationalization";

        if(str.length() > 10){
            int n = str.length() - 2;
            String ans = str.charAt(0) + "" + n  + "" + str.charAt(str.length() - 1) + "";
            System.out.println(ans);
        }
        else{
            System.out.println(str);
        }
    }
}
