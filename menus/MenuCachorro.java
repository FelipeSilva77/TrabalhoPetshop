package menus;

import java.util.Scanner;

import cadastros.SistemaDeCadastros;
import exceptions.LimiteDeCadastrosException;
import exceptions.TamanhoNaoPermitidoException;
import sistemaDeControle.CalculoAtendimentoCachorro;

public class MenuCachorro implements Menu{
	
	static Scanner scan = new Scanner(System.in);
	
	int escolha, numeroDaConta;
	double tamanho;
	boolean resultado;
	
	@Override
	public void Menu() throws LimiteDeCadastrosException, TamanhoNaoPermitidoException {
		do {
		System.out.println("VAMOS CUIDAR DO SEU PET !!!");
		System.out.println();
		System.out.println("Digite 0 - Sair.");
		System.out.println("Digite 1 - Criar o cadastro do seu cachorro.");
		System.out.println("Digite 2 - Marcar o banho do seu cachorro.");
		System.out.println("Digite 3 - Marcar a Tosa do seu cachorro.");
		escolha=scan.nextInt();
		switch(escolha) {
		case 1: 
			try{
				RealizarCadastro();
			} catch(LimiteDeCadastrosException limiteDeCadastrosException) {
				System.out.println(limiteDeCadastrosException.getMessage());
			}
			break;
			case 2: 
				try{
					CalcularBanhoCachorro();
				} catch(TamanhoNaoPermitidoException tamanhoNaoPermitidoException) {
					System.out.println(tamanhoNaoPermitidoException.getMessage());
				}
		    	break;
		    	case 3:
		    		try{
		    			CalcularTosaCachorro();
					}catch(TamanhoNaoPermitidoException tamanhoNaoPermitidoException) {
						System.out.println(tamanhoNaoPermitidoException.getMessage());
					}
		    		break;
		    	        case 0:
		    	        	System.out.println("Programa encerrado.");
		    	        	break;
		    	        default:
		    	            System.out.println("Opção inválida. Digite um dos números do menu.");
		    	                break;
		}
		}while(escolha!=0);
	}

	private void RealizarCadastro() throws LimiteDeCadastrosException {
		SistemaDeCadastros s = new SistemaDeCadastros();
		System.out.println("VAMOS CRIAR O CADASTRO DO SEU CACHORRINHO.");
		System.out.println("Digite o número do cadastro:");
		numeroDaConta = scan.nextInt();
		resultado=s.CriarCadastro(numeroDaConta);
		if(resultado==false) {
			throw new LimiteDeCadastrosException();
		}
		System.out.println("O cadastro foi realizado: "+resultado);
	}

	private void CalcularBanhoCachorro() throws TamanhoNaoPermitidoException {
		System.out.println("Digite o número do cadastro");
		numeroDaConta = scan.nextInt();
		System.out.println("Digite o tamanho do seu cachorro(cm).");
		tamanho = scan.nextDouble();
		if(tamanho<15 || tamanho>110) {
			throw new TamanhoNaoPermitidoException();
		}
		CalculoAtendimentoCachorro valor = new CalculoAtendimentoCachorro(tamanho);
		System.out.println("O valor do banho é "+valor.calculoBanho());
		System.out.println("O banho foi marcado: "+resultado);
	}

	private void CalcularTosaCachorro() throws TamanhoNaoPermitidoException {
		System.out.println("Digite o número do cadastro");
		numeroDaConta = scan.nextInt();
		System.out.println("Digite o tamanho do seu cachorro(cm).");
		tamanho = scan.nextDouble();
		if(tamanho<15 || tamanho>110) {
			throw new TamanhoNaoPermitidoException();
		}
		CalculoAtendimentoCachorro valor = new CalculoAtendimentoCachorro(tamanho);
		System.out.println("O valor da tosa é "+valor.calculoTosa());
		System.out.println("A tosa foi marcada: "+resultado);
	}
	
}
