package pattern;

public class pattern_3 {
    public static void main(String[] args){
        int n = 4;
        for(int i = 1; i <= n ; i++){
            int a= 1;
            for(int j = 1; j <= n; j++){
                if(j <= n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print(a);
                    a++;
                }
            }
            System.out.println();
        }
    }
}
