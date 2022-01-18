package aula11_listas;

import java.util.ArrayList;

import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
		
		Produto p;
		Scanner into = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		
		int a=0, b=0, c=0;
		
		do {
			System.out.println("\n#### SISTEMA DE CADASTRO DE PRODUTO - MANFRINE ");
			System.out.println("1 - CADASTRAR ");
			System.out.println("2 - LISTAR ");
			System.out.println("3 - PESQUISAR ");
			System.out.println("4 - EXCLUIR ");
			System.out.println("5 - VENDER ");
			System.out.println("6 - REPOR ESTOQUE");
			System.out.println("\nESCOLHA UMA OPÇÃO: ");
			b = into.nextInt();
			switch (b) {
			case 1:
				p = new Produto();
				System.out.println("\n###CADASTRAR PRODUTO #######");
				System.out.println("Digite a descrição do produto");
				p.setDescricao(into.next());
				System.out.println("Digite a marca do produto");
				p.setMarca(into.next());
				System.out.println("Digite a preço do produto");
				p.setPreco(into.nextDouble());
				System.out.println("Digite a quantidade do produto");
				p.setQtd(into.nextInt());
				produtos.add(p);
				System.out.println("\nProduto cadastrado com sucesso!");
				break;
			case 2:
				
				System.out.println("\n###LISTAR PRODUTO #######");
				for(Produto pro: produtos ) {
					System.out.println("A descrição do produto: "+pro.getDescricao());
					System.out.println("A marca do produto: "+pro.getMarca());
					System.out.println("O preço do produto: R$ "+pro.getPreco());
					System.out.println("A quantidade: "+pro.getQtd());
					System.out.println("----------------------------");
				}
				break;
			case 3:
				System.out.println("\n###PESQUISAR PRODUTO #######");
				
				System.out.println("\nDIGITE A DESCRIÇÃO DO PRODUTO P/ A BUSCA: ");
				String nome = into.next();
				
				for(Produto pro: produtos ) {
					if(pro.getDescricao().equals(nome)) {
						System.out.println("***PRODUTO ENCONTRADO***");
						System.out.println("\nA descrição do produto: "+pro.getDescricao());
						System.out.println("A marca do produto: "+pro.getMarca());
						System.out.println("O preço do produto: R$ "+pro.getPreco());
						System.out.println("A quantidade: "+pro.getQtd()); 
					}
				}
				break;
			case 4:
				System.out.println("\n###EXCLUIR PRODUTO #######");
				
				for(Produto pro: produtos ) {
					System.out.println("A descrição do produto: "+pro.getDescricao());
					System.out.println("A marca do produto: "+pro.getMarca());
					System.out.println("O preço do produto: R$ "+pro.getPreco());
					System.out.println("A quantidade: "+pro.getQtd());
					System.out.println("----------------------------");
				}
				
				System.out.println("\nDIGITE A DESCRIÇÃO DO PRODUTO P/ A EXCLUSÃO: ");
				String nome1 = into.next();
				
				for(Produto pro: produtos ) {
					if(pro.getDescricao().equals(nome1)) {
						System.out.println("***PRODUTO ENCONTRADO***");
						System.out.println("\nA descrição do produto: "+pro.getDescricao());
						produtos.remove(pro);
						System.out.println("\nPRODUTO EXCLUIDO !");
					}// FIM IF
				}//FIM FOR
				
				break;
			case 5:
				System.out.println("\n###VENDER PRODUTO #######");
				
				System.out.println("\nDIGITE A DESCRIÇÃO DO PRODUTO P/ A BUSCA: ");
				String nome2 = into.next();
				
				for(Produto pro: produtos ) {
					if(pro.getDescricao().equals(nome2)) {
						System.out.println("***PRODUTO ENCONTRADO***");
						System.out.println("\nA descrição do produto: "+pro.getDescricao());
						System.out.println("O preço do produto: R$ "+pro.getPreco());
						System.out.println("A quantidade: "+pro.getQtd()); 
						System.out.println("----------------------------");
						
						System.out.println("\nDIGITE A QUANTIDADE: ");
						int x = into.nextInt();
						pro.setQtd(pro.getQtd()-x);
						
						double venda = x * pro.getPreco();
						
						System.out.println("\n@@ O valor da venda deu: R$ "+venda);
						System.out.println("\nA QUANTIDADE em estoque agora é: "+pro.getQtd());
						
					}
				}
				break;
			
			default:
				break;
			}// FIM CASE
			
			System.out.println("\nDigite 1 p/ continuar ou 0 p/ sair: ");
			a = into.nextInt();
		}while(a!=0);
	}//FIM MAIN
}// FIM CLASS
