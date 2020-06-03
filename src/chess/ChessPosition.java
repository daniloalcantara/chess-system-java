package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Erro ao criar uma posicao de xadrez valida");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	// converte uma posicao de matriz para uma posicao de xadrez
	protected Position toPosition () {
		return new Position (8 - row, column - 'a');
	}
	
	// converte uma posicao de xadrez para uma posicao de matriz
		protected static ChessPosition FromPosition (Position position) {
			return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
		}
	
		@Override
		public String toString() {
			return "" + column + row;
		}

}
