package chess.piece;

import chess.board.Spot;

/**
 * A bishop can only move diagonally, either forwards or backwards
 */
public class Bishop extends Piece {
    //moving in diagonal way means, when given x and y coordinates to move to,
    //you have to check whether the spot with x and y coordinates can be reached
    //by gradually moving the current piece with either:
    // /x+1, y+1/, /x-1, y-1/, /x-1, y+1/, /x+1, y-1/;


//    @Override
//    public void move(Spot[][] currentBoard, int newX, int newY, int oldX, int oldY) {
//        super.move(currentBoard, newX, newY, oldX, oldY);
//    }
}
