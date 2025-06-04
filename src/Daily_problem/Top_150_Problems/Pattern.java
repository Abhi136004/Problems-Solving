package Daily_problem.Top_150_Problems;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            int space = i-1;
            int end = n-i+1;
            for(int s = 1;s <= space; s++){
                System.out.print(" ");
            }
            for(int j = 1; j <= end; j++){
                if(i == 1){
                    System.out.print("* ");
                }
                else if(j == 1 || j == end){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
