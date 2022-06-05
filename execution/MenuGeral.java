package execution;

import java.util.Scanner;

public class MenuGeral  {
	
	static Scanner s = new Scanner(System.in);
	
	private MenuCachorro menucachorro;
	private MenuGato menugato;
	
	public MenuGeral() {
		this.menucachorro = new MenuCachorro();
		this.menugato = new MenuGato();
	}
	
	public void MenuAnimal() throws Exception {
		int escolha;
		do {
		System.out.println("BEM VINDO AO NOSSO PET SHOP !!!");
		System.out.println();
		System.out.println("Digite 0 - Encerrar o programa");
		System.out.println("Digite 1 - Se seu pet for um Cachorro");
		System.out.println("Digite 2 - Se seu pet for um Gato");
		escolha=s.nextInt();
		
		switch(escolha) {
		case 1:
            menucachorro.Menu();
            break;
            
            case 2:
            menugato.Menu();
            break;
            
            case 0:
            System.out.println("Programa encerrado. Volte sempre.");
            break;
            
            default:
        System.out.println("Op��o inv�lida. Digite um dos n�meros do menu.");
            break;
		}
		
		}while(escolha!=0);
	}
		
}
