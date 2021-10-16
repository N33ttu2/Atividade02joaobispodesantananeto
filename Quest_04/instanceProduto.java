package Quest_04;
public class instanceProduto {
    public static void main(String[] args) {
		
		Produto Skol = new Produto(null, 0, null, 0);
		
		Skol.setNome("Skol");
		Skol.setPreco(12);
		Skol.setQtd(10);
		
		System.out.println(Skol.getNome() + " " + Skol.getPreco() + "R$" );
		Skol.comprar(1);
		System.out.println("Quantidade em estoque: " + Skol.getQtd());
		Skol.comprar(1);
		System.out.println("Quantidade em estoque: " + Skol.getQtd());
		Skol.comprar(9);
		System.out.println("Quantidade em estoque: " + Skol.getQtd());
		
		

	}
    
}
