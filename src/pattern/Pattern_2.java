package pattern;

public class Pattern_2{
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i <= n; i++){
            int space = n-i;
            for(int s = 1; s <= space; s++){
                System.out.print(" ");
            }
            int a = i;
            for(int j = 1; j <= 2*i-1; j++){
                if(j <= i){
                    System.out.print(a);
                    if(j < i){
                        a++;
                    }
                }

                if(j > i){
                    
                    System.out.print(--a);
                }
            }
            System.out.println();
        }
    }
}