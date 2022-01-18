package aula7_encapsulamento;

public class Teste {

	public static void main(String[] args) {
		
		Veiculo vei = new Veiculo();
		Veiculo vei2 = new Veiculo();
		Veiculo vei3 = new Veiculo();
		Marca m1 = new Marca(1, "Fiat");
		Marca m2 = new Marca(2, "Honda");
		Marca m3 = new Marca(3, "Ford");
		
		vei.setCodigo(120);
		vei.setModelo("Gol");
		vei.setCor("Azul");
		vei.setPlaca("JLU-3456");
		vei.setValor(35000);
		vei.setMarca(m1);
		
		vei2.setCodigo(30);
		vei2.setModelo("Onix");
		vei2.setCor("Branco");
		vei2.setPlaca("JLU-1126");
		vei2.setValor(55000);
		vei2.setMarca(m2);
		
		vei3.setCodigo(300);
		vei3.setModelo("Nova Strada");
		vei3.setCor("Vermelho");
		vei3.setPlaca("JLU-8826");
		vei3.setValor(75000);
		vei3.setMarca(m3);
				
		System.out.println("O código: "+vei.getCodigo());
		System.out.println("O modelo: "+vei.getModelo());
		System.out.println("A cor: "+vei.getCor());
		System.out.println("A placa: "+vei.getPlaca());
		System.out.println("O valor: R$ "+vei.getValor());
		System.out.println("A marca "+vei.getMarca().getNome());
		
		System.out.println("--------------------------");
		
		System.out.println("O código: "+vei2.getCodigo());
		System.out.println("O modelo: "+vei2.getModelo());
		System.out.println("A cor: "+vei2.getCor());
		System.out.println("A placa: "+vei2.getPlaca());
		System.out.println("O valor: R$ "+vei2.getValor());
		System.out.println("A marca "+vei2.getMarca().getNome());
		
		System.out.println("--------------------------");
		
		System.out.println("O código: "+vei3.getCodigo());
		System.out.println("O modelo: "+vei3.getModelo());
		System.out.println("A cor: "+vei3.getCor());
		System.out.println("A placa: "+vei3.getPlaca());
		System.out.println("O valor: R$ "+vei3.getValor());
		System.out.println("A marca "+vei3.getMarca().getNome());
		
	}

}
