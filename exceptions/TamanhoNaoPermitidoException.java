package exceptions;

public class TamanhoNaoPermitidoException extends Exception {
	public TamanhoNaoPermitidoException() {
		super("N�o trabalhamos com animais desse porte.");
	}
}
