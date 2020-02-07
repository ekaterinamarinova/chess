import chess.board.Board;
import chess.piece.Piece;
import org.junit.Test;

public class MovementTest {

    Piece piece = new Piece();

    Board board = Board.getInstance();

    @Test
    public void testMovement() {
        board.initBoard();
        //TODO: Set the symbol from the Piece class not Spot
        piece.move(board.getBoardSpots(), 0,0,5,1);
        board.printBoard();
    }
}
