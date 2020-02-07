package chess.board;

import chess.constant.Constants;
import chess.piece.Piece;

import java.util.Objects;

public class Spot {

    private String symbol;

    private Piece piece;

    public Spot() {
        this.symbol = Constants.LONG_BAR + Constants.SPACE;
    }

    public Piece setPiece(Piece piece) {
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spot spot = (Spot) o;
        return Objects.equals(symbol, spot.symbol) &&
                Objects.equals(piece, spot.piece);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, piece);
    }
}
