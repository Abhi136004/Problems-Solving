package Daily_problem.Top_150_Problems;

public class Pattern_P55 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= 2*n; i++){
            int space = 0;
            int end = 0;
            if(i<=n){
                space = n-i;
                end = i;
            }
            else{
                space = i-n-1;
                end = (2*n)-i+1;
            }

            for(int s = 1; s <= space; s++){
                System.out.print(" ");
            }

            for(int j = 1; j <= end; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
