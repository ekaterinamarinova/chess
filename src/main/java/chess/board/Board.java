package chess.board;

public class Board {
    private static Spot[][] spots = new Spot[8][8];

    public static void main(String[] args) {
        printBoard();
    }

    /**
     * Fills the boards' spots
     */
    public static void setBoard() {

        for (int row = 0; row < spots.length; row++) {
            for (int column = 0; column < spots[row].length; column++) {
                Spot spot = new Spot();

                /*creating an empty board first*/
                if (column % 2 != 0) {
                    spots[row][column] = spot;
                    spots[row][column].setSymbol("X");
                } else {
                    spots[row][column] = spot;
                    spots[row][column].setSymbol("|_|");
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

    public Spot[][] getSpots() {
        return spots;
    }
}
