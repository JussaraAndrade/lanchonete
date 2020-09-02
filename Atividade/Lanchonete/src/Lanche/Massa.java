package Lanche;

public abstract class Massa extends Lanche {
	private int tempoPreparo;
	private final int distancia = 10;
	private int preparo;
	private String massa;

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public abstract void molho(String molho);

	public void escolhaMassa(String massa) {
		if (massa.equals("pizza") || massa.equals("Pizza")) {
			System.out.println("Você selecionou Pizza");
		}
		if (massa.equals("macarrao") || massa.equals("Macarrao") || massa.equals("Macarrão")
				|| massa.equals("macarrão")) {
			System.out.println("Você selecionou Macarrão");
		}
		if (massa.equals("lasanha") || massa.equals("Lasanha")) {
			System.out.println("Você selecionou Lasanha");
		}
	}

	@Override
	public void calculaTempo(int distancia) {
		this.tempoPreparo = (distancia * 10) + 30;

		if (distancia <= 60) {
			System.out.println("Tempo de entrega: " + this.tempoPreparo + " Minuto(s)");
		} else {
			System.out.println("Tempo de entrega: " + this.tempoPreparo + " Hora (s)");
		}

	}

	@Override
	public void tempoPreparo(int tempo) {
		this.preparo = tempo * this.distancia;

		if (tempo <= 60) {
			System.out.println("Tempo de preparo: " + this.preparo + " Minuto(s)");
		} else {
			System.out.println("Tempo de preparo: " + this.preparo + " Horas(s)");
		}
	}
}
