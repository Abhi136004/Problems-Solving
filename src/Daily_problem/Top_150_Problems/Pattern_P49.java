package Daily_problem.Top_150_Problems;

public class Pattern_P49 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(j%2 == 0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
