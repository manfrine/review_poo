package aula9_polimorfismo;

public class Teste {

	public static void main(String[] args) {
		
		Vendedor ven = new Vendedor();
		Vendedor ven2 = new Vendedor();
		Venlinhabranca vlb = new Venlinhabranca();
		VenCelular vc = new VenCelular();
		
		ven.setNome("Marcos");
		ven.setVendas(9000.0);
		ven.calcComissao();
		ven.calcSalario();
		
		ven2.setNome("Fernanda");
		ven2.setVendas(90000.0);
		ven2.calcComissao(ven.getVendas());
		ven2.calcSalario();
		
		vlb.setNome("Marcelo");
		vlb.setVendas(20000.0);
		vlb.calcComissao();
		vlb.calcSalario();
		
		vc.setNome("Maria");
		vc.setVendas(40000.0);
		vc.calcComissao();
		vc.calcSalario();
		
		System.out.println("O nome: "+ven.getNome());
		System.out.println("As Vendas: R$ "+ven.getVendas());
		System.out.println("A comissão: R$ "+ven.getComissao());
		System.out.println("O salário: R$ "+ven.getSalario());
		
		System.out.println("\nAs Vendas linha branca: R$ "+vlb.getVendas());
		System.out.println("O nome: "+vlb.getNome());
		System.out.println("A comissão: R$ "+vlb.getComissao());
		System.out.println("O salário: R$ "+vlb.getSalario());
		System.out.println("O dia da folga "+vlb.getDiaFolga());
		
		System.out.println("\nAs Vendas Celular: R$ "+vc.getVendas());
		System.out.println("O nome: "+vc.getNome());
		System.out.println("A comissão: R$ "+vc.getComissao());
		System.out.println("O salário: R$ "+vc.getSalario());
		System.out.println("O dia da folga "+vc.getDiaFolga());
		

		System.out.println("\nUm novo vendendor "+ven2.getVendas());
		System.out.println("O nome: "+ven2.getNome());
		System.out.println("A comissão: R$ "+ven2.getComissao());
		System.out.println("O salário: R$ "+ven2.getSalario());
		

	}

}
