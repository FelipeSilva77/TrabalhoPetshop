package calculoDeAtendimentos;

import java.util.Scanner;
import entidades.Animal;

public class ExibirFicha {
	
	static Scanner scan = new Scanner(System.in);
	
	int idade;
	double peso;
	String nome;

	public void exibicaoDeFicha(Animal animal) {
		System.out.println("Qual o nome do seu pet?");
		nome = scan.next();
		System.out.println("Qual o peso(kg) do seu pet?");
		peso = scan.nextDouble();
		System.out.println("Qual a idade do seu pet?");
		idade = scan.nextInt();
		animal.setNome(nome);
		animal.setPeso(peso);
		animal.setIdade(idade);
		
		animal.ficha();
	}
	
	class anonima {
		ExibirFicha dog = new ExibirFicha() {
		public void exibicaoDeFicha(Animal animal) {
			System.out.println("Qual o nome do seu cachorrinho?");
			nome = scan.next();
			System.out.println("Qual o peso(kg) do seu cachorrinho?");
			peso = scan.nextDouble();
			System.out.println("Qual a idade do seu cachorrinho?");
			idade = scan.nextInt();
			animal.setNome(nome);
			animal.setPeso(peso);
			animal.setIdade(idade);
			
			animal.ficha();
		 }
		};
	ExibirFicha cat = new ExibirFicha() {
	public void exibicaoDeFicha(Animal animal) {
		System.out.println("Qual o nome do seu gatinho?");
		nome = scan.next();
		System.out.println("Qual o peso(kg) do seu gatinho?");
		peso = scan.nextDouble();
		System.out.println("Qual a idade do seu gatinho?");
		idade = scan.nextInt();
		animal.setNome(nome);
		animal.setPeso(peso);
		animal.setIdade(idade);
		
		animal.ficha();
	 }
	};
   }
}
