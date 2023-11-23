package avaliacaoSomativa;

public class Principal {

	public static void main(String[] args) {
		Pedido pedido = new Pedido (2, "Celular", 1);
		
		System.out.println("---PEDIDO---");
		System.out.println("\nID: " + pedido.getId());
		System.out.println("\nID: " + pedido.getProduto());
		System.out.println("\nQuantidade: " + pedido.getQuantidade());

	}

}
