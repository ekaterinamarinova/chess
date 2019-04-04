import chess.board.Board;
import chess.piece.Piece;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MovementTest {

//    @Mock
    Piece piece = new Piece();

    Board board = Board.getInstance();

    @Test
    public void testMovement() {
        Board.setBoard();
        //TODO: This movement method is absolute bullshit, fix it
        piece.move(board.getBoardSpots(), 0,0,1,1);
        Board.printBoard();
    }
}
