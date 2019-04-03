package chess.board;

import chess.piece.Piece;
import chess.piece.Rook;
import chess.util.Colors;

public class Board {

    private static Spot[][] spots = new Spot[8][8];

    private Rook[] rooks = new Rook[15];

    private static Board instance;

    private Board(){}

    static {
        try {
            instance = new Board();
        } catch (Exception e) {
            throw  new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static Board getInstance() {
        return instance;
    }

    /**
     * Fills the boards' spots
     */
    public static void setBoard() {
        for (int row = 0; row < spots.length; row++) {
            for (int column = 0; column < spots[row].length; column++) {
                Spot<Piece> spot = new Spot<>();
                spot.setPiece(new Piece());

                if (column % 2 != 0) {
                    if (row % 2 != 0) {
                        //fill all uneven columns
                        spots[row][column] = spot;
                        spots[row][column].setSymbol(Colors.BLACK_BACKGROUND_BRIGHT + "  " + Colors.RESET);
                    } else {
                        //fill all even columns
                        spots[row][column] = spot;
                        spots[row][column].setSymbol("  ");
                    }
                } else { //if column is even
                    if (row % 2 == 0) {
                        //fill all uneven columns
                        spots[row][column] = spot;
                        spots[row][column].setSymbol(Colors.BLACK_BACKGROUND_BRIGHT + "  " + Colors.RESET);
                    } else {
                        //fill all even columns
                        spots[row][column] = spot;
                        spots[row][column].setSymbol("  ");
                    }
                }
            }
        }

        fillBoard();
    }

    /**
     * Fills the boards' spots with pieces
     */
    private static void fillBoard() {
        for (int col = 0; col < spots.length; col++) {
            for (int row = 0; row < spots[col].length; row++) {

                /*putting the pieces on the board*/
                if (row == 1 || row == 6) {
                    spots[1][col].setSymbol(Colors.BLUE_UNDERLINED + "P." + Colors.RESET);
                    spots[6][col].setSymbol(Colors.BLACK_UNDERLINED + "P." + Colors.RESET);
                }

                if (row == 0 || row == 7) {
                    /*symbol setting*/
                    spots[row][0].setSymbol("R.");
                    spots[row][7].setSymbol("R.");

                    //TODO: Set the pieces objects to their spots
                    //TODO: Set colors trough the setter of the Piece object, in the color field
                    spots[row][1].setSymbol(Colors.YELLOW + "B." + Colors.RESET);
                    spots[row][6].setSymbol(Colors.YELLOW + "B." + Colors.RESET);

                    spots[row][2].setSymbol(Colors.PURPLE + "H." + Colors.RESET);
                    spots[row][5].setSymbol(Colors.PURPLE + "H." + Colors.RESET);

                    spots[row][3].setSymbol(Colors.CYAN + "Q." + Colors.RESET);
                    spots[row][4].setSymbol(Colors.RED + "K." + Colors.RESET);
                }
            }
        }
    }

    /**
     * Prints the board in the terminal
     */
    public static void printBoard() {

        //Create the top of X-axis
        System.out.println(Colors.GREEN + "  A B C D E F G H  " + Colors.RESET);

        //Creating the Y-axis
        for (int row = 0; row < spots.length; row++) {
            //print the left column
            System.out.print(row + 1 + "|");

            //print the free middle space
            for (int col = 0; col < spots[row].length; col++) {
                System.out.print(spots[row][col].getSymbol());
            }
            //print the right column
            System.out.println("|" + (row + 1));
        }

        System.out.println(Colors.GREEN + "  A B C D E F G H  " + Colors.RESET);
    }

    public Spot[][] getBoardSpots() {
        return spots;
    }

    //test
//    public static void move() {
////        Piece p = spots[0][0].getPiece();
////        p.move(spots, 1, 1, 0,0);
////        System.out.println(p.getSymbol());
//        Piece p = new Piece();
//        p.move(spots);
//    }
}
