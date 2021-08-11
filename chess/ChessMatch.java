package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Rei;
import chess.pieces.Torre;

public class ChessMatch {
    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
        inicialSetup();
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i<board.getRows(); i++) {
            for (int j=0; j<board.getColumns();j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    private void inicialSetup(){
        placeNewPiece('A', 8, new Torre(board, Color.BLACK));
        placeNewPiece('H', 8, new Torre(board, Color.BLACK));
        placeNewPiece('E', 8, new Rei(board, Color.BLACK));

        placeNewPiece('A', 1, new Torre(board, Color.WHITE));
        placeNewPiece('H', 1, new Torre(board, Color.WHITE));
        placeNewPiece('E', 1, new Rei(board, Color.WHITE));
        
        
    }
}
