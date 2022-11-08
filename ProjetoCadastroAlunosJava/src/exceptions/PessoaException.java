package exceptions;

public class PessoaException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
    
	public PessoaException(String erro) {
		super(erro);
	}
}
