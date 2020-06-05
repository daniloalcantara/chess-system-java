package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "R";
	}
	
	@Override
	public boolean[][] possibleMoves() {
		// matriz de booleanos da mesma dimensao do tabuleiro
		boolean [][] mat = new boolean [getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position (0,0);
	
		//verifica se a peca pode mover para a posicao acima
		p.setValues(position.getRow()-1, position.getColumn());
			while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat [p.getRow()][p.getColumn()] = true;
				p.setRow(p.getRow()-1); 		
			}
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat [p.getRow()][p.getColumn()] = true;	
			}
			
			//verifica se a peca pode mover para a posicao a esquerda
			p.setValues(position.getRow(), position.getColumn()-1);
				while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					mat [p.getRow()][p.getColumn()] = true;
					p.setColumn(p.getColumn()-1); 		
				}
				if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat [p.getRow()][p.getColumn()] = true;	
				}
				
				//verifica se a peca pode mover para a posicao a direita
				p.setValues(position.getRow(), position.getColumn()+1);
				while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					mat [p.getRow()][p.getColumn()] = true;
					p.setColumn(p.getColumn()+1); 		
				}
				if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat [p.getRow()][p.getColumn()] = true;	
				}
				
				//verifica se a peca pode mover para a posicao abaixo
				p.setValues(position.getRow()+1, position.getColumn());
					while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
						mat [p.getRow()][p.getColumn()] = true;
						p.setRow(p.getRow()+1); 		
					}
					if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
						mat [p.getRow()][p.getColumn()] = true;	
					}
		
		
		return mat;
	}
}
