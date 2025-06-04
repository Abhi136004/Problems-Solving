package pattern;
public class HollowSquare {
    public static void main(String[] args) {
        int n = 10;

        for(int i = 1; i <= n; i++){
           for(int j = 1; j <= n ;j++){
                if((i == 1 && j == 1) || (i == n && j == n)){
                    for(int k = 1; k <= n; k++){
                        System.out.print("* ");
                    }
                }
                if(i > 1 && i < n){
                    if(j == 1 ){
                        System.out.print("*");
                    }
                    else if(j == n){
                        System.out.print(" *");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                
            }
            System.out.println();

        }
    }
    
}
