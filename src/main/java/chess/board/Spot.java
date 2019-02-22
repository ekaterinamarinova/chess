package chess.board;

import chess.piece.Piece;
import com.sun.istack.internal.NotNull;

public class Spot {

    private String symbol;

    private Piece piece;

    public Spot(){
        this.symbol = "|_|";
    }

    public Spot(String symbol) {
        this.symbol = symbol;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
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
    public boolean equals(@NotNull Object o) {
        if (o instanceof Spot) {
           if (getSymbol().equals(((Spot) o).symbol))
               return true;
        }
        return super.equals(o);
    }
}
