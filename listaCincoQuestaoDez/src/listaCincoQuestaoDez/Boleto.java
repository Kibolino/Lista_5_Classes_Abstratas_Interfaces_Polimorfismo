package listaCincoQuestaoDez;

public class Boleto extends Transacao implements MeioDePagamento {

	public Boleto(double valor) {
		super(valor);
	}

	@Override
	public void pagar() {
		System.out.println("Pagando com boleto: R$" + valor);
	}

	@Override
	public void executarTransacao() {
		pagar();
	}
}
