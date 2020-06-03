package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] matriz_pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		matriz_pieces = new Piece[rows][columns];
		
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece (int row, int column) {
		return matriz_pieces[row][column];
	}
	
	public Piece piece (Position position) {
		return matriz_pieces [position.getRow()] [position.getColumn()];
	}
	// metodo  coloca uma peca no tabuleiro
	public void placePiece(Piece piece, Position position) {
		matriz_pieces[position.getRow()][position.getColumn()]=piece;
		piece.position = position;
	}

}
