package listaCincoQuestaoOito;

public abstract class ContaBancaria {
	protected double saldo;

	public void depositar(double valor) {
		saldo += valor;
	}

	public abstract double calcularRendimento();
}
