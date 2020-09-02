package Lanche;

public class Pizza extends Massa {
	private String molho;

	@Override
	public void molho(String molho) {
		this.setMolho(molho);

	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

}
