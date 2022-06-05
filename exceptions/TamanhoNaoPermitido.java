package exceptions;

public class TamanhoNaoPermitido extends Exception {
	public TamanhoNaoPermitido() {
		super("Não trabalhamos com animais desse porte.");
	}
}
