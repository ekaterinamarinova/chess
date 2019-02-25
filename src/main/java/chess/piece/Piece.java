package chess.piece;

import chess.board.Board;
import chess.board.Spot;

public abstract class Piece<T> {
    private Board b = new Board();

    private Spot[][] board = b.getBoardSpots();

    private Spot spot = new Spot();

    private String color;

    private String symbol = spot.getSymbol();

    public void move(/*Spot[][] currentBoard*/) {
        //TODO: implement movements
    }

    public void kill() {

    }

    private static void die() {

    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setSpot(Spot spot) {
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
}
