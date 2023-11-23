package desafio5;

public class Principal {

	public static void main(String[] args) {
		Livro livro = new Livro ("Once upon a broken heart", "num lembro", 500);
		
		System.out.println("---LIVRO---");
		System.out.println("NOME: " + livro.getNome());
		System.out.println("\nAUTOR: " + livro.getAutor());
		System.out.println("\nPÁGINAS: " + livro.getPaginas());

	}

}
