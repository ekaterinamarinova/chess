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


    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;

        if (!(o instanceof Spot)) {
            return false;
        }

        Spot spot = (Spot) o;

        return  spot.piece.equals(piece) &&
                spot.symbol.equals(symbol);

//        if (o instanceof Spot) {
//            if (getSymbol().equals(((Spot) o).symbol))
//                return true;
//        }
//        return super.equals(o);
    }

//    @Override
//    public int hashCode() {
//        int result = 17;
//        result = 31 * result + symbol.hashCode();
//        result = 31 * result + piece.hashCode();
//        return result;
//    }
}
