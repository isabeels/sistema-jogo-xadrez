package boardgame;

public class Piece {

	protected Position position; //nao mostrara essa posicao no tabuleiro
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //pecas criadas nao terao ainda uma posicao
	}

	protected Board getBoard() { //protegido para que somente as classes e subclasses tenham acesso. Evita erros do programador.
		return board;
	}
	
	
}
