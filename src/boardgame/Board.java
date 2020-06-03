package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] matriz_pieces;
	
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Erro ao criar tabuleiro: deve existir ao menos 1 linha e 1 coluna");
		}
		this.rows = rows;
		this.columns = columns;
		matriz_pieces = new Piece[rows][columns];		
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece (int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Posicao nao existe no tabuleiro");
		}
		return matriz_pieces[row][column];
	}
	
	public Piece piece (Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posicao nao existe no tabuleiro");
		}
		return matriz_pieces [position.getRow()] [position.getColumn()];
	}
	
	
	// metodo  coloca uma peca no tabuleiro
	public void placePiece(Piece piece, Position position) {
		// testa se ja existe uma peca nesta posicao
		if (thereIsAPiece(position)) {
			throw new BoardException("ja existe uma peca nesta posicao" + position);
		}
		
		matriz_pieces[position.getRow()][position.getColumn()]=piece;
		piece.position = position;
	}
	
	// metodo  remove uma peca no tabuleiro
		public Piece removePiece(Position position) {
			if (!positionExists(position)) {
				throw new BoardException("posicao nao existe no tabuleiro");
				}
			if (piece(position)== null) {
				return null;
			}
			Piece aux = piece(position);
			aux.position = null;
			matriz_pieces[position.getRow()][position.getColumn()] = null;
			return aux;
		}
	
	private boolean positionExists(int row, int column) {
		return row >=0 && row < rows && column >=0 && column < columns;
	}
	
	private boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn()) ;
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posicao nao existe no tabuleiro");
		}
		return piece(position)!= null;
	}

}
