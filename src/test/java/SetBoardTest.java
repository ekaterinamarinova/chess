import chess.board.Board;
import chess.board.Spot;
import org.junit.Test;

public class SetBoardTest {

    @Test
    public void setBoardTest() {
        Board board = Board.getInstance();
        board.initBoard();
        Spot[][] s = Board.getInstance().getBoardSpots();

        for (Spot[] spot:s) {
            for (Spot spot1:spot) {
                System.out.println(spot1);
            }
        }
    }
}
