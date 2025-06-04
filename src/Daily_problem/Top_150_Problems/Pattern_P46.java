package Daily_problem.Top_150_Problems;

public class Pattern_P46 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j >= i){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
