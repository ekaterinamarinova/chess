package chess.piece;

import chess.board.Board;
import chess.board.Spot;

public class Piece<P> {
    private Board b = new Board();

    private P piece;

    private Spot[][] board = b.getBoardSpots();

    private Spot<Piece<P>> spot = new Spot<>();

    private String color;

    private String symbol = spot.getSymbol();

    public void move(/*Spot[][] currentBoard*/) {
        //TODO: implement movements
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

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Spot[][] getBoard() {
        return board;
    }
}
