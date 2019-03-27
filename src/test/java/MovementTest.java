import chess.board.Board;
import chess.board.Spot;
import chess.piece.Piece;
import org.junit.Test;
import org.mockito.Mockito;

public class MovementTest {

    @Test
    public void test() {

        Piece p = Mockito.mock(Piece.class);
        Board b = Mockito.mock(Board.class);
        Board.setBoard();
        Board.spots[0][0] = new Spot();
        Board.spots[1][0] = new Spot();
        Mockito.when(Board.spots[0][0]).thenReturn(Board.spots[0][0]);
       // Mockito.when(b.getBoardSpots()[0][0].getSymbol()).thenReturn(b.getBoardSpots()[1][0].getSymbol());

        p.move(b.getBoardSpots());
        Board.printBoard();
    }
}
