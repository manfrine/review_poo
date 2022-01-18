package aula10_interface_classeAbstrata;

public class Tv extends ProdutoEletronico{

	private int polegadas;
	private int smart = 0;
	
	@Override
	public void ligar() {
		System.out.println("A TV liga com o controle remoto !");
	}
	
	@Override
	public void desligar() {
		System.out.println("A TV desliga com o controle de Voz !");
	}

	public int getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}

	public int getSmart() {
		return smart;
	}

	public void setSmart(int smart) {
		this.smart = smart;
	}
	
	
}
