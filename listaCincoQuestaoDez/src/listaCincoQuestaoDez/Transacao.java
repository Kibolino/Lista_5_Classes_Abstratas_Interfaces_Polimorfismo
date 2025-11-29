package listaCincoQuestaoDez;

public abstract class Transacao {
	protected double valor;

	public Transacao(double valor) {
		this.valor = valor;
	}

	public abstract void executarTransacao();
}
