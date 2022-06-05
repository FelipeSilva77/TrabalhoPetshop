package entidades;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, double peso, int idade) {
		super(nome, peso, idade);
	}

	public String getMessage() {
		return "VAMOS CRIAR O CADASTRO DO SEU CACHORRINHO";
	}

	@Override
	public String getSizeMessage() {
		return "Digite o tamanho do seu cachorro(cm).";
	}

	@Override
	public int getMinSize() {
		return 15;
	}

	@Override
	public int getMaxSize() {
		return 110;
	}

}

