package chess.piece;

import chess.board.Board;
import chess.board.Spot;

public class Piece<P> {
    private Board board =  Board.getInstance();

    /**
     * in order to obtain access to the positions of a current element on the board,
     * we must have access to the board, therefore we access all its current spots
     * and their values
     */

//    private Spot[][] board = b.getBoardSpots();

    private Spot<Piece> spot = new Spot<>();

    private String color;

    private String symbol = spot.getSymbol();

    public void move() {
        //TODO: implement movements
    }

    public void move(Spot[][] currentBoard){

        for (Spot[] s:currentBoard) {

            for (Spot b : s) {
                System.out.println(b.getPiece().getSymbol());

            }

        }
    }

    public void kill() {

    }

    private static void die() {

    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setSpot(Spot<Piece> spot) {
        this.spot = spot;
    }

    public String getSymbol() {
        return symbol;
    }

    public Spot getSpot() {
        return spot;
    }

    public Board getBoard() {
        return board;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Piece)) {
            return false;
        }

        Piece piece = (Piece) o;

        return  piece.board.equals(board) &&
                piece.spot.equals(spot)  &&
                piece.symbol.equals(symbol);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + board.hashCode();
        result = 31 * result + spot.hashCode();
        result = 31 * result + symbol.hashCode();
        return result;
    }
}
