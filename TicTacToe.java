import java.util.*;
public class TicTacToe{
    public static void main(String[] args) {
        char[] [] gameBoard = new char [3] [3];
        boolean gameIsOver = false;
        char player = 'X';
       
        for(int row=0 ; row <  gameBoard.length ; row++){
            for( int col = 0 ; col < gameBoard[row].length ; col++){
                gameBoard[row][col]= ' ';
            }
        }
        printBoard(gameBoard);
        Scanner sc = new Scanner(System.in);

        while(!gameIsOver){
            
           
            System.out.println(player + " Turn " + ":");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(gameBoard[row][col] ==' '){
                gameBoard[row][col] = player;
                gameIsOver = PlayerHasWon(gameBoard, player);

                if(gameIsOver){
                    System.out.println(player + " Has Won" );
                }else{
                    player = (player == 'X')?'O' : 'X';
                }
            }else{
                System.out.println("Invalid move do again" );
            }
            System.out.println();
            printBoard(gameBoard);
        }
        
    }


    public static boolean PlayerHasWon(char[][] gameBoard , char player){
        for(int row = 0 ; row < gameBoard.length ; row++){
            if(gameBoard[row][0] == player && gameBoard[row][1] == player && gameBoard[row][2] == player){
                return true;
            }
        }

        for(int col = 0 ; col < gameBoard[0].length ; col++){
            if(gameBoard[0][col] == player && gameBoard[1][col] == player && gameBoard[2][col] == player){
                return true;
            }
        }

        if (gameBoard[0][0] == player && gameBoard[1][1] == player && gameBoard[2][2] == player) {
            return true;
          }
      
          if (gameBoard[0][2] == player && gameBoard[1][1] == player && gameBoard[2][0] == player) {
            return true;
          }

        

        return false;
    }
    public static void printBoard(char[][] gameBoard){

        for(int row=0 ; row <  gameBoard.length ; row++){
            for( int col = 0 ; col < gameBoard[row].length ; col++){
               System.out.print(   gameBoard[row][col] + "|" );
            }
            System.out.println();
        }
           

    }
}