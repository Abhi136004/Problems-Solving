package Daily_problem;

public class is_identifier {
    public static void main(String[] args) {
        String str = "$Abc12";
        str = str.toLowerCase();
        int i = 0;
        if((str.charAt(0) >= 'a' && str.charAt(0) <= 'z')  || str.charAt(0) == '$' || str.charAt(0) == '_'){
            for(i = 1; i < str.length(); i++){
                char ch = str.charAt(i);
                if(!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch == '_') || (ch == '$'))) {
                    System.out.println("not Valid");
                    break;
                }
            }
        }
        else{
            System.out.println("Not Valid");
        }

        if(i == str.length()){
            System.out.println("Vaild");
        }
    }
}
