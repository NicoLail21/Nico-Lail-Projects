
import java.util.Scanner;


/**
 *
 * @Nico
 */

public class TicTacToeStart {
    private static final int ROW = 3;
    private static final int COL = 3;
    private static final String board[][] = new String[ROW][COL];
    private static String currentPlayer = "X";



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currentPlayer = "X";  // Start with player X

        // Initialize the board with spaces
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                board[i][j] = " ";
            }
        }
        clearBoard();
        display();


        while (true) {
            System.out.println("Current Player: " + currentPlayer);
            int row = SafeInput.getRangedInt(sc, "Enter the row to place your move (0-2): the format will look like 1|2|3| ", 1, 3) -1;
            int col = SafeInput.getRangedInt(sc, "Enter the column to place your move (0-2): the format will look like 1|2|3| ", 1, 3) -1;

            if (isValidMove(row, col)) {
                System.out.println("Valid move");

                // Update the board with the current player (X or O)
                board[row][col] = currentPlayer;

                // Display the board
                display();

                // Check for win using the isWin method
                if (isWin(currentPlayer)) {
                    System.out.println("Player " + currentPlayer + " won!");
                    break;  // End the game
                }
                // Check for tie
                if (isTie()) {
                    System.out.println("It's a tie!");
                    break;  // End the game
                }


                // Switch the player for the next move
                currentPlayer = currentPlayer.equals("X") ? "O" : "X";
            } else {
                System.out.println("Invalid move");
            }
        }
    }







    // Clear the board and set the player to X (since X always moves first)


    /**
     * 	private static void clearBoard()
     * // sets all the board elements to a space
     */
    private static void clearBoard() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                board[i][j] = " ";
            }
        }
    }



    /**private static void display()
     * // shows the Tic Tac Toe current game board*/
    private static void display() {
        System.out.println("|---|---|---|");
        for (int i = 0; i < ROW; i++) {
            System.out.println("| " + board[i][0] + " | " + board[i][1] + " | " + board[i][2] + " |");
        }
        System.out.println("|-----------|");
    }


    /**private static boolean isValidMove(int row, int col)
     * // returns true if there is a space at the given proposed move coordinates*/
    private static boolean isValidMove(int row, int col) {
        if (row < 0 || row >= ROW || col < 0 || col >= COL) {
            return false;
        }
        return board[row][col].equals(" ");
    }





    /**private static boolean isWin(String player)
     * // checks to see if there is a win state on the current board for the specified player (X or O)
     * This method in turn calls three additional helper methods that break down the 3 kinds of wins that are possible.
     */
    private static boolean isWin(String player) {
        return isRowWin(player) || isColWin(player) || isDiagnalWin(player);
    }



    /**private static boolean isColWin(String player)
     * // checks for a col win for specified player only called by isWin()
     */
    private static boolean isColWin(String player) {
        for (int i = 0; i < 3; i++) {
            if (board[0][i].equals(player) && board[1][i].equals(player) && board[2][i].equals(player)) {
                return true;
            }
        }
        return false;
    }



    /**private static boolean isRowWin(String player)
     * // checks for a row win for the specified player only called by isWin()
     */
    private static boolean isRowWin(String player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(player) && board[i][1].equals(player) && board[i][2].equals(player)) {
                return true;
            }
        }
        return false;
    }


    /** private static boolean isDiagnalWin(String player)
     * // checks for a diagonal win for the specified player only called by isWin()
     */
    private static boolean isDiagnalWin(String player) {
        if ((board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player))
                || (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player))) {
            return true;
        }
        return false;
    }



    /**private static boolean isTie()
     * // checks for a tie condition: all spaces on the board are filled OR there is an X and an O
     * in every win vector (i.e. all possible 8 wins are blocked by having both and X and an O in them.)
     */
    private static boolean isTie() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (board[i][j].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }




}
