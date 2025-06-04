package recursion;

public class Nqueens {
    public static void main(String[] args){
        int n = 4;
        boolean[][] board = new boolean[n][n];

        queens(board, 0);
        queens1(board, 0, 0, 4);
    } 
    // using loops
    static void queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return;
        }
        for(int col = 0; col < board[row].length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                queens(board, row+1);
                board[row][col] = false;
            }
        }

    }

    static boolean isSafe(boolean[][] board, int row, int col){
        for(int i = 1; i <= row; i++){
            if(board[row-i][col] == true){
                return false;
            }
        }

        int maxLeft = Math.min(row, col);
        for(int i = 0; i <= maxLeft; i++){
            if(board[row - i][col-i] == true){
                return false;
            }
        }

        int maxRight = Math.min(row, board[row].length-col-1);
        for(int i = 0; i <= maxRight; i++){
            if(board[row - i][col+i] == true){
                return false;
            }
        }
        return true;

    }
    static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    //without loops
    static void queens1(boolean[][] board, int row, int col, int target){
        if(target == 0){
            display(board);
            System.out.println();
            return;
        }
        if(row == board.length ||  col == board.length){
            return;
        }
       

        if(isSafe(board,row,col)){
            board[row][col] = true;
            queens1(board, row+1, 0, target-1);
            board[row][col] = false;
        }
        queens1(board, row, col + 1, target);
    }

    
}
