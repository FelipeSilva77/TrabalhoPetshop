package sistemaDeControle;

public abstract class CalculoValorAtendimento {
	
	private double tamanho;
	
	public CalculoValorAtendimento (double tamanho){
		this.tamanho = tamanho;
	}

	public double getTamanho() {
		return this.tamanho;
	}
	
	
}
