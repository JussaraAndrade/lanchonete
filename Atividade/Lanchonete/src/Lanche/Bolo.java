package Lanche;

public class Bolo extends Lanche{
	private String massa;
	private String recheio;
	private String cobertura;
	private  int tempoPreparo;
	
	public Bolo() {}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	
	@Override
	public void calculaTempo(int distancia) {
		this.tempoPreparo = (distancia * 10) + 10;
		
		if(distancia <= 60) {
			System.out.println("Tempo de entrega: " +this.tempoPreparo+ " Minuto(s)");
		}else {
			System.out.println("Tempo de entrega: " +this.tempoPreparo+ " Hora (s)");
		}	
	}
	
}
