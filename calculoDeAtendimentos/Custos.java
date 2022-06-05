package calculoDeAtendimentos;

import java.util.Scanner;

import entidades.Animal;
import exceptions.CadastroNaoExiste;
import exceptions.TamanhoNaoPermitido;
import interfaces.CalculoAtendimento;
import sistemaDeCadastros.Cadastro;
import sistemaDeCadastros.VerificacaoDeCadastros;

public class Custos {
	
	private VerificacaoDeCadastros verificaCadastro = new VerificacaoDeCadastros();
	private ExibirFicha exibirFicha = new ExibirFicha();
	static Scanner scan = new Scanner(System.in);
	
	int numeroDaConta;
	boolean resultado;
	double tamanho;

	public void calcularBanho(Animal animal, CalculoAtendimento calculoAtendimento,Cadastro c) throws TamanhoNaoPermitido, CadastroNaoExiste {
		System.out.println("Digite o número do cadastro");
		numeroDaConta = scan.nextInt();
		if(c==null) {
			throw new CadastroNaoExiste();
		}
		if(!verificaCadastro.validaCadastro(numeroDaConta, c)) {
			throw new CadastroNaoExiste();
		}
		exibirFicha.exibicaoDeFicha(animal);
		/*new Ficha((4.0) -> {
            System.out.println ("thread iniciado, índice : " + index +
                " em hora "+ agora + " ");
          }); */
		System.out.println(animal.getSizeMessage());
		tamanho = scan.nextDouble();
		if(tamanho<animal.getMinSize() || tamanho>animal.getMaxSize()) {
			throw new TamanhoNaoPermitido();
		}
		double valor = calculoAtendimento.calculoBanho(tamanho);
		System.out.println("O valor do banho é "+valor+" reais.");
		
	}

	public void calcularTosa(Animal animal, CalculoAtendimento calculoAtendimento,Cadastro c) throws TamanhoNaoPermitido, CadastroNaoExiste {
		System.out.println("Digite o número do cadastro");
		numeroDaConta = scan.nextInt();
		if(!verificaCadastro.validaCadastro(numeroDaConta,c)) {
			throw new CadastroNaoExiste();
		}
		exibirFicha.exibicaoDeFicha(animal);
		System.out.println(animal.getSizeMessage());
		tamanho = scan.nextDouble();
		if(tamanho<animal.getMinSize() || tamanho>animal.getMaxSize()) {
			throw new TamanhoNaoPermitido();
		}
		double valor = calculoAtendimento.calculoTosa(tamanho);
		System.out.println("O valor da tosa é "+valor+" reais.");
		
	}
}

