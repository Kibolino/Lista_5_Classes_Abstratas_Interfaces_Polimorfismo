package listaCincoQuestaoOito;

public class ContaPoupanca extends ContaBancaria {

	@Override
	public double calcularRendimento() {
		return saldo * 0.05;
	}
}
