package listaCincoQuestaoOito;

public class Main {

	public static void main(String[] args) {
		ContaBancaria p = new ContaPoupanca();
		ContaBancaria c = new ContaCorrente();

		p.depositar(1000);
		c.depositar(1000);

		System.out.println("Rendimento Poupança: " + p.calcularRendimento());
		System.out.println("Rendimento Corrente: " + c.calcularRendimento());

	}

}
