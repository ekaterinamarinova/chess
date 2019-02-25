package chess.board;

public class Board {
    private static Spot[][] spots = new Spot[8][8];

    /**
     * Fills the boards' spots
     */
    private static void setBoard() {
        for (int row = 0; row < spots.length; row++) {
            for (int column = 0; column < spots[row].length; column++) {
                Spot spot = new Spot();

                /*creating an empty board first*/
                if (column % 2 != 0) {
                    spots[row][column] = spot;
                    spots[row][column].setSymbol("X");
                } else {
                    spots[row][column] = spot;
                    spots[row][column].setSymbol("| |");
                }
            }
        }

        for (int col = 0; col < spots.length; col++) {
            for (int row = 0; row < spots[col].length; row++) {

                ///*putting the pieces on the board*/
                if (row == 1 || row == 6) {
                    spots[row][col].setSymbol("|P");
                }

                if (row == 0 || row == 7) {
                    spots[row][0].setSymbol("|R");
                    spots[row][7].setSymbol("|R");

                    spots[row][1].setSymbol("|B");
                    spots[row][6].setSymbol("|B");

                    spots[row][2].setSymbol("|H");
                    spots[row][5].setSymbol("|H");

                    spots[row][3].setSymbol("|Q");
                    spots[row][4].setSymbol("|K");

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
        System.out.println("  A B C D E F G H  ");

        //Creating the Y-axis
        for (int row = 0; row < spots.length; row++) {
            //print the left column
            System.out.print(row + 1);

            //print the free middle space
            for (int col = 0; col < spots[row].length; col++) {
                System.out.print(spots[row][col].getSymbol());
            }
            //print the right column
            System.out.print("|");
            System.out.println(row + 1);
        }

        System.out.println("  A B C D E F G H  ");
    }

    public Spot[][] getBoardSpots() {
        return spots;
    }
}
