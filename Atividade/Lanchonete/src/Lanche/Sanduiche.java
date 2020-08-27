package Lanche;

public class Sanduiche extends Lanche{
	private String[] ingredientes = new String[10];
	private  int tempoPreparo;
	
	@Override
	public void calculaTempo(int distancia) {
		this.tempoPreparo = (distancia * 10) + 15;
			
		if(distancia <= 60) {
			System.out.println("Tempo de entrega: " +this.tempoPreparo+ " Minuto(s)");
		}else {
			System.out.println("Tempo de entrega: " +this.tempoPreparo+ " Hora (s)");
		}
		
	}
	public String[] getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	
}
