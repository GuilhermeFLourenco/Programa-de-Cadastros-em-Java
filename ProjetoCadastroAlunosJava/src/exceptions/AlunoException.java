package exceptions;

public class AlunoException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public AlunoException(String erro) {
		super(erro);
	}	

}
