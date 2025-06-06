package recursion;
public class sudoku {
    public static void main(String[] args){
        int[][] board = new int[][] {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(solve(board)){
            display(board);
        }
        else{
            System.out.println("not found");
        }
        
    }
    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1; 
        int col = -1;

        boolean isempty = false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 0){
                    row = i; 
                    col = j;
                    isempty = true;
                    break;
                }
            }
            if(isempty){
                break;
            }
        }
        if(!isempty){
            return true;
        }

        for(int num = 1; num <= 9; num++){
            if(isSafe(board, row, col,num)){
                board[row][col] = num;
                if(solve(board)){
                    
                    return true;
                }
                else{
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board, int row, int col, int num){
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == num){
                return false;
            }
        }

        for(int i = 0; i < board.length; i++){
            if(board[i][col] == num){
                return false;
            }
        }

        int  sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for(int i = rowStart; i < rowStart + sqrt; i++){
            for(int j = colStart; j < colStart + sqrt; j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
    static void display(int[][] board){
        for(int[] row : board){
            for(int ele : row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
