package sistemaDeCadastros;

import exceptions.CadastroNaoPermitido;

public class VerificacaoDeCadastros {

	public Cadastro[] cadastros;
	private int contadorDeCadastros;

	public VerificacaoDeCadastros() {
		cadastros = new Cadastro [10];
		contadorDeCadastros = 0;
	}

	public boolean criarCadastro(int numero) throws CadastroNaoPermitido {
			for(Cadastro novoCadastro : cadastros) {
				if(novoCadastro != null && novoCadastro.getNumero()==numero) {
					return false;
				}
			}			
			if(contadorDeCadastros>=cadastros.length) {
				return false;
			}
		Cadastro cadastro= new Cadastro(numero);
		cadastros[contadorDeCadastros]=cadastro;
		contadorDeCadastros++;
		return true;
	}
	
	public Cadastro armazenaCadastro(int numero) throws CadastroNaoPermitido {
		Cadastro cadastro= new Cadastro(numero);
		cadastros[contadorDeCadastros]=cadastro;
		contadorDeCadastros++;
		return cadastro;
	}

	public boolean validaCadastro(int numero, Cadastro c) {
			if(numero==c.getNumero()) {
				return true;
			}
		return false;
	}
}