package chess.board;

import chess.constant.Constants;
import chess.piece.Knight;
import chess.piece.Piece;
import chess.piece.Rook;
import chess.util.Colors;

public class Board {

    private static Board instance;

    private Spot[][] spots = new Spot[8][8];
    private Rook[] rooks = new Rook[15];
    private Knight[] knights = new Knight[1];

    static {
        instance = new Board();
    }

    private Board() {

    }

    public static Board getInstance() {
        return instance;
    }

    /**
     * Fills the boards' spots
     */
    public void initBoard() {
        for (int row = 0; row < spots.length; row++) {
            for (int column = 0; column < spots[row].length; column++) {

                Spot spot = new Spot();
                spot.setPiece(new Piece());
                spots[row][column] = spot;

                //if column is uneven
                if (column % 2 != 0) {
                    fillColumn(row,
                            spots[row][column],
                            Constants.SPACE,
                            Colors.BLACK_BACKGROUND_BRIGHT + Constants.SPACE + Colors.RESET
                    );

                } else { //if column is even
                    fillColumn(row,
                            spots[row][column],
                            Colors.BLACK_BACKGROUND_BRIGHT + Constants.SPACE + Colors.RESET,
                            Constants.SPACE
                    );
                }
            }
        }
    }

    private void fillColumn(int rowIndex, Spot spots, String evenSymbol, String unevenSymbol) {
        if (rowIndex % 2 == 0) {
            spots.setSymbol(evenSymbol);
        } else {
            spots.setSymbol(unevenSymbol);
        }
    }

    /**
     * Fills the boards' spots with pieces
     */
    public void fillBoard() {

        for (int col = 0; col < spots.length; col++) {
            for (int row = 0; row < spots[col].length; row++) {

                Spot[] spotRow = spots[row];

                /*putting the pieces on the board*/
                if (row == 1 || row == 6) {
                    spots[1][col].setSymbol(Colors.BLUE_UNDERLINED + "P." + Colors.RESET);
                    spots[6][col].setSymbol(Colors.BLACK_UNDERLINED + "P." + Colors.RESET);
                }

                if (row == 0 || row == 7) {
                    /*symbol setting*/
                    spotRow[0].setSymbol("R.");
                    spotRow[7].setSymbol("R.");

                    //TODO: Set colors trough the setter of the Piece object, in the color field
                    spotRow[1].setSymbol(Colors.YELLOW + "B." + Colors.RESET);
                    spotRow[6].setSymbol(Colors.YELLOW + "B." + Colors.RESET);

                    spotRow[2].setSymbol(Colors.PURPLE + "H." + Colors.RESET);
                    spotRow[5].setSymbol(Colors.PURPLE + "H." + Colors.RESET);

                    spotRow[3].setSymbol(Colors.CYAN + "Q." + Colors.RESET);
                    spotRow[4].setSymbol(Colors.RED + "K." + Colors.RESET);
                }
            }
        }
    }

    /**
     * Prints the board in the terminal
     */
    public void printBoard() {

        //Create the top of X-axis
        System.out.println(Colors.GREEN + Constants.BOARD_LETTERS + Colors.RESET);

        //Creating the Y-axis
        for (int row = 0; row < spots.length; row++) {
            //print the left column
            System.out.print(row + 1 + Constants.LONG_BAR);

            //print the free middle space
            for (int col = 0; col < spots[row].length; col++) {
                System.out.print(spots[row][col].getSymbol());
            }
            //print the right column
            System.out.println(Constants.LONG_BAR + (row + 1));
        }

        System.out.println(Colors.GREEN + Constants.BOARD_LETTERS + Colors.RESET);
    }

    public Spot[][] getBoardSpots() {
        return spots;
    }

}
