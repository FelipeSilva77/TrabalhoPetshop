package cadastros;

import exceptions.CadastroNaoPermitido;

public class SistemaDeCadastros {
	
	private Cadastro[] cadastros;
	private int contadorDeCadastros;
	
	public SistemaDeCadastros() {
		cadastros = new Cadastro [50];
		contadorDeCadastros = 0;
	}
	
	public boolean CriarCadastro(int numero) throws CadastroNaoPermitido {
		for(Cadastro novoCadastro : cadastros) {
			if(novoCadastro != null && novoCadastro.getNumero()==numero) {
				return false;
			}
		}			
		        Cadastro cadastro= new Cadastro(numero);
				cadastros[contadorDeCadastros]=cadastro;
				contadorDeCadastros++;
				if(contadorDeCadastros>cadastros.length) {
					return false;
			    }
		return true;
	}
	
	
	public boolean BanhoAndTosa(int numero) {
		for(Cadastro isMyCount : this.cadastros) {
			if(isMyCount!=null && isMyCount.getNumero()==numero) {
				
				return true;
			}
		}

        	return false;
        
	}
}
