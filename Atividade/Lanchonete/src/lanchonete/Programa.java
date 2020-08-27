package lanchonete;


import java.util.InputMismatchException;
import java.util.Scanner;

import Lanche.Bolo;
import Lanche.Lanche;
import Lanche.Macarrao;
import Lanche.Massa;
import Lanche.Sanduiche;
import utils.Utils;

public class Programa {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		menu();
		
	}
	public static void menu() {
		
		Lanche lanche = null;
		Macarrao macarrao;

		System.out.println("=========================================");
		System.out.println("=============== Bem-vindo(a) ============");
		System.out.println("===============  Delivery   =============");
		System.out.println("=========================================");
		
		System.out.println("");
		System.out.print("Selecione uma opção abaixo: \n");
		System.out.println("[1] sanducihes");
		System.out.println("[2] bolos");
		System.out.println("[3] massas");
		System.out.println("[4] sair \n");
		
	
		int opcao = 0;
		
		try {
			opcao = teclado.nextInt();
				
		}catch(InputMismatchException e) {
			menu();
		}catch(NumberFormatException f) {
			menu();
		}
		
		switch (opcao) {
		case 1:
			lanche = new Sanduiche();
			sanduiche((Sanduiche) lanche, lanche);
			break;
		case 2:
			lanche = new Bolo();
			bolo((Bolo) lanche, lanche);
			break;
		case 3:
			macarrao = new Macarrao();
			massa((Macarrao) macarrao, lanche, macarrao);
			break;
		case 4:
			System.out.println("Volte sempre!");
			Utils.pausar(2);
			break;
		default:
			System.out.println("Opção inválida");
			Utils.pausar(2);
			menu();
			break;
		}

	}
	
	
	public static void massa(Massa massa, Lanche lanche, Macarrao macarrao) {
		
		String massa_cardapio [] = {"Macarrão", "Pizza", "Lasanha"};
		String molho_cardapio[] = {"Branco", "Tomate", "Cheddar"};
		
		int distancia, quantidade;
		int i = 0;
		String digiteMassa = "";
		String digiteMolho = "";
		String[] ingrediente = new String[2];
		
		double preco;
		
		System.out.println("Você selecionou massa");
		System.out.println("Escolha o seu ingredientes:");
		
		System.out.println("========Cardapio de Massa========");
		
		for(String massas : massa_cardapio) {
			System.out.println(massas);
		}
		
		System.out.println("========Cardapio de Molho========");
		for(String molho : molho_cardapio) {
			System.out.println(molho);
		}
		
		System.out.println("");
		System.out.println("Digite a massa desejada: ");
		
		while(i < 2 && !digiteMassa.equals("0")) {	
			digiteMassa = teclado.nextLine();	
			ingrediente[i] = digiteMassa;
			i++;
		}
		
		massa.escolhaMassa(digiteMassa);
		
		
		System.out.println("Digite o molho desejado: ");
		digiteMolho = teclado.nextLine(); 
		
		macarrao.setMassa(digiteMassa);
		macarrao.setMolho(digiteMolho);
	
		
		System.out.print("Informa o preço: ");
		preco = teclado.nextDouble();
		
		System.out.print("Digite a quantidade: ");
		quantidade = teclado.nextInt();
		
		System.out.print("Informe a sua distância: ");
		distancia = teclado.nextInt();
		
		System.out.println("Por favor, aguarde enquanto fechamos o pedido...");
		Utils.pausar(3);
		
		System.out.println("==========================================");
		System.out.println("======== Informações do Pedido ===========");
		System.out.println("==========================================");
		System.out.println("");
		
		massa.tempoPreparo(distancia);
		massa.calculaTempo(distancia);
	    massa.calculaPreco(quantidade, preco);

		System.out.println();
		
		Utils.pausar(4);
		menu();
	}
		
	public static void sanduiche(Sanduiche lanche, Lanche lancheSanduiche) {
		String[] ingredientes = new String[10];
		String sanduiche_cardapio[] = {"Pão", "Queijo", "Maionese", "Tomate", "Alface", 
										"Ovo", "Peite de Peru", "Cebola", "Picles", "Ketchup"};
		String ingrediente = "";
		int i = 0;
		double preco;
		int distancia, quantidade;
		
		System.out.println("Você selecionou sanduíche");
		System.out.println("Escolha o seu ingredientes: \n");
		
		System.out.println("========Cardapio de ingredientes========");
		for(String sanduiche : sanduiche_cardapio) {
			System.out.println(sanduiche);
		}
		
		System.out.println("");
		System.out.println("Digite o ingrediente desejado: ");
	
		while(i < 10 && !ingrediente.equals("0")) {	
			ingrediente = teclado.nextLine();	
			ingredientes[i] = ingrediente;
			i++;
		}
		
		lanche.setIngredientes(ingredientes);
		
		System.out.print("Informa o preço: ");
		preco = teclado.nextDouble();
				
		System.out.print("Digite a quantidade: ");
		quantidade = teclado.nextInt();
		
		System.out.print("Informe a sua distância: ");
		distancia = teclado.nextInt();
		
		System.out.println("Por favor, aguarde enquanto fechamos o pedido...");
		Utils.pausar(3);
		
		
		System.out.println("==========================================");
		System.out.println("======== Informações do Pedido ===========");
		System.out.println("==========================================");
		System.out.println("");
		
		lancheSanduiche.tempoPreparo(distancia);
		lanche.calculaTempo(distancia);
		lanche.calculaPreco(quantidade, preco);
		
		System.out.println();
		
		Utils.pausar(4);
		menu();
	}
	
	
	public static void bolo(Bolo bolo, Lanche lanche) {
		String massa_cardapio [] = {"Óleo", "Gordura hidrogenada", "Margarina"};
		String recheio_cardapio[] = {"Morango", "Chocolate", "Brigadeiro", "Abacaxi"};
		String coberturas_cardapio [] = {"Leite ninho", "Leite condesado", "Chantilly"};
		
		int distancia, quantidade;
		double preco;
		String ingredientes_recheio = "";
		String ingredientes_cobertura = "";
		String ingredientes_massa = "";
		
		System.out.println("========Cardapio de Massa========");
		for(String massa : massa_cardapio) {
			System.out.println(massa);
		}
		
		
		System.out.println("========Cardapio de Recheio ========");
		for(String recheio : recheio_cardapio) {
			System.out.println(recheio);
		}
		
		System.out.println("========Cardapio de Cobertura ========");
		for(String cobertura : coberturas_cardapio) {
			System.out.println(cobertura);
		}
		
		System.out.println("Você selecionou bolo");
		System.out.println("======Escolha o seu ingredientes======");
		String aux = teclado.nextLine();
	
		System.out.println("Digite a cobertura: ");
		ingredientes_cobertura = teclado.nextLine();	
		
		System.out.println("Digite a massa: ");
		ingredientes_massa = teclado.nextLine();	
		
		System.out.println("Digite o recheio: ");
		ingredientes_recheio = teclado.nextLine();	
		
		bolo.setCobertura(ingredientes_cobertura);
		bolo.setMassa(ingredientes_massa);
		bolo.setRecheio(ingredientes_recheio);
		
		System.out.print("Informa o preço: ");
		preco = teclado.nextDouble();
				
		System.out.print("Digite a quantidade: ");
		quantidade = teclado.nextInt();
		
		System.out.print("Informe a sua distância: ");
		distancia = teclado.nextInt();
		
		System.out.println("Por favor, aguarde enquanto fechamos o pedido...");
		Utils.pausar(3);
		
		System.out.println("==========================================");
		System.out.println("======== Informações do Pedido ===========");
		System.out.println("==========================================");
		System.out.println("");
		
		lanche.tempoPreparo(distancia);
		bolo.calculaTempo(distancia);
		lanche.calculaPreco(quantidade, preco);
		
		System.out.println();
		
		Utils.pausar(3);
		menu();
	}
	

}
