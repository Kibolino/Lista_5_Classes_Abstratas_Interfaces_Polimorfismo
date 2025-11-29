package listaCincoQuestaoCinco;

public class Main {

	public static void main(String[] args) {
		Pagavel e = new Empregado("João", "123", 3000);
		Pagavel f = new Fornecedor("Empresa", "456", 1500);

		Pagavel[] lista = { e, f };

		for (Pagavel p : lista) {
			System.out.println("Pagamento: " + p.calcularPagamento());

		}
	}
}
