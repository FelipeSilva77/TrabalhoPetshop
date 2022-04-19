package sistemaDeControle;

public class CalculoAtendimentoCachorro extends CalculoValorAtendimento {

	public CalculoAtendimentoCachorro(double tamanho) {
		super(tamanho);
	}
	
	public double calculoTosa() {
			return getTamanho() * 1.0;
	}
	
	public double calculoBanho(){
			return getTamanho() * 1.2;
	}
}
