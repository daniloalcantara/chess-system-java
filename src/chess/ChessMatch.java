package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	// construtor da partida de xadrez
	public ChessMatch() {
		board = new Board (8,8);
		initialSetup();
		
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece [][] matriz = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				matriz [i][j] =(ChessPiece) board.piece(i, j);
			}
		}	
		return matriz;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece,new ChessPosition(column, row).toPosition() );
	}
	
	private void initialSetup() {
		placeNewPiece('a', 1 ,new Rook(board, Color.WHITE));
		board.placePiece(new King(board, Color.WHITE)  , new Position(3, 1));
		
	}
}	
