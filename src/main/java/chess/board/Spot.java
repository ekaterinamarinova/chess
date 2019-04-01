package chess.board;

import chess.piece.Piece;

public class Spot<T> {

    private String symbol;

    private Piece piece;

    public Spot() {
        this.symbol = "| ";
    }

    public Spot(String symbol) {
        this.symbol = symbol;
    }

    public Spot(Piece piece) {
        this.piece = piece;
    }

    public Spot(String symbol, Piece piece) {
        this.symbol = symbol;
        this.piece = piece;
    }

    public Piece<?> setPiece(Piece piece) {
        this.piece = piece;
        return this.piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public boolean setSymbol(String symbol) {
        try {
            this.symbol = symbol;
            return true;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Spot) {
            if (getSymbol().equals(((Spot) o).symbol))
                return true;
        }
        return super.equals(o);
    }
}
