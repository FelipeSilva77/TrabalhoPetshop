package exceptions;

public class CadastroNaoExiste extends Exception {
	public CadastroNaoExiste() {
		super ("Esse cadastro não existe.");
	}
}
