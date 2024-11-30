public class Revision{
    public static void nqueen(char board[][],int row){
        if(row== board.length){
            print(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            nqueen(board,row+1);
            board[row][j]='Q';
        }
    }
    public static void print(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
        System.out.println("-------------------");
    }

    public static void main(String args[]){
        int n=3;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nqueen(board,0);
        
    }
}