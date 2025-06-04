package Daily_problem.Top_150_Problems;

public class Patternn_p51 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <=n; i++){
            for(int j = i; j <= n; j++){
                if(i%2 == 0){
                    char ch = (char)('A' + j-i);
                    System.out.print(ch);
                }
                else{
                    char ch = (char)('A' + n-j);
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }
}
