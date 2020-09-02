package Lanche;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Lanche {
	private final int distancia = 10;
	private int preparo;

	public abstract void calculaTempo(int distancia);

	public void calculaPreco(int quantidade, double preco) {
		double soma = preco * quantidade;

		Locale ptBr = new Locale("pt", "BR");
		String valor = NumberFormat.getCurrencyInstance(ptBr).format(soma);

		System.out.println("Total: " + valor);
	}

	public void tempoPreparo(int tempo) {
		this.preparo = tempo * this.distancia;
		System.out.println("Tempo de preparo: " + this.preparo + " Minuto(s)");
	}
}
