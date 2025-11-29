package listaCincoQuestaoDez;

public class CartaoDeCredito extends Transacao implements MeioDePagamento {

	public CartaoDeCredito(double valor) {
		super(valor);
	}

	@Override
	public void pagar() {
		System.out.println("Pagando com cartão de crédito: R$" + valor);
	}

	@Override
	public void executarTransacao() {
		pagar();
	}
}
