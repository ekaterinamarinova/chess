import chess.board.Board;
import chess.piece.Piece;
import org.junit.Test;

public class MovementTest {

    @Test
    public void test() {
        Piece p = new Piece();
        Board b = Board.getInstance();
        Board.setBoard();
        p.move(b.getBoardSpots());
    }
}
