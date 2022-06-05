package execution;

import java.util.Scanner;

import calculoDeAtendimentos.Custos;
import entidades.Animal;
import exceptions.CadastroNaoExiste;
import exceptions.CadastroNaoPermitido;
import exceptions.TamanhoNaoPermitido;
import interfaces.CalculoAtendimento;
import sistemaDeCadastros.Cadastro;

public class Execucao {
	
	static Scanner scan = new Scanner(System.in);
	int escolha;
	public static void main(String[] args) throws Exception {
		MenuGeral menuAnimal = new MenuGeral();
		menuAnimal.menuAnimal();
	}
	
	public void getMenu(Animal animal,CalculoAtendimento calculoAtendimento,Cadastro c) throws CadastroNaoPermitido, TamanhoNaoPermitido, CadastroNaoExiste {
		do {
			Custos custos = new Custos(); 
			System.out.println("VAMOS CUIDAR DO SEU PET !!!");
			System.out.println();
			System.out.println("Digite 0 - Sair.");
			System.out.println("Digite 1 - Marcar o banho.");
			System.out.println("Digite 2 - Marcar a Tosa.");
			escolha=scan.nextInt();
			switch(escolha) {
			case 1: 
				try{
					custos.calcularBanho(animal, calculoAtendimento,c);
				}catch(TamanhoNaoPermitido tamanhoNaoPermitidoException) {
					System.out.println(tamanhoNaoPermitidoException.getMessage());
				} catch(CadastroNaoExiste cadastroNaoExiste) {
					System.out.println(cadastroNaoExiste.getMessage());
				}
				break;
			case 2: 
				try{
					custos.calcularTosa(animal, calculoAtendimento,c);
				}catch(TamanhoNaoPermitido tamanhoNaoPermitidoException) {
					System.out.println(tamanhoNaoPermitidoException.getMessage());
				} catch(CadastroNaoExiste cadastroNaoExiste) {
					System.out.println(cadastroNaoExiste.getMessage());
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
}

