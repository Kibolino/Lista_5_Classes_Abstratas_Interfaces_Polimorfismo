package listaCincoQuestaoCinco;

public class Fornecedor extends Pessoa implements Pagavel {
	private double valorServico;

	public Fornecedor(String nome, String documento, double valorServico) {
		super(nome, documento);
		this.valorServico = valorServico;
	}

	@Override
	public double calcularPagamento() {
		return valorServico;
	}
}
