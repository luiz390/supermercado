package controle;

import java.util.Scanner;

import entidade.Produto;

public class Estoque {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
	    Produto produto = new Produto();
		
		System.out.println("============================");
		System.out.println("========LOJA PARAISO========");
		System.out.println("============================");
		
		System.out.println("ENTRE COM A OPRAÇÃO");
		System.out.print("NOME DO PROTUDO:  ");
		produto.nome =sc.nextLine();
		System.out.print("PREÇO DO PRODUTO:  ");
		produto.preco =sc.nextDouble();
        System.out.print("QUANTIDADE EM ESTOQUE:  ");
        produto.quantidade = sc.nextInt();
        
        System.out.println(produto.nome +","+ produto.preco +","+ produto.quantidade);
		
	}

}
