package pattern;

public class ReverseRight {
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        reverseRight(n,0);
    }
    static void reverseRight(int r, int c){
        if(r==0){
            return ;
        }
        if(c < r){
            System.out.print("* ");
            reverseRight(r,c+1);
            
        }
        else{
            System.out.println();
            reverseRight(r-1,0);
            
        }
    }
}
