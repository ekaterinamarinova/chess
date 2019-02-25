package chess.board;

import chess.util.Colors;

public class Board {
    private static Spot[][] spots = new Spot[8][8];

    /**
     * Fills the boards' spots
     */
    private static void setBoard() {
        for (int row = 0; row < spots.length; row++) {
            for (int column = 0; column < spots[row].length; column++) {
                Spot spot = new Spot();
                int currentElementIndex = column;

                if (column % 2 != 0) {
                    if (row % 2 != 0) {
                        //fill all uneven columns
                        spots[row][currentElementIndex] = spot;
                        spots[row][currentElementIndex].setSymbol(Colors.BLACK_BACKGROUND_BRIGHT+"  "+Colors.RESET);
                    } else {
                        //fill all even columns
                        spots[row][currentElementIndex] = spot;
                        spots[row][currentElementIndex].setSymbol("  ");
                    }
                } else { //if column is even
                    if (row % 2 == 0) {
                        //fill all uneven columns
                        spots[row][currentElementIndex] = spot;
                        spots[row][currentElementIndex].setSymbol(Colors.BLACK_BACKGROUND_BRIGHT+"  "+Colors.RESET);
                    } else {
                        //fill all even columns
                        spots[row][currentElementIndex] = spot;
                        spots[row][currentElementIndex].setSymbol("  ");
                    }
                }
            }
        }

        fillBoard();
    }

    /**
     * Fills the boards' spots with pieces
     */
    public static void fillBoard() {
        for (int col = 0; col < spots.length; col++) {
            for (int row = 0; row < spots[col].length; row++) {

                /*putting the pieces on the board*/
                if (row == 1 || row == 6) {
                    spots[1][col].setSymbol(Colors.BLUE_UNDERLINED +"P."+ Colors.RESET);
                    spots[6][col].setSymbol(Colors.BLACK_UNDERLINED +"P." + Colors.RESET);
                }

                if (row == 0 || row == 7) {
                    /*symbol setting*/
                    spots[row][0].setSymbol("R.");
                    spots[row][7].setSymbol("R.");

                    spots[row][1].setSymbol(Colors.YELLOW + "B." + Colors.RESET);
                    spots[row][6].setSymbol(Colors.YELLOW + "B." + Colors.RESET);

                    spots[row][2].setSymbol(Colors.PURPLE + "H." + Colors.RESET);
                    spots[row][5].setSymbol(Colors.PURPLE + "H." + Colors.RESET);

                    spots[row][3].setSymbol(Colors.CYAN + "Q." + Colors.RESET);
                    spots[row][4].setSymbol(Colors.RED + "K." + Colors.RESET);

                    /*color setting*/
                }
            }
        }
    }

    /**
     * Prints the board in the terminal
     */
    public static void printBoard() {
        setBoard();
        //Create the top of X-axis
        System.out.println(Colors.GREEN_UNDERLINED + "  A B C D E F G H  " + Colors.RESET);

        //Creating the Y-axis
        for (int row = 0; row < spots.length; row++) {
            //print the left column
            System.out.print(row + 1 + "|");

            //print the free middle space
            for (int col = 0; col < spots[row].length; col++) {
                System.out.print(spots[row][col].getSymbol());
            }
            //print the right column
            System.out.println("|"+ (row + 1));
        }

        System.out.println(Colors.GREEN_UNDERLINED + "  A B C D E F G H  " + Colors.RESET);
    }

    public Spot[][] getBoardSpots() {
        return spots;
    }
}
