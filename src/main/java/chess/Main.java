package chess;

import chess.board.Board;

/**
 * A chess application, designed to be played in the terminal.
 *
 * Documentation on the symbols for the pieces:
 *
 * @see chess.piece.Piece  - the abstract class that specifies common properties for all the pieces
 * @see chess.piece.Pawn   - the symbol is P
 * @see chess.piece.Bishop - the symbol is B
 * @see chess.piece.Knight - the symbol is H
 * @see chess.piece.Rook   - the symbol is R
 * @see chess.piece.King   - the symbol is K
 * @see chess.piece.Queen  - the symbol is Q
 *
 * @author Ekaterina Marinova
 * @version 1.0.ButNotExactly
 */
public class Main {
    public static void main(String[] args) {
        Board.setBoard();
       // Board.move();
        Board.printBoard();
    }
}