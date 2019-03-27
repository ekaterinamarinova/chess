import chess.board.Board;
import chess.piece.Piece;
import org.junit.Test;
import org.mockito.Mockito;

public class MovementTest {

    @Test
    public void test() {

        Piece p = Mockito.mock(Piece.class);
        Board b = Mockito.mock(Board.class);
        Board.setBoard();
        p.move(b.getBoardSpots());
        Board.printBoard();
    }
}
