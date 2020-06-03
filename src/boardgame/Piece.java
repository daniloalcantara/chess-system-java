package boardgame;

public class Piece {

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

	protected Board getBoard() {
		return board;
	}

	
	
	
}
