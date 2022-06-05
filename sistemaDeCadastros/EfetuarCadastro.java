package sistemaDeCadastros;

import java.util.Scanner;

import exceptions.CadastroNaoExiste;
import exceptions.CadastroNaoPermitido;

public class EfetuarCadastro {
	
	private EfetuarCadastro() {}
	
	private static EfetuarCadastro instance;
	
	public static EfetuarCadastro getInstance() {
		if(instance==null) {
			instance=new EfetuarCadastro();
		}
		return instance;
	}
	
	private VerificacaoDeCadastros verificaCadastro = new VerificacaoDeCadastros();
	static Scanner scan = new Scanner(System.in);
	
	Cadastro c;
	int numeroDaConta;
	boolean resultado;
	double tamanho;
	
	public Cadastro realizarCadastro() throws CadastroNaoPermitido, CadastroNaoExiste {
		System.out.println("Digite o número do cadastro:");
		numeroDaConta = scan.nextInt();
		resultado=verificaCadastro.criarCadastro(numeroDaConta);
		if(resultado==false) {
			throw new CadastroNaoPermitido();
		}
		c=verificaCadastro.armazenaCadastro(numeroDaConta);
		System.out.println("O cadastro foi realizado: "+resultado);
		return c;
	}
}

