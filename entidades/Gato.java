package entidades;

public class Gato extends Animal {
	
	public Gato(String nome, double peso, int idade) {
		super(nome, peso, idade);
	}

	@Override
	public String getMessage() {
		return "VAMOS CRIAR O CADASTRO DO SEU GATINHO.";
	}

	@Override
	public String getSizeMessage() {
		return "Digite o tamanho do seu gato(cm).";
	}

	@Override
	public int getMinSize() {
		return 7;
	}

	@Override
	public int getMaxSize() {
		return 40;
	}

}

