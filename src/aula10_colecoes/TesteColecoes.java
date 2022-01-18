package aula10_colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteColecoes {

	public static void main(String[] args) {
		
		Produto p = new Produto();
		List<Produto> listaProduto = new ArrayList<Produto>();

		Scanner into = new Scanner(System.in);
		
		int a = 0 , b = 0 , c = 0;
		
		do {
			System.out.println("\n### SISTEMA FAMETRO #####");
			System.out.println("1 - CADASTRAR");
			System.out.println("2 - LISTAR");
			System.out.println("3 - PESQUISAR");
			System.out.println("4 - EXCLUIR");
			System.out.println("\n ESCOLHA UMA OPÇÃO: ");
			b = into.nextInt();
			switch (b) {
			case 1:
				System.out.println("\n#### CADASTRAR PRODUTO #####: ");
				System.out.println("DIGITE O NOME DO PRODUTO ");
				p.setNome(into.next());
				System.out.println("DIGITE O VALOR DO PRODUTO ");
				p.setValor(into.nextDouble());
				System.out.println("DIGITE O ESTOQUE DO PRODUTO ");
				p.setQtd(into.nextInt());
				c++;
				p.setId(c);
				
				listaProduto.add(p);
				System.out.println("\nPRODUTO SALVO COM SUCESSO !");
				break;
			
			case 2:
				System.out.println("\n#### LISTAR PRODUTO #####: ");
				
				for(Produto pro: listaProduto){
					System.out.println("O código: "+pro.getId());
					System.out.println("O nome: "+pro.getNome());
					System.out.println("O valor: R$ "+pro.getValor());
					System.out.println("O estoque: "+pro.getQtd());
					System.out.println("------------------------------------");
				}
				
				break;

			case 3:
				System.out.println("\n#### Buscar um produto #####: ");
				System.out.println("\nDigite  o codigo do produto !");
				int d = into.nextInt();
				Produto pro = listaProduto.get(d);
				
				System.out.println("O código: "+pro.getId());
				System.out.println("O nome: "+pro.getNome());
				System.out.println("O valor: R$ "+pro.getValor());
				System.out.println("O estoque: "+pro.getQtd());
				
				break;
			case 4:
				System.out.println("\n#### EXCLUIR #####: ");
			
				System.out.println("\nDigite  o codigo do produto !");
				int e = into.nextInt();
				
				listaProduto.remove(e);
				
				System.out.println("\nProduto Excluído !");
				
				break;
				
			default:
				System.out.println("\nEsta Funcionalidade está em construção !");
				break;
			}
			
			System.out.println("\nDigite 1 p/ continuar ou 0 p/ sair !");
			a = into.nextInt();
		}while(a != 0);
		
	}

}
