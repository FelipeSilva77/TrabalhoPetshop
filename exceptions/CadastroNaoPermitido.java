package exceptions;

public class CadastroNaoPermitido extends Exception{
	
	public CadastroNaoPermitido() {
		super("O limite de cadastros foi atingido ou esse número de cadastro já existe.");
	}
}
