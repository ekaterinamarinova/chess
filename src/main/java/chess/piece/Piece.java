package chess.piece;

import chess.board.Board;
import chess.board.Spot;

public class Piece {

    public Piece() {

    }

    private Board board =  Board.getInstance();

    private Spot spot;

    private String color;

    private String symbol;

    public void move() {

    }

    public void move(Spot[][] currentBoard, int oldX, int oldY , int newX, int newY){

        Spot oldSpot = currentBoard[oldX][oldY];
        Spot newSpot = currentBoard[newX][newY];

        Piece p = new Piece();
        //this should be done in the time of initialization of the array
        //but for the purpose of working it's here so
        oldSpot.setPiece(p);
        //set and print the piece on the old spot
        System.out.println("Old spot piece: " + currentBoard[oldX][oldY].getPiece().hashCode());
        System.out.println("Old spot piece2: " + oldSpot.getPiece().hashCode());
        //remove the piece from the old spot
        currentBoard[oldX][oldY].setPiece(new Piece());
        oldSpot.setSymbol(" |");
        //set the piece to the new spot
        newSpot.setPiece(p);
        newSpot.setSymbol("N|");

        System.out.println("Old spot symbol: " + oldSpot.getSymbol());
        System.out.println("New spot symbol: " + newSpot.getSymbol());

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
