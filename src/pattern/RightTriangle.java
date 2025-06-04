package pattern;

public class RightTriangle {
    public static void main(String[] args){
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        right(n,0);
    }

    static void right(int r, int c){
        if(r==0){
            return;
        }
        if(c < r){ 
            right(r,c+1);
            System.out.print("* ");
        }
        else{
            
            right(r-1,0);
            System.out.println();
        }
    }
}
