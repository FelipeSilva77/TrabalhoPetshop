package exceptions;

public class LimiteDeCadastrosException extends Exception{
	
	public LimiteDeCadastrosException() {
		super("O limite de cadastros foi atingido.");
	}
}
