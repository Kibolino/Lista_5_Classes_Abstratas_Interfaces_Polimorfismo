package listaCincoQuestaoCinco;

public class Empregado extends Pessoa implements Pagavel {
	private double salario;

	public Empregado(String nome, String documento, double salario) {
		super(nome, documento);
		this.salario = salario;
	}

	@Override
	public double calcularPagamento() {
		return salario;
	}
}
