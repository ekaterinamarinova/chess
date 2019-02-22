package chess.piece;

import chess.board.Spot;

public abstract class Piece {

    private Spot spot = new Spot();

    private String symbol = spot.getSymbol();

    public void move() {
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
}
