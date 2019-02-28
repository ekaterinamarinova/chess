package chess.piece;

import chess.board.Board;
import chess.board.Spot;

public class Piece<P> {
    private Board board =  Board.getInstance();

    /**
     * in order to obtain access to the positions of a current element on the board,
     * we must have access to the board, therefore we acess all its current spots
     * and their values
     */
    private P piece;

//    private Spot[][] board = b.getBoardSpots();

    private Spot<Piece<P>> spot = new Spot<>();

    private static String COLOR_WHITE = "white";

    private String symbol = spot.getSymbol();

    public void move() {
        //TODO: implement movements
    }

    public void move(Spot[][] currentBoard, int x, int y){

    }

    public void kill() {

    }

    private static void die() {

    }

    public void setPiece(P piece) {
        this.piece = piece;
    }

    public P getPiece() {
        return piece;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setSpot(Spot<Piece<P>> spot) {
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
}
