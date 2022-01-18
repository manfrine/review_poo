package aula10_interface_classeAbstrata;

public class Teste {

	public static void main(String[] args) {
		
		Celular c = new Celular();
		Tv tv = new Tv();
		
		c.setModelo("S-20");
		c.setFabricante("Samsung");
		c.setCor("Azul");
		c.setQtdMemoria(256);
		
		tv.setModelo("S5000");
		tv.setFabricante("Samsung");
		tv.setPolegadas(70);
		tv.setSmart(0);
		
		c.ligar();
		System.out.println("O modelo do celular: "+c.getModelo());
		System.out.println("A qtd de memória do celular: "+c.getQtdMemoria()+" GB");
		c.tocar();
		c.parar();
		c.desligar();
		
		
		System.out.println("\n");
		tv.ligar();
		System.out.println("\nO modelo da TV: "+tv.getModelo());
		System.out.println("O fabricante da TV: "+tv.getFabricante());
		System.out.println("O tamanho da Tela: "+tv.getPolegadas()+" polegadas");
		if(tv.getSmart()==1) {
			System.out.println("TV smart ");
		}else {
			System.out.println("Está TV não smart ");
		}
		tv.desligar();
		
	}

}
