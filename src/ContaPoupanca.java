
public class ContaPoupanca extends Conta {

	private Double txCorrecao;

	public Double getTxCorrecao() {
		return txCorrecao;
	}

	public void setTxCorrecao(Double txCorrecao) {
		this.txCorrecao = txCorrecao;
	}
	
	public void atualizaSaldoRendimento() {
		// Lógica para atualizar o saldo
	}

	@Override
	public Conta abrirConta() {
		return new ContaPoupanca();
	}
}
