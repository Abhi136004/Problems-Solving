package recursion;
public class Pattern1{
    public static void main(String[] args){
        int n = 4;

       pattern(n);
    }
    static void pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                open(j, "{");
                open(j, "}");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void open(int n, String s){
        for(int k = 0; k < n; k++){
            System.out.print(s);
        }
    }

    
}