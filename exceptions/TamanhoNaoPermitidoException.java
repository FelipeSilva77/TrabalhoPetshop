package exceptions;

public class TamanhoNaoPermitidoException extends Exception {
	public TamanhoNaoPermitidoException() {
		super("Não trabalhamos com animais desse porte.");
	}
}
