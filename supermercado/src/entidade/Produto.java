package entidade;

public class Produto {
	
	public double preco;
	public String nome;
	public int quantidade;
	
	      public double valorTotaleStoque() {
	    	  return preco * quantidade;
	    	  
	      }
          public void adcproduto(int quantidade) {
        	  this.quantidade += quantidade;
        	  
          }
          
          public void removerproduto(int quantidade) {
        	  this.quantidade -= quantidade;
          }
}
