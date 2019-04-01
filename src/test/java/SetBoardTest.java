import chess.board.Board;
import chess.board.Spot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SetBoardTest {

    @Test
    public void setBoardTest() {
        Board.setBoard();
        Spot[][] s = Board.getInstance().getBoardSpots();

        for (Spot[] spot:s) {
            for (Spot spot1:spot) {
                System.out.println(spot1);
            }
        }
    }
}
