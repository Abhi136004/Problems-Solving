package pattern;

public class EqualateralTriangle {
    public static void main(String[] args) {
       int n = 5;
       for(int i = 1; i <= n; i++){
           int space = n-i;
           for(int k = 1 ; k <= space; k++){
               System.out.print(" ");
            }
           
           for(int j = 1; j <= i; j++){
            System.out.print("* ");
               
           }
           System.out.println();
       }

    }
}
