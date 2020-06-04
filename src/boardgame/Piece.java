package boardgame;

public abstract class Piece {

	// protected pq esta posição não e a posicao do tabuleiro ainda. 
	// E somente uma posicao de matrix
	protected Position position;
	
	// Associacao de uma peca ao tabuleiro, conforme diagrama UML
	private Board board;

	public Piece(Board board) {
		this.board = board;
		
		// posicao de uma peca recem criada
		position = null;
	}
	// metodo getBoard.Protected= de uso interno da camada tabuleiro
	protected Board getBoard() {
		return board;
	}

	public abstract boolean [][] possibleMoves();
	
	public boolean possibleMoves (Position position) {
		return possibleMoves ()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] matriz = possibleMoves();
		for (int i=0; i< matriz.length; i++) {
			for (int j=0 ; j< matriz.length; j++) {
				if (matriz [i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	
}
